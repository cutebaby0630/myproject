package com.java2.object;

import java.util.Random;

public class PokerShuffle {

	Random random = new Random();
	int[] cards = new int[52];
	String flowers = "♠♥♦♣";

	public PokerShuffle() {
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i;
			System.out.println((i % 13) + 1 + "" + (flowers.charAt(i / 13)));
		}
	}

	public void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int j = random.nextInt(52);
			// card[i]<->card[j]
			int tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	public void print() {
		for (int i=0;i<cards.length;i++) {
			int a= cards[i];
			System.out.println((a % 13) + 1 + "" + (flowers.charAt(a / 13)));
		}
	}
}
