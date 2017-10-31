package com.cutebaby;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		System.out.println("請輸入數字:");
		Scanner scanner = new Scanner (System.in);
//		Scanner為讀取資料          
//		System.in 代表從系統中抓出剛剛輸入的字命名為scanner
		String line = scanner.nextLine();
//		取得輸入字命名為line，按enter後表示輸入完成
		int n = Integer.parseInt(line);
//		將line字串轉成整數n 
		if (n % 2 == 1){
//		if後面一定要(說明條件){條件達成要做的是}
			System.out.println("奇數");
		}else{
			System.out.println("偶數");
//		else為否則{否則條件達成做的事}
		}
	}
	}


