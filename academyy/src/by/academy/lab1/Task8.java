package by.academy.lab1;

import java.util.Scanner;

//Вычислить значение функции.
//F(x)={-x^2+3x+6, если x >= 3; 1/(x^3-6), если x < 3}

public class Task8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int x = scan.nextInt();
		double f = 0;
		if (x >= 3) {
			f = (int) Math.pow(x, 2) * (-1) + 3 * x + 6;
		} else {
			f = (double) 1 / ((int) Math.pow(x, 3) - 6);
		}
		System.out.println(f);
		scan.close();
	}
}
