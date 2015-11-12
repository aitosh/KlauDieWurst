package com.example.klaudiewurst;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class JoyStickMotion implements OnTouchListener {

	public boolean dragging = false;
	private Bitmap joyStick;
	private Bitmap joyStickBg;
	private Point joyStickBgPos;
	private PaintClass paintClass;
	private MotionEvent lastEvent;
	public Point touchingPoint  = new Point(0,0);
	public double angle = 0;
	public JoyStickMotion (Bitmap joyStick, Bitmap joyStickBg, Point joyStickBgPos, PaintClass paintClass){
		this.joyStick = joyStick;
		this.joyStickBgPos = joyStickBgPos;
		this.joyStickBg = joyStickBg;
		this.paintClass = paintClass;
				
	}
	
	@Override
	public boolean onTouch(View v, MotionEvent event){
		update(event);
		return true;
	}
	
	public void update(MotionEvent event){
		
		if (event == null && lastEvent == null){
			return;
		}
		else if (event == null && lastEvent != null){
			event = lastEvent;
		} else{
			lastEvent = event;
		}
		//dragging
		if(event.getAction() == MotionEvent.ACTION_DOWN){
			dragging = true;
		}else if (event.getAction() == MotionEvent.ACTION_UP){
			dragging = false;
		}
		if(dragging){
			
			touchingPoint.x = (int) event.getX();
			touchingPoint.y = (int) event.getY();
			
			//bound to a Box
			if(touchingPoint.x < joyStickBgPos.x){
				touchingPoint.x = joyStickBgPos.x;
			}
			if(touchingPoint.x > joyStickBgPos.x + joyStickBg.getWidth()){
				touchingPoint.x =  joyStickBgPos.x + joyStickBg.getWidth();
			}
			if(touchingPoint.y < joyStickBgPos.y){
				touchingPoint.y = joyStickBgPos.y;
			}
			if(touchingPoint.y > joyStickBgPos.y + joyStickBg.getHeight()){
				touchingPoint.y = joyStickBgPos.y + joyStickBg.getHeight();
			}
			
			//get the angle
			angle = Math.atan2(touchingPoint.y - (joyStickBgPos.y + joyStickBg.getHeight()/2)  , touchingPoint.x - (joyStickBgPos.x +joyStickBg.getHeight()/2)) / (Math.PI /180);
		
			paintClass.joyStickPos = touchingPoint;
			
			
		}
		else if(!dragging){
			touchingPoint.x = (int) (joyStickBgPos.x + joyStickBg.getWidth()/2);
			touchingPoint.y = (int) (joyStickBgPos.y + joyStickBg.getHeight()/2);
			paintClass.joyStickPos = touchingPoint;
		}	
			
		
	}

	}
	

