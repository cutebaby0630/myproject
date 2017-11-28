package com.cutebaby;

public class Replase {

	public static void main(String[] args) {
		// {51,23,6,65,15}由小到大排序
		int n[] = { 51, 23, 6, 65, 15 };
		for (int i = 0; i <= n.length; i++) {
			for (int j = (i + 1); j <= n.length; j++) {
				if (n[i] > n[j]) {
					int tmp = n[i];
					n[i]=n[j];
					n[j]=tmp;
					continue;
				} else{
					System.out.print(n[i] + " ");
					break;
					
				}
				
			}
				
				
			
		}

	}

}
