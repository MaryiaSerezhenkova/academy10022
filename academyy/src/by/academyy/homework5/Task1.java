package by.academyy.homework5;

//Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class Task1 {

	public static void main(String[] args) {

		Random rand = new Random();

		Integer[] array = new Integer[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(11);
		}
		System.out.println(Arrays.toString(array));

		ArrayList<Integer> collection = new ArrayList<>();

		for (Integer a : array) {
			collection.add(a);
		}

		System.out.println(unicCollection(collection));

	}

	public static <T> Collection<T> unicCollection(Collection<T> collection) {
		return new HashSet<>(collection);
	}

}
