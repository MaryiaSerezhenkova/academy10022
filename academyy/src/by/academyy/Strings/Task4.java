package by.academyy.Strings;

import java.util.Scanner;

//Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. 
//Если таких слов несколько, найти первое из них.
public class Task4 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter string quantity");
//		int quantity = sc.nextInt();
//		String[] array = new String[quantity];

		String[] arr = { "hello", "alalal", "test", "abc" };

		int min = Integer.MAX_VALUE;
		for (String word : arr) {

			char[] cArray = word.toCharArray();
			int[] counterArray = new int[256];
			for (char c : cArray) {
				counterArray[c]++;
			}

			int counter = 0;
			for (int c : counterArray) {
				if (c > 0) {
					counter++;
				}
			}
			System.out.println(counter);
			if (counter < min) {
				min = counter;
			}
		}
		System.out.println("Min " +min );

		for (String word : arr) {
			char[] cArray = word.toCharArray();
			int[] counterArray = new int[256];
			for (char c : cArray) {
				counterArray[c]++;
			}

			int counter = 0;
			for (int c : counterArray) {
				if (c > 0) {
					counter++;
				}
			}
			if (min == counter) {
				System.out.println(word);
				break;
			}

		}

	}
}
