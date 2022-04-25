package by.academyy.Cycles;
//В ЭВМ вводятся по очереди данные о росте N учащихся класса. Определить средний рост учащихся класса.

import java.util.Scanner;

public class Task17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int allHeigth = 0;

		System.out.println("Enter number of pupils");
		int N = scanner.nextInt();

		for (int i = 0; i < N; i++) {

			System.out.println("Enter heigth of pupil" + (i + 1));

			int heigth = scanner.nextInt();

			allHeigth += heigth;}
			double avH = allHeigth / N;

			System.out.println(avH);
		}
	}

