package by.academyy.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Задача 13                                                                                                      
//Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n. 
//Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод. 
//Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран. 
//Создать второй массив только из чётных элементов первого массива, 
//если они там есть, и вывести его на экран.

public class Task13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		if (n < 4) {
			System.out.println("Error");
			n = scan.nextInt();
		}
		int[] array = new int[n];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(n + 1);
		}
		System.out.println(Arrays.toString(array));
		int[] array2 = new int[n];
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0 && array[i]!=0) {
				array2[i] = array[i];
			}
		}
		System.out.println(Arrays.toString(array2));
	}
}
