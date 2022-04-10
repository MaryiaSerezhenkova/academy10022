package by.academyy.Cycles;

import java.util.Scanner;

public class Task7 {
	// Ввести с клавиатуры 10 пар чисел. сравнить числа в каждой паре и напечатать
	// большие из них.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pair = 1;
	
		while (pair < 11) {
			pair++;

		System.out.println("Enter pair of numbers: ");
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		
		if (n>m) {
			System.out.println(n);}
			else if (m>n) {
				System.out.println(m);}
				else if (m==n) {
					System.out.println(m + "=" + n);}
				}
			}
}

			
		

	

