package com.cutebaby.snowing;

import java.awt.Canvas;
import java.util.ArrayList;
import java.util.List;

//題目:   設計Snow類別代表一顆雪x,y,Thread降落飄 


public class SnowTester {

	public static void main(String[] args) {
		List<Snow> snows = new ArrayList<>();
		for(int i=0;i<100;i++){
			Canvas canvas = null;
			Snow snow = new Snow(canvas);
			snow.start();
			snows.add(snow);
		}
			}

}
