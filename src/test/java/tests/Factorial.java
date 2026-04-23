package tests;

import java.security.PublicKey;

public class Factorial {

	public static void main(String[] args) {

		int input = 10;

		int result = 1;

		for (int i = 1; i <= input; i++) {
			result = result * i;

		}

		System.out.println(result);

	}

}
