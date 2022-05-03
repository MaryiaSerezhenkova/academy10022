package by.academyy.lesson16;

import java.util.function.Predicate;

//Написать программу, проверяющую что строка начинается буквой "J" или "N" и заканчивается "A". Используем функциональный интерфейс Predicate

public class Task5Lambda {
	
	public static void main(String[] args) {

		Predicate<String> startWithJ = t -> t.startsWith("J");
		Predicate<String> startWithN = t -> t.startsWith("N");
		
		Predicate<String> endWithA = t -> t.endsWith("A");

		System.out.println(startWithJ.or(startWithJ).and(endWithA).test("ABCD"));
		System.out.println(startWithJ.or(startWithJ).and(endWithA).test("JORA"));
		
	}
	
	

}
