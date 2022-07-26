package by.academy.lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//В каждом слове k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять.
//Программа обработки текста, который может быть получен как с консоли, так и с файла.

public class Task1 {

	public static void main(String[] args) {
	//	replaceSymb('X');
		File file = new File("src/studyJava");
		replaceSymbFromFile(file, 'X', 3);
	}

	public static void replaceSymb(char newSymb) throws IndexOutOfBoundsException {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter text");
			String text = scan.nextLine();
			System.out.println("Enter number 1-10");
			int k = scan.nextInt();
			if (k <= 0) {
				throw new IndexOutOfBoundsException("Error");
			} else {
				System.out.println(replaceSymb(text, newSymb, k));
			}
		}
	}

	public static void replaceSymbFromFile(File f, char newSymb, int k) throws IndexOutOfBoundsException {
		String text;
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			while ((text = br.readLine()) != null) {
				System.out.println(replaceSymb(text, newSymb, k));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String replaceSymb(String text, char newSymb, int k) {
		String words[] = text.split(" ");
		StringBuilder newText = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			if (k <= words[i].length()) {
				newText.append(words[i].substring(0, k - 1)).append(newSymb)
						.append(words[i].substring(k, words[i].length()));
			} else {
				newText.append(words[i]);
			}
			newText.append(" ");
		}

		return newText.toString();

	}
}
