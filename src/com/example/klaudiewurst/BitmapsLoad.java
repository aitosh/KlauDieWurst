package com.example.klaudiewurst;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.SurfaceView;

public class BitmapsLoad extends SurfaceView {

	private Bitmap[] mouseRun = new Bitmap[64];
	private Bitmap[] mouseWalk = new Bitmap[64];
	private Bitmap[] mouseStands = new Bitmap[8];
	public BitmapsLoad(Context context){
		super(context);
		for (int i = 0; i< mouseRun.length; i++){
			mouseRun[i] = BitmapFactory.decodeResource(getResources(), R.drawable.joystick);
			mouseWalk[i] = BitmapFactory.decodeResource(getResources(), R.drawable.joystick);
		}
		for(int i = 0; i < mouseStands.length; i++){
			mouseStands[i] = BitmapFactory.decodeResource(getResources(), R.drawable.joystick);
		}
		
	}
	public Bitmap getMouseRun(int i) {
		return mouseRun[i];
	}
	public void setMouseRun(Bitmap[] mouseRun) {
		this.mouseRun = mouseRun;
	}
	public Bitmap getMouseWalk(int i) {
		return mouseWalk[i];
	}
	public void setMouseWalk(Bitmap[] mouseWalk) {
		this.mouseWalk = mouseWalk;
	}
	public Bitmap getMouseStands(int i) {
		return mouseStands[i];
	}
	public void setMouseStands(Bitmap[] mouseStands) {
		this.mouseStands = mouseStands;
	}
}
