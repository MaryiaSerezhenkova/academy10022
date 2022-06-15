package by.academyy.oop;

import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {
		CustomLinkedList<String> lk = new CustomLinkedList<>();
		lk.add(0,"cat");
		lk.add(0,"dog");
		lk.add(0,"pig");

//		lk.remove("dog");
//		lk.remove(1);

		System.out.println(lk.get(0));
		System.out.println(lk.get(1));
		System.out.println(lk.get(2));
	}

}
