package tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaing {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("Book1.csv"));
		String line;
		while ((line = bf.readLine()) != null) {

			String[] split = line.split(",");
			for (String string : split) {
				System.out.print(string + "|");
			}
			System.out.println();
		}

	}

}
