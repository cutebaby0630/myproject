package com.cutebaby;

public class ScoreTester {

	public static void main(String[] args) {
		int score =41;
		int level = score/10;
		switch(level){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Failed");
			break;
		}
	}

}
