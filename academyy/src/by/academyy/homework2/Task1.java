package by.academyy.homework2;

import java.util.Scanner;

public class Task1 {
	// Ввести две строки с консоли.
	// Определить, является ли одна строка перестановкой символов другой строки.
	// Учитываем регистр. Не использовать сортировку :)
	public static void main(String... args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two strings: ");

		String number1 = sc.nextLine();

		String number2 = sc.nextLine();
		sc.close();

		if (number1.length() != number2.length()) {

			System.out.println(false);
		}

		char[] n1 = number1.toCharArray();
		char[] n2 = number2.toCharArray();
		int sum = 0;
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1.length; j++) {
				if (n1[i] == n2[j]) {
					sum += 1;
					break;
				}

			}
		}

		if (sum == n1.length) {
			System.out.println("True");
		} else {
			System.out.println("False");

			
		}
		

	}
	
}
