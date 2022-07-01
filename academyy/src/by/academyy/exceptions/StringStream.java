package by.academyy.exceptions;

import java.util.ArrayList;
import java.util.stream.Collectors;

//Условие задачи. Задан массив строк. Используя средства StreamAPI отсортировать строки в лексикографическом порядке.

public class StringStream {
	public static void main(String... args) {


	String[] arr = { "abc", "alala", "java", "cat", "sea" };

	ArrayList<String> str = new ArrayList<>(arr.length);

	for (int i = 0;i<arr.length;i++) {
		str.add(i, arr[i]);

	}

	System.out.println(str.stream().sorted().collect(Collectors.toList()));
}
	}