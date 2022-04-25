package by.academyy.Strings;
//Ввести n слов с консоли. Найти слово, состоящее только из различных символов. 

//Если таких слов несколько, найти первое из них.

public class Task7 {
	public static void main(String[] args) {
		String[] arr = { "hello", "efg", "alalal", "test", "abc" };
		int dif = 0;
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
			if (counter == cArray.length) {
				dif = counter;
				System.out.println(word);
				break;
			}
		}

	}
}
