package com.cutebaby;

import java.util.Random;
import java.util.Scanner;

public class Lucky {

	public static void main(String[] args) {
		System.out.println("請輸入1到10中一個數字");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int a = Integer.parseInt(line);
		boolean lucky = true;

		Random r = new Random();
		int n,m;
		for (n = 1; n <= 6; n++) {
			System.out.print(r.nextInt(10) + 1 + " ");
		}
		
		if(a % r.nextInt(10) + 1 !=0){
			
				lucky = false ;
				
					
		}if(a % r.nextInt(10) + 1 ==0){
			lucky = true;
		}
		if (lucky) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}


	}


