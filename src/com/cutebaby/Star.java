package com.cutebaby;

public class Star {

	public static void main(String[] args) {
		int i = 7;
		int k = 7;
		int Line = 7;

		for (i = 0; i < Line; i++) {
			for (k = (((Line - i) * 2) - 1); k >= 1; k--) {
				System.out.print("#");
			}
			for (k = 0; k <= 2 * i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
