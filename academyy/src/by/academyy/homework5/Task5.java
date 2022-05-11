package by.academyy.homework5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Имеется текст. Следует составить для него частотный словарь:
//Создать Map<Character, Integer> для символов, в который мы заносим символ и его количество.

public class Task5 {

	public static void main(String[] args) {
		Map<Character, Integer> symbols = new HashMap<>();

		Scanner scan = new Scanner(System.in);
		System.out.println("Пожалуйста, введите строку:");
		String str = scan.nextLine();
		System.out.println("Общая длина строки: " + str.toCharArray().length);

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (symbols.get(ch) != null) {
				symbols.put(ch, symbols.get(ch) + 1);
			} else {
				symbols.put(ch, 1);
			}
		}

		System.out.println(symbols);
	}

}
