package by.academyy.homework5;

//Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.

//Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
//Замерьте время, которое потрачено на это.
//Сравните результаты и предположите, почему они именно такие.

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {

		ArrayList<Number> arrayList = new ArrayList<>();
		LinkedList<Number> linkedList = new LinkedList<>();

		addMillion(arrayList);
		addMillion(linkedList);

		long startArray = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			arrayList.get((int) (Math.random() * 999_999));
		}
		long endArray = System.currentTimeMillis();
		System.out.println("Processing time ArrayList " + (endArray - startArray) + " ms");

		long startLinked = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			arrayList.get((int) (Math.random() * 999_999));
		}
		long endtLinked = System.currentTimeMillis();
		System.out.println("Processing time LinkedList " + (endtLinked - startLinked) + " ms");

	}

	public static void addMillion(Collection<Number> collection) {
		for (int i = 0; i < 1_000_000; i++) {
			collection.add(Math.random());
		}
	}
}
//Недостатки класса ArrayList: Медленная вставка и удаление элементов в середину.
//LinkedList – Быстрое добавление и удаление элементов
