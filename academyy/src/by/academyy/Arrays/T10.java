package by.academyy.Arrays;

import java.util.Arrays;
import java.util.Random;

//Задача 10.
//Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку. 
//Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран. 
//Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.

public class T10 {
	public static void main(String[] args) {
		int[] array = new int[11];
		int count0 = 0;
		int countNeg = 0;
		int countPos = 0;

		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(2) - 1;
			if (array[i] == 0) {
				count0++;

			}
			if (array[i] == -1) {
				countNeg++;
			}
			if (array[i] == 1) {
				countPos++;
			}
		}
		if (count0 > countPos && count0 > countNeg) {
			System.out.println(0);
		}
		System.out.println(Arrays.toString(array));

	}

}
