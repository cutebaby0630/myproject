package com.java2.threading;

public class Racing {

	public static void main(String[] args) {
		Horse h = new Horse();
		Horse h1 = new Horse();
		
		h1.start();
		h.start();
		
	}

}
