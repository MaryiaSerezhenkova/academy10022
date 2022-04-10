package by.academyy.Cycles;

import java.util.Scanner;

public class Task3 {
	//Составьте программу, составьте программу, которая вычисляет произведение чисел от 1 до n. Значение n
	 //вводится с клавиатуры.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your number");
		int n = scan.nextInt();
		int rez = 1;
		for (int i = 1; i <=n; i++)
			rez=rez*i;
		System.out.println(rez);

	}
}


