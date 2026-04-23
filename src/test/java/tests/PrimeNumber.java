package tests;

import java.util.Iterator;

public class PrimeNumber {

	public static void main(String[] args) {

		int input = 99;
		boolean isPrime = true;

		if (input <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= input / 2; i++) {
				if (input % i == 0) {
					isPrime = false;
					break;
				}

			}
		}

		if (isPrime) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");

		}
	}
}
