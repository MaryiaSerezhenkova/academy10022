package by.academyy.Arrays;

import java.util.Arrays;
import java.util.Random;

//Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9].
//Вывести массив на экран.
//Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент.
//При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки.
//Порядок остальных элементов строки не важен (т.е. можно соврешить только одну перестановку,
//а можно отсортировать по убыванию каждую строку).
//Вывести преобразованный массив на экран.                                                               

public class Task17 {

	public static void main(String[] args) {
		int[][] array = new int[6][7];
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 10);

			}
		}
		System.out.println(Arrays.deepToString(array));
		System.out.println();
		for (int k = 0; k < array.length; k++) {
			for (int i = 0; i < array[k].length - 1; i++) {
				for (int j = 0; j < array[k].length - i - 1; j++) {
					if (array[k][j] < array[k][j + 1]) {
						max = array[k][j];
						array[k][j] = array[k][j + 1];
						array[k][j + 1] = max;

					}
				}
			}
		}
		System.out.println(Arrays.deepToString(array));

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.println(Arrays.deepToString(array));
//            }
//        }
	}
}
