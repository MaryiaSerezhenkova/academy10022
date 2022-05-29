package by.academyy.Arrays;

import java.util.Arrays;
import java.util.Random;

//Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
//Вывести массив на экран.  

public class Task14 {
	public static void main(String[] args) {
		int[][] array = new int[8][5];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = 10 + rand.nextInt(90);
			}
		}
		System.out.println(Arrays.deepToString(array));
	}

}
