package tests;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String v = "Vignesh";
		char[] charArray = v.toCharArray();
		
		LinkedList<Character> list = new LinkedList<>();
		
		for(Character c:charArray) {
			list.add(c);
		}
		
		Collections.reverse(list);
		
		ListIterator<Character> lh = list.listIterator();
		
		while(lh.hasNext()) {
			System.out.print(lh.next());
		}
		
		
		
		
		
	}

}
