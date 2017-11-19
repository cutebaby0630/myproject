package com.cutebaby;

import java.util.Random;

public class DiceRoller {

	public static void main(String[] args) {
		Random r = new Random();
		boolean a =true;
		int n;
		
		
			for (n = 1; n <= 3; n++) {
				System.out.print(r.nextInt(10) + 1 + " ");
					for(int j=0;j<n;j++){
					 if(r.nextInt(10) + 1==r.nextInt(10) + 1){
						 n--;
						 break;
					 }
				}

			}
	}

}
