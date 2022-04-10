package by.academyy.Cycles;

import java.util.Scanner;

//Составьте программу, которая вычисляет сумму квадратов чисел от 1 до введенного вами целого числа N.
public class Task14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;

		System.out.println("Enter your number");
		int N = scan.nextInt();
		while (N < 1) {
			System.out.println("Try again");
			N = scan.nextInt();
		}

		for (int i = 1; i <= N; i++) {
			sum = sum + i * i;
		}

		System.out.println(sum);

	}
}
