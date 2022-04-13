package by.academyy.Arrays;

import java.util.Scanner;

//Пользователь должен указать с клавиатуры чётное положительное число, 
//а программа должна создать массив указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку. 
//После этого программа должна определить и сообщить пользователю о том, сумма модулей какой половины массива больше: 
//левой или правой, либо сообщить, что эти суммы модулей равны. 
//Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода до тех пор, 
//пока не будет указано корректное значение.
public class Task11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum1 = 0;
		int sum2 = 0;

		System.out.println("Enter your number");
		int n = sc.nextInt();
		while (n < 0 || n % 2 != 0) {
			System.out.println("Try again");
			n = sc.nextInt();
		}
		int[] mas = new int[n];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 12 - 6);
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		int k = n / 2;
		for (int i = 0; i < k; i++) {
			sum1 = sum1 + mas[i];
		}

		for (int i = k; i < mas.length; i++) {
			sum2 = sum2 + mas[i];
		}
		if (sum1 > sum2) {
			System.out.println("First part is bigger");
		} else if (sum1 < sum2) {
			System.out.println("Second part is bigger");
		} else if (sum1 == sum2) {
			System.out.println("The parts are equals");
		}

	}
}