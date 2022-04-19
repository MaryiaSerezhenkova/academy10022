package by.academyy.homework2;

public class Task2New {
	public static void main(String[] args) {

		String[] arr = { "kitten", "bear", "abcabcb", "abc" };

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



