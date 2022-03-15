package by.academyy.homework1;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Введите ваш возраст: ");
			int age = scanner.nextInt();
			System.out.println("Введите стоимость покупки: ");
			int value = scanner.nextInt();
	//double value = scanner.nextDouble();

			if (value < 100) {
				System.out.println("Цена со скидкой " + (value * 0.95));
			} else if (value <= 100 && value < 200) {
				System.out.println("Цена со скидкой " + (value * 0.93));
			} else if (value <= 200 && value < 300) {
				if (age <= 18) {
					System.out.println("Цена со скидкой " + (value * 0.84));
				} else {
					System.out.println("Цена со скидкой " + (value * 0.91));
				}
			} else if (300 <= value & value < 400) {
				System.out.println("Цена со скидкой " + (value * 0.85));
			} else if (400 <= value) {
				System.out.println("Цена со скидкой " + (value * 0.80));
			}
			scanner.close();
			}

}
