package by.academyy.Generics;

import java.util.Arrays;

public class MinMaxDemo {
	public static void main(String[] args) {

		MinMax<Integer> arr = new MinMax<>(new Integer[5]);
		MinMax<String> arr2 = new MinMax<>(new String[3]);
		arr.add(5);
		arr.add(105);
		arr.add(-5);
		arr.add(0);
		arr.add(20);
		arr2.add("hello");
		arr2.add("bye");
		arr2.add("good morning");

		System.out.println(arr.toString());
		System.out.println("Max element " + arr.maxElement());
		System.out.println("Min element " + arr.minElement());
		System.out.println(arr2.toString());
		System.out.println("Max element " + arr2.maxElement());
		System.out.println("Min element " + arr2.minElement());
	}
}
