package by.academyy.homework1;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		int number = scanner.nextInt();
		int result = 0;
		for (int v = 0; v <= 10; v++) {
			result = number * v;
			System.out.println(number + "*" + v + "=" + result);
		}
		scanner.close();
	}
}

