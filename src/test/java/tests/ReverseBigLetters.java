package tests;

public class ReverseBigLetters {
	public static void main(String[] args) {
		String s = "This is Vignesh";

		char[] charArray = s.toCharArray();
		char[] reverse = new char[charArray.length];

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == ' ') {
				reverse[i] = ' ';
			}
		}

		int j = reverse.length -1 ;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != ' ') {
				if (reverse[j] == ' ') {
					j--;
				}
				reverse[j] = charArray[i];
				j--;
			}

		}
		
		System.out.println(new String(reverse));

	}

}