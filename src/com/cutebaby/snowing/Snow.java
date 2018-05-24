package com.cutebaby.snowing;
import java.awt.Canvas;
//寫snow建構子，做好初始化，呼叫後就可以直接使用。x直接設定好。
import java.util.Random;

public class Snow extends Thread {
	Random random = new Random();
	int x;
	int y = 800;
	private Canvas canvas;

	public Snow(Canvas canvas) {
		x = random.nextInt(600);
		y = random.nextInt(800);
		this.canvas = canvas;
	
	}

	

	@Override
	public void run() {
		for (int i = 0; i < 800; i++) {
//			System.out.println(getName() + ":(" + x + "," + y + ")");
			y=y+1;
			int movement = random.nextInt(3)-1;
			x=x-movement;
			try {
				sleep(50);
				canvas.repaint();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			System.out.print(new String(new char[x]).replace("\0", " "));
//			System.out.println("*");
		}
	}

}
