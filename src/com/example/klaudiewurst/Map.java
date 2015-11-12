package com.example.klaudiewurst;

import android.graphics.Point;

public class Map{

	private Tiles [][][] map;

	public Map(Point dimension) {
		map = new Tiles[dimension.x][dimension.y][2];

		for (int i = 0; i < dimension.x; i++) {
			for (int j = 0; j < dimension.y; j++) {
				if ((int)(Math.random()*10) < 5)
					map[i][j][0] = new Tiles(0);
				else
					map[i][j][0] = new Tiles(1);
			}
		}
	}

	public Tiles[][][] getMap() {
		return map;
	}

	public void setMap(Tiles[][][] map) {
		this.map = map;
	}
	
	
}
