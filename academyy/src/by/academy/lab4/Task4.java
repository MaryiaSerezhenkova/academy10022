package by.academy.lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Программа обработки текста, который может быть получен как с консоли, так и с файла.
//Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами. Между последовательностями подряд идущих букв оставить хотя бы один пробел.
public class Task4 {

	public static void main(String[] args) {
		removeSymb();
//              File file = new File("src\\Words.txt");
//              String s = "PAram 3344 ??!!  pammm** amp&& paam!!))) abnbnb!";
//              System.out.println(getText(s));
	}

	public static void removeSymb() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter text");
			String text = scan.nextLine();
			System.out.println(getText(text));

		}
	}

	public static void removeSymb(File f) {
		String text = "";
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			while ((text = br.readLine()) != null) {
				getText(text);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getText(String text) {
		StringBuilder newText = new StringBuilder();
		text = text.replaceAll("[\\W, \\d]", "s");
		char[] symb = text.toCharArray();
		for (int i = 1; i < symb.length; i++) {
			newText.append(symb[i-1]);
			if (symb[i] == symb[i -1]) {
				newText.append(' ');
			}
		
		}
		;
		newText.append(symb[symb.length - 1]);

		return newText.toString();
	}
//          public static String getLetters (String text) {
//              StringBuilder sb = new StringBuilder();
//              Pattern letters = Pattern.compile("a-zA-Z, \\s");
//              Matcher matcher = letters.matcher(text);
//              for (char c : text.toCharArray()){
//                  while (matcher.find()) {
//                      sb.append(c);
//                  }
//              }
//              return sb.toString();
//              
//          }
}
