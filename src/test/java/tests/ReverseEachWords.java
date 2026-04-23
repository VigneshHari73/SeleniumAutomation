package tests;

import java.util.Iterator;

public class ReverseEachWords {
	
	public static void main(String[] args) {
		String in = "Bala Vignesh";
		String reverse;
		
		String[] split = in.split(" ");
		
	for(int i =0;i < split.length;i++) {
		
		split[i] = new StringBuilder(split[i]).reverse().toString();
	}
	
	reverse = String.join(" ", split);
	
	System.out.println(reverse);
}}
