package com.cutebaby;

public class Continue {

	public static void main(String[] args) {
		// for迴圈，不印出3的倍數
		for (int i = 1; i <= 13; i++) {
			if (i % 3 == 0) {
				continue;
				// continue執行後，跳回for迴圈i++
			}
			System.out.print(i + " ");
		}
		System.out.println("");
		// while迴圈
		int a =1;
		while(a<=13){
			System.out.print(a + " ");
			a++;
			if(a%3==0){
				a++;
				continue;
			}
		}
		}

	

}
