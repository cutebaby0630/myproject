package com.ibm;

import java.util.Random;

public class DiceSame {

	public static void main(String[] args) {
		Random r = new Random();
		int m=-1;
		while(m!=0) {
			int n1 = r.nextInt((6) + 1);
			int n2 = r.nextInt((6) + 1);
			int n3 = r.nextInt((6) + 1);
			int n4 = r.nextInt((6) + 1);
			if(n1!=n2&&n1!=n3&&n1!=n4&&n2!=n3&&n2!=n4&&n3!=n4) {
				System.out.println(n1 + "\t" + n2 + "\t" + n3 + "\t" + n4 + "\t");
				
			}else {
				System.out.println(n1 + "\t" + n2 + "\t" + n3 + "\t" + n4 + "\t");
				m = 0;
			}
		}
		
		
		
		
		
	}

}
