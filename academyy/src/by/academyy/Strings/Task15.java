package by.academyy.Strings;

import java.util.Scanner;

// Условие здачи: ввести 2 слова, состоящие из четного числа букв.
//Получить слово состоящее из первой половины первого слова и второй половины второго слова.

public class Task15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 words");
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		String str3 = (str1.substring(0, str1.length() / 2)) + (str2.substring(str2.length() / 2, str2.length()));

		System.out.println(str3);

	}

}
