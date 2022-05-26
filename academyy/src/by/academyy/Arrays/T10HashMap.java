package by.academyy.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

//Задача 10.
//Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку. 
//Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран. 
//Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.

public class T10HashMap {
	public static void main(String[] args) {
		int[] array = new int[11];
		HashMap<Integer, Integer> hp = new HashMap<>();

		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(3) - 1;

			if (hp.containsKey(array[i])) {
				hp.put(array[i], hp.get(array[i]) + 1);
			} else {
				hp.put(array[i], 1);
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println(hp);
	}
}
