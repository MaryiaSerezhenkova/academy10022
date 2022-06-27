package by.academyy.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Задано множество фамилий сотрудников. Разработать программу, которая отображает все фамилии, 
//начинающиеся на букву «J». Задачу решить с использованием Stream API. О

public class LastNameStream {
	public static void main(String[] args) {
		ArrayList<String> employees = new ArrayList<>();
		employees.add("Adams");
		employees.add("Brook");
		employees.add("Jones");
		employees.add("Janson");
		employees.add("Aaron");
		employees.add("Jarvis");
		employees.add("Bean");

		System.out.println(sortedList("J", employees));
	}

	private static ArrayList<String> sortedList(String firstSymb, ArrayList<String> ar) {

		return (ArrayList<String>) ar.stream().filter(t -> t.startsWith(firstSymb)).collect(Collectors.toList());
	}
}
