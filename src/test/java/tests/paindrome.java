package tests;

import java.util.Iterator;

public class paindrome {
	
	public static void main(String[] arg) {
		
		
		String input = "MALAYALAM";
		char[] ch = input.toCharArray();
		String reverse = "";
		
		
		for(int i = ch.length-1;i >= 0;i--) {
			
			reverse = reverse +ch[i];
		}
		
		System.out.println(reverse);
	}

}
