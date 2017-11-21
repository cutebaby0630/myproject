package com.cutebaby;

import java.util.Scanner;

public class Classpractice {

	public static void main(String[] args) {
		System.out.print("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		
		int i=1;
//		i為初始值
		while(i<=n){
//			while迴圈中()為判斷真假，初始值&累加值要另外加
			System.out.print(i +" ");
			i=i+1;
//			i累加
			if(i>10){
				break;
			}
		}
	}

}
