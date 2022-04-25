package by.academyy.Strings;
//Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) 

//значений их длины.

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter string quantity");
		int n = scn.nextInt();
		String[] arr = new String[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter string" + (i + 1));
			arr[i] = scn.next();
		}

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
