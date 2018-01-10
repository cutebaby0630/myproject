package com.cutebaby.cc;

public class Tester {

	public static void main(String[] args) {
		 final int N = 9; 
	        int[] poker = new int[N + 1]; 

	        // 初始化陣列 
	        for(int i = 1; i <= N; i++) 
	            poker[i] = i; 

	        // 洗牌 
	        for(int i = 1; i <= N; i++) { 
	            int j = (int) (Math.random() * N);

	            if(j == 0)
	                j = 1;

	            int tmp = poker[i]; 
	            poker[i] = poker[j]; 
	            poker[j] = tmp; 
	        } 

	        

	            // 撲克牌數字 
	            

	           
	        } 
	    } 
	