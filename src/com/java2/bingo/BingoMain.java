package com.java2.bingo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//讀取bingo.txt，資料如下:
//	25
//	8,4,7,18,21,3,5,1,9,10
//	
//	25代表有5x5共25顆球，產生時就給亂數排列並印出來
//	如下:
//		5 10 11 8 25 
//		13 6 21 4 1 
//		22 15 23 19 7
//		2 20 18 3 14
//		17 9 12 24 16
//	判斷是否有號碼用迴圈
public class BingoMain {

	public static void main(String[] args) {
		Random r = new Random();
		int list[] = new int[25+1];
			for(int i=1; i<=25;i++) {
				list[i]= i;			
		}
			for (int i = 0; i < list.length; i++) {
				int j =r.nextInt((25)+1);
				// card[i]<->card[j]
				int tmp = list[i];
				list[i] = list[j];
				list[j] = tmp;
			}
		for (int i =1; i <=list.length ; i++){
			int y = list[i];
			if(i%5==0) {
				System.out.println(y);
			}else {
				System.out.print(y +"\t");
			}

		}
				
	}
	

	
}
