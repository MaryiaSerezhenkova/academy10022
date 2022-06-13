package by.academyy.Strings;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Задача на рекурсию:
//Даны два целых числа A и В. Выведите все числа от A до B включительно, в порядке возрастания, если A < B,
//или в порядке убывания в противном случае. Использовать рекурсию.
public class Recursion {
	public static void main(String[] args) {
		Random rand = new Random();
		int A = rand.nextInt(20);
		int B = rand.nextInt(20);
		System.out.println(A);
		System.out.println(B);
		printNumbers(A, B);

//		int[] numb = new int[Math.abs(B - A) + 1];
//		for (int i = 0; i < numb.length; i++) 
//			if (A < B) {
//				numb[i] = A + i;
//
//			} else {
//				numb[i] = A - i;
//			}
//		}
//		System.out.println(Arrays.toString(numb));
//	}
	}

	public static void printNumbers(int A, int B) {
		int i = 0;
		i++;
		while (A < B) {
			A = A + i;
			System.out.println(A);
		}
		while (B < A) {
			A = A - i;
			System.out.println(A);
		}
		if (i == Math.abs(B - A)) {
			return;

		}
	}

}
