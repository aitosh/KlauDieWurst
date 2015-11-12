package com.example.klaudiewurst;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Point;

public class GameLoop extends Thread {
	private PaintClass paintClass;
	private boolean isRunning = false;
	static final long FPS = 20;
	private JoyStickMotion joyStickMotion; 
	private Point joyStickPos;
	
	public GameLoop(PaintClass paintClass, JoyStickMotion jSM, Point jSP) {
		this.paintClass = paintClass;
		joyStickMotion = jSM;
		joyStickPos = jSP;
	}

	public void setRunning(boolean run) {
		isRunning = run;
	}

	@SuppressLint("WrongCall")
	@Override
	public void run() {
		long TPS = 1000 / FPS;
		long startTime, sleepTime;
		while (isRunning) {
			startTime = System.currentTimeMillis();
			
			if(joyStickMotion.touchingPoint.x != 0 || joyStickMotion.touchingPoint.y != 0){
				if(joyStickMotion.touchingPoint.x != joyStickPos.x || joyStickMotion.touchingPoint.y != joyStickPos.y){
					paintClass.screenPositionOnMap.y += Math.sin(joyStickMotion.angle * (Math.PI / 180))*(joyStickMotion.touchingPoint.x/70)*5;
					paintClass.screenPositionOnMap.x += Math.cos(joyStickMotion.angle * (Math.PI / 180))*(joyStickMotion.touchingPoint.x/70)*5;
					
				}
			}
				Canvas theCanvas = null;
				try {
					theCanvas = paintClass.getHolder().lockCanvas();
					synchronized (paintClass.getHolder()) {
						paintClass.onDraw(theCanvas);
					}
				} finally {
					if (theCanvas != null) {
						paintClass.getHolder().unlockCanvasAndPost(theCanvas);
					}
				
			} 
				
			sleepTime = TPS - (System.currentTimeMillis() - startTime);
			
				try {
					if (sleepTime > 0)
						sleep(sleepTime);
					else
						sleep(100);
				} catch (Exception e) {

				}
			}
		}

	}

