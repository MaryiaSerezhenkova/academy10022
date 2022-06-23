package by.academyy.lesson16;

//Написать программу, проверяющую что строка не null и не пуста, используя метод and() функционального интерфейса Predicate

import java.util.function.Predicate;

public class Task4Lambda {
	public static void main(String[] args) throws NullPointerException {

		Predicate<String> isNotEmpty = t -> !t.isEmpty();
		Predicate<String> isNotNull = t -> t!=null;
		
		
	

	System.out.println(isNotEmpty.and(isNotNull).test("ABCD"));
	System.out.println(isNotNull.and(isNotEmpty).test(null));
	System.out.println(isNotEmpty.and(isNotNull).test(""));
	}
		

	}
