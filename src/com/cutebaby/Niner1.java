package com.cutebaby;

public class Niner1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int n = 2; n <= 5; n++) {
				System.out.print(n + "x" + i + "=" + (i * n) + "\t");
			}
			System.out.println();
//			第二個迴圈執行完跳行，回到第一個迴圈
			/*
			 * if (n % 5 == 0) { 
			 * System.out.println(); 
			 * 運算5的算式後跳行
			 */
		}

	}
}
