package by.academyy.Strings;
//8. Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром. 

//Если таких слов больше одного, найти второе из них.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String text = scan.nextLine();
		int countPalindromeNum = 0;
		String neededPalindrome = null;
		{
			for (String word : text.split(" ", n)) {
				Pattern isItNumber = Pattern.compile("\\d+");
				Matcher mIsItNumber = isItNumber.matcher(word);
				if (mIsItNumber.find()) {
					// System.out.println(word);
					if (word.equals(new StringBuilder(word).reverse().toString())) {
						countPalindromeNum++;
						if (countPalindromeNum == 1)
							neededPalindrome = word;
						else if (countPalindromeNum == 2)
							System.out.println(word);
					}
				}
			}
			if (countPalindromeNum == 0)
				System.out.println("NOT FOUND");
			if (countPalindromeNum == 1)
				System.out.println(neededPalindrome);
		}
	}
}
