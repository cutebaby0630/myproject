package com.ibm;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		for(int n =1 ;n<11;n++){
		Random r = new Random();
		int n1 = r.nextInt(6)+1;
		int n2 = r.nextInt(6)+1;
		int n3 = r.nextInt(6)+1;
		int n4 = r.nextInt(6)+1;
		if(n1!=n2&&n1!=n3&&n1!=n4&&n2!=n3&&n2!=n4&&n3!=n4){
			System.out.println( (n1+" "+n2+" "+n3+" "+n4)+"*");
		}else{
			System.out.println(n1+" "+n2+" "+n3+" "+n4);
		}
			
		}
	}

}
