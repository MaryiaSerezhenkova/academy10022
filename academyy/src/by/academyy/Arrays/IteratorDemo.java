package by.academyy.Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<>();
		x.add(1);
		x.add(5);
		x.add(10);
		x.add(11);
		Iterator<Integer> iterator = x.iterator();
		while (iterator.hasNext()) {
			Integer i = iterator.next();

			System.out.println(i);
		}
	}
}