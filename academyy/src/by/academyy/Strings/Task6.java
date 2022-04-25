package by.academyy.Strings;
//6. Ввести n слов с консоли. Найти слово, символы в котором идут в строгом порядке 

//возрастания их кодов. Если таких слов несколько, найти первое из них.

import java.util.Arrays;

public class Task6 {
	public static void main(String[] args) {
		String[] text = { "hello", "efg", "alalal", "test", "abc" };
		int wordCount =0;
		
		for (String word : text) {

			char[] cArray = word.toCharArray();
			int count = 0;
			for (int i = 1; i < word.length(); i++) {
				if (word.toCharArray()[i] > word.toCharArray()[i - 1]) {
					count++;
				}
			}
			//System.out.println("Word = "+word+": count = "+count);
			if ((word.length() - 1 == count) && (word.length() > 1) && (wordCount == 0)) {
				System.out.println(word);
				wordCount++;
			}

		}
		if (wordCount == 0)
			System.out.println("NOT FOUND");
	}

}
