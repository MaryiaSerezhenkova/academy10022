package by.academyy.homework5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

public class Task4 {

	public static void main(String[] args) {

		Random rand = new Random();

		ArrayList<Integer> marks = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			marks.add(rand.nextInt(11));
		}

		Iterator<Integer> iterator = marks.iterator();
		System.out.println(marks);

		int bestMark = 0;
		while (iterator.hasNext()) {
			int mark = iterator.next();
			if (mark > bestMark) {
				bestMark = mark;
			}
		}
		System.out.println("The best mark is : " + bestMark);
	}
}
