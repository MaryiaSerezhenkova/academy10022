package by.academy.lab4;
//Программа обработки текста, который может быть получен как с консоли, так и с файла.

//В тексте слова заданной длины заменить указанной подстрокой, длина которой может не совпадать с длиной слова.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		File file = new File("src/studyJava");
		// newText("HOLA", 3);
		newText(file, "HELLO", 3);
	}

	public static void newText(String s, int length) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter text");
			String text = scan.nextLine();
			System.out.println(replaceStr(text, s, length));
		}
	}

	public static void newText(File f, String s, int length) {
		String text;
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			while ((text = br.readLine()) != null) {
				System.out.println(replaceStr(text, s, length));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String replaceStr(String text, String s, int length) {
		StringBuilder newText = new StringBuilder();
		String words[] = text.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() == length) {
				words[i] = s;
				newText.append(s);
			} else {
				newText.append(words[i]);
			}
			newText.append(" ");
		}
		return newText.toString();

	}
}
