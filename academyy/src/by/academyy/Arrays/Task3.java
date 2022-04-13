package by.academyy.Arrays;

import java.util.Random;

//Создайте массив из 15 случайных целых чисел из отрезка [0;9]. 
//Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
public class Task3 {
	public static void main(String[] args) {
		int[] mas = new int[15];
		int count = 0;
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);

			System.out.print(mas[i] + " ");
		}

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0 & mas[i] != 0) {
				count++;
			}
		}
		System.out.println();
		System.out.println(count);

	}
}
