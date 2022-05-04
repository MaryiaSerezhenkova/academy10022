package by.academyy.lesson16;
//Создать лямбда выражение, которое возвращает true, если строка не пуста, используя функциональный интерфейс Predicate

import java.util.function.Predicate;



public class Task3Lambda {

	public static void main(String[] args) throws NullPointerException {
		Predicate<String> isNotEmpty = t -> !t.isEmpty();
		System.out.println(isNotEmpty.test("ABCD"));
		System.out.println(isNotEmpty.test(""));
		

	}



	}

