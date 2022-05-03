package by.academyy.lesson16;

//Создать лямбда выражение, которое возвращает true, если строка не null, используя функциональный интерфейс Predicate

import java.util.function.Predicate;

public class Task2Lambda {
		public static void main(String[] args) {

			Predicate<String> isNotNull = t -> t!=null;
			

			System.out.println(isNotNull.test("ABCD"));
			System.out.println(isNotNull.test(null));
		}
}


