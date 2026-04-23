package tests;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import javax.print.attribute.HashAttributeSet;

public class OccuranceOfLetters {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("iNPTnUMBER");
		String nextInt = sc.nextLine();
		char[] cs = nextInt.toCharArray();
		LinkedHashMap<Character, Integer> hs = new LinkedHashMap<>();
		for (char c : cs) {
			if (hs.containsKey(c)) {
				hs.put(c, hs.get(c) + 1);
			} else {
				hs.put(c, 1);
			}
		}
		for (Map.Entry test : hs.entrySet()) {
			System.out.println(test.getKey() + " " + test.getValue());
		}

	}

}
