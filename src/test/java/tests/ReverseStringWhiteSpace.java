package tests;

import java.util.Iterator;

public class ReverseStringWhiteSpace {

	public static void main(String[] args) {

		String name = "Vignesh Bala";
		String reverse = "";
		char[] charArray2 = name.toCharArray();

		String[] split = name.split(" ");

		for (int i = 0; i < split.length; i++) {

			char[] charArray = split[i].toCharArray();

			for (int j = charArray.length-1; j >= 0; j--) {
				
				reverse = reverse+charArray[j];
			}
		}
		
		
		System.out.println(reverse.replace("Va", "V a"));

	}

}
