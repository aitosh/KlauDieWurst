package com.example.klaudiewurst;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.SurfaceView;

public class GameJoystick extends SurfaceView {
	
	private Bitmap joystick;
	private Bitmap joystickBg;
	private Bitmap trigger;
	private Bitmap triggerDown;
	
	public Bitmap get_triggerDown() {
		return triggerDown;
	}

	public void set_triggerDown(Bitmap triggerDown) {
		this.triggerDown = triggerDown;
	}

	public GameJoystick(Context context){
		super(context);
		joystick = BitmapFactory.decodeResource(getResources(), R.drawable.joystick);
		joystickBg = BitmapFactory.decodeResource(getResources(), R.drawable.joystick_bg);
	}

	public Bitmap get_joystick() {
		return joystick;
	}

	public void set_joystick(Bitmap joystick) {
		this.joystick = joystick;
	}

	public Bitmap get_joystickBg() {
		return joystickBg;
	}

	public void set_joystickBg(Bitmap joystickBg) {
		this.joystickBg = joystickBg;
	}
	
	public Bitmap get_trigger() {
		return trigger;
	}

	public void set_trigger(Bitmap trigger) {
		this.trigger = trigger;
	}
}