package com.cutebaby;

import java.util.Scanner;

public class Chose {

	public static void main(String[] args) {
		System.out.println("以下誰的年紀最大？" + " " + "1.周杰倫" + " " + "2.華晨宇" + " " + "3.梁朝偉");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int a = Integer.parseInt(line);
		
		
		if(a==3) {
		System.out.println("答對了");

	}else {
		System.out.println("答錯囉");
	}

	}
}