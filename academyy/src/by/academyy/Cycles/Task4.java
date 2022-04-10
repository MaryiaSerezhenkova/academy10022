package by.academyy.Cycles;

import java.util.Scanner;

public class Task4 {
//  С клавиатуры вводятся n чисел. 
	// Составьте программу, которая определяет кол-во отрицательных,
	// кол-во положительных и кол-во нулей среди введеных чисел.
	// Значение n вводится с клавиатуры.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number");
		int n = scan.nextInt();
		int[] mas = new int[n];
		System.out.println("Enter " + n + " numbers");
		for (int i = 0; i < mas.length; i++) {
			mas[i] = scan.nextInt();
		}

		int countO = 0;
		int countP = 0;
		int countN = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				countO++;
			}


			if (mas[i] > 0) {
				countP++;
				
			}

			if (mas[i] == 0) {
				countN++;

			}
		}
			System.out.println("Null " + countN);
			System.out.println("Otriz " + countO);
			System.out.println("Pol " + countP);

			scan.close();
		
	}
}
