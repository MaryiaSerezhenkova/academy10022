package by.academyy.homework4;

import java.util.Iterator;

public class Task3Demo {

	public static void main(String[] args) {

		ArrayT<Integer> array2 = new ArrayT<>();

		array2.add(1);
		array2.add(2);
		array2.add(3);
		array2.add(4);
		array2.add(5);

		Task3Iterator iterator = array2.getIterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		// while (iterator.hasNext()) {
		// Integer d=2;
		// if (iterator.next().equals(d))
		// iterator.remove();
		// System.out.print(iterator.next() + " ");
		// }

	}
}
