   package com.java2.threading;

import java.util.ArrayList;
import java.util.List;

public class Horses {

	public static void main(String[] args) {
		List<Horse> horses = new ArrayList<Horse>();
		for (int i=0;i<8;i++){
			Horse h = new Horse();
			horses.add(h);
			h.start();
		}
	}

}