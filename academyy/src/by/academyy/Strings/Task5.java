package by.academyy.Strings;
//Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского 

//алфавита, а среди них – количество слов с равным числом гласных и согласных букв.

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		String[] text = { "hello", "vfr3", "test", "abce", "lalala" };

		int numWordsWithEqualLetters = 0;
		
			for (String word : text) { // разделили строку на слова и делаем проход по словам
				int countEngLetters = 0;
				int balance = 0;
				for (Character letter : word.toCharArray() // побуквенно бежим по слову
				) {
					if (((letter >= 'A') && (letter <= 'Z')) || ((letter >= 'a') && (letter <= 'z'))) {
						countEngLetters++;
						if ((letter == 'A') || (letter == 'E') || (letter == 'I') || (letter == 'O') || (letter == 'U')
								|| (letter == 'Y') || (letter == 'a') || (letter == 'e') || (letter == 'i')
								|| (letter == 'o') || (letter == 'u') || (letter == 'y'))
							++balance;
						else
							--balance;
					}
				}
				if (countEngLetters == word.length()) { // проверяем, всё ли слово английское
					// System.out.println("english word");
					if (balance == 0) { // проверяем, есть ли "баланс букв" }
						++numWordsWithEqualLetters;
						// System.out.println(nowWord + " this word ia our word!");
					}
				}

			}
			System.out.println(numWordsWithEqualLetters);

		}
	}


