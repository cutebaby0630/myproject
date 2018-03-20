package com.java2.object;

public class ABNumber {
	String number;

	public ABNumber(String number) {
		this.number = number;
	}

	public int validate(String secret) {
		int result = 0;
		int length = secret.length();
		for (int j = 0; j < number.length(); j++) {
			char a = number.charAt(j);
			for (int i = 0; i < length; i++) {
				if (a == secret.charAt(i)) {
					if (i == j) {
						result = result + 10;
					} else {
						result = result + 1;
					}
					break;
				}

			}
		}
		return result;
	}
	
}
