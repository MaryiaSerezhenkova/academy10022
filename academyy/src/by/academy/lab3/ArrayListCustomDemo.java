package by.academy.lab3;
//Программа должна иметь следующие возможности:

//1 - Сортировать массив тримя способами.
//2 - Осуществлять поиск элемента массива (использовать алгоритм бинарного поиска).
//3 - Нахождение максимального и минимального элемента массива.
//4 - Получить все простые числа находящиеся в массиве.
//5 - Получить все числа Фибонначчи находящиеся в массиве.
//6 - Получить все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
//7 - Заполнения элементов массива и с консоли, и с файла и с помощью генерации случайных чисел.

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCustomDemo<T extends Comparable<T>> {

	public static void main(String[] args) {
		Integer[] array = { 11, 10, 25, 5 };
		ArrayListCustom<Integer> obj = new ArrayListCustom<>(array);
		System.out.println(Arrays.toString(obj.getItems()));
		System.out.println("minElement " + obj.minElement());
		System.out.println("maxElement " + obj.maxElement());
		obj.bubbleSort();
		System.out.println(Arrays.toString(obj.getItems()));
		// System.out.println(obj.binarySearch(-128));
		System.out.println(obj.binarySearch(5));
		System.out.println("простые числа: " + obj.findSimpleNumbers());
		System.out.println("числа Фибонначчи: " + obj.findFibonacciNumbers());
		System.out.println(
				"трехзначные числа, в десятичной записи которых нет одинаковых цифр: " + obj.findSimpleNumbers());
		obj.fillFromConsole(5);
	}

}
