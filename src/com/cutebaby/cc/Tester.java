package com.cutebaby.cc;

import java.util.Random;

public class Tester {

	public static void main(String[] args) {
			int N = 9; 
			Random r = new Random();
	        int a[]  = new int[N + 1]; 

	       
	        for(int i = 1; i <= N; i++) 
	            a[i] = i; 

	       
	        for(int i = 1; i <= N; i++) { 
	            int j = (int) (r.nextInt(10));

	            

	            int tmp = a[i]; 
	            a[i] = a[j]; 
	            a[j] = tmp; 
	        } 
	        for(int p:a) {
	        	System.out.print(a[p]+"\t");
	        }
	        
	        } 
	    } 
	