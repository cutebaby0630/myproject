package com.cutebaby.snowing;
//寫snow建構子，做好初始化，呼叫後就可以直接使用。x直接設定好。
import java.util.Random;

public class Snow extends Thread {
	Random random = new Random();
	int x;
	int y = 800;

	public Snow() {
		x = random.nextInt(600);

	}

	@Override
	public void run() {
		for (int i = 800; i > 0; i--) {
//			System.out.println(getName() + ":(" + x + "," + y + ")");
			y=y-1;
			int movement = random.nextInt(3)-1;
			x=x-movement;
			System.out.print(new String(new char[x]).replace("\0", " "));
			System.out.println("*");
		}
	}

}
