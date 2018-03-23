package com.java2.object;

public class PokerTester {

	public static void main(String[] args) {
		String flowers = "♠♥♦♣";
		PokerShuffle a = new PokerShuffle();
		a.shuffle();
		a.print();
	}

}
