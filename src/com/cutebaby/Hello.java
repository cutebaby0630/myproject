package com.cutebaby;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("請輸入你的名字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		System.out.println("Hello," + line);
		
		System.out.println("你幾歲哇?");
		line = scanner.nextLine();
		int age = Integer.parseInt(line);
//		把字串line轉成 正整數int
		System.out.println(age);
		System.out.println(age < 25);
//	           輸入的age是否小於25
				
	}

}
