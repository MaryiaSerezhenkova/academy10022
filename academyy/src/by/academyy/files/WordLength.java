package by.academyy.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Напишите программу на Java, чтобы найти самое длинное слово в текстовом файле

public class WordLength {

	public static void main(String[] args) {

		findLongestWords("src/WordLength.txtmm");
	}

	public static String findLongestWords(String filename) {
		String longest_word = "";
		String current;
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			while ((current = br.readLine()) != null) {
				String word[] = current.split(" ");
				for (int i = 0; i < word.length; i++) {
					if (word[i].length() > longest_word.length()) {
						longest_word = word[i];
					}
				}
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println(
				"The longest word is <" + longest_word.toUpperCase() + ">(length" + longest_word.length() + ")");
		return longest_word;

	}
}
