package com.example.klaudiewurst;

import android.graphics.Bitmap;
import android.util.Log;

public class Animation {

	private BitmapsLoad bLoad;

	// Direction
	// 0 north
	// 1 east
	// 2 south
	// 3 west
	// 4 northeast
	// 5 southeast
	// 6 southwest
	// 7 northwest
	private int direction;

	// Movement
	// 0 stand
	// 1 walk
	// 2 run

	// Player
	// 0 mouse
	// 1 cat
	// ?
	private int player;

	private int movement;

	private int spriteCounter;

	public Animation(BitmapsLoad bLoad) {
		this.bLoad = bLoad;
		direction = 0;
		movement = 0;
		spriteCounter = 9;
		player = 0;
	}

	public Bitmap sprite(int player, int direction, int movement) {
		this.direction = direction;
		this.movement = movement;
		this.player = player;
		if (player == 0) {
			if (movement == 0) {
				spriteCounter = 0;
			} else {
				if (spriteCounter < 8)
					spriteCounter++;
				else
					spriteCounter = 0;
			}

			if (movement == 0) {
				return bLoad.getMouseStands(direction);
			} else if (movement == 1) {
				
				return bLoad.getMouseWalk(direction*9 + spriteCounter);
			} else {
				return bLoad.getMouseRun(direction*9 + spriteCounter);
			}
			
		}
		return null;
	}
}
