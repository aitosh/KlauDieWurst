package com.example.klaudiewurst;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;

@SuppressLint("ClickableViewAccessibility")
public class PaintClass extends SurfaceView {

	private SurfaceHolder surfaceHolder;
	private GameLoop theGameLoopThread;
	private GameJoystick theGameJoystick;
	private JoyStickMotion joyStickMotion;
	public Point joyStickPos;
	private Point joyStickBgPos;
	private Bitmap groundFloor;
	private Bitmap groundFloor2;
	public Point screenPositionOnMap;
	private Map map;
	private Point mapSize;
	private Point displaySize;

	@SuppressLint("WrongCall")
	public PaintClass(Context context, Point displaySize) {
		super(context);
		this.displaySize = displaySize;
		
		theGameJoystick = new GameJoystick(context);
		mapSize = new Point(30, 30);
		map = new Map(mapSize);
		groundFloor = BitmapFactory.decodeResource(getResources(), R.drawable.boden_kachel);
		groundFloor2 = BitmapFactory.decodeResource(getResources(), R.drawable.boden_kachel2);
		joyStickBgPos = new Point(150, this.displaySize.y-220- theGameJoystick.get_joystickBg().getHeight());
		joyStickPos = new Point(joyStickBgPos.x + theGameJoystick.get_joystickBg().getWidth() / 2 ,
								joyStickBgPos.y + theGameJoystick.get_joystickBg().getHeight()/ 2);
		
		joyStickMotion = new JoyStickMotion (theGameJoystick.get_joystick(), theGameJoystick.get_joystickBg(), joyStickBgPos, this);
		
		setOnTouchListener(joyStickMotion);

		theGameLoopThread = new GameLoop(this, joyStickMotion, joyStickPos);
		
		screenPositionOnMap = new Point(0, 0);
		surfaceHolder = getHolder();
		surfaceHolder.addCallback(new SurfaceHolder.Callback() {

			public void surfaceDestroyed(SurfaceHolder holder) {
				boolean retry = true;
				theGameLoopThread.setRunning(false);
				while (retry) {
					try {
						theGameLoopThread.join();
						retry = false;
					} catch (InterruptedException e) {

					}
				}

			}

			public void surfaceCreated(SurfaceHolder holder) {
				theGameLoopThread.setRunning(true);
				theGameLoopThread.start();
			}

			@Override
			public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
				// TODO Auto-generated method stub

			}

		});
	}

	@SuppressLint("DrawAllocation")
	@Override
	protected void onDraw(Canvas canvas) {
		// canvas.drawColor(0, Mode.CLEAR);
		joyStickMotion.update(null);
		canvas.drawColor(Color.argb(255, 0, 0, 0));
		Paint paint = new Paint();
		paint.setColor(Color.argb(255, 205, 38, 38));
		paint.setTextSize(100);
		paint.setTextSize(20);
		// Zeichnen des Bodens

		for (int i = 0; i < mapSize.x; i++) {
			for (int j = 0; j < mapSize.y; j++) {
				if (i * groundFloor.getWidth() >= screenPositionOnMap.x - groundFloor.getWidth() && groundFloor.getWidth() * i <= screenPositionOnMap.x + canvas.getWidth()
						&& j * groundFloor.getHeight() >= screenPositionOnMap.y - groundFloor.getHeight() && j * groundFloor.getHeight() <= screenPositionOnMap.y + canvas.getHeight()) {

					if (map.getMap()[i][j][0].getType() == 0) {
						canvas.drawBitmap(groundFloor, i * groundFloor.getWidth() - screenPositionOnMap.x, j * groundFloor.getHeight() - screenPositionOnMap.y, paint);
					} else {
						canvas.drawBitmap(groundFloor2, i * groundFloor.getWidth() - screenPositionOnMap.x, j * groundFloor.getHeight() - screenPositionOnMap.y, paint);
					}
				}
			}

		}
		canvas.drawBitmap(theGameJoystick.get_joystickBg(), joyStickBgPos.x, joyStickBgPos.y , paint);

		// draw the dragable joystick, coordinates minus half of the picture to both sides
		canvas.drawBitmap(theGameJoystick.get_joystick(), joyStickPos.x - theGameJoystick.get_joystick().getWidth()/2, joyStickPos.y -  theGameJoystick.get_joystick().getHeight()/2  , null);
		
		canvas.drawText("Position Stick Neutral: X: "+ joyStickPos.x + " Y: " + joyStickPos.y, 20, 20, paint);
		
	
	}
	
}