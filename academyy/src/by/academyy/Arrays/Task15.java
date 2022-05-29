package by.academyy.Arrays;

import java.util.Arrays;
import java.util.Random;

//Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
//Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого массива
//(его индекс не имеет значения).

public class Task15 {
	public static void main(String[] args) {
		int[][] array = new int[5][8];
		Random rand = new Random();
		int max = -100;
		int[] arrayMax = new int[8];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(200) - 99;
			}
		}
		System.out.println(Arrays.deepToString(array));

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
		}
		System.out.println(max);
	}
}
