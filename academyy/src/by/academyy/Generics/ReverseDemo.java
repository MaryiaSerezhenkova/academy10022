package by.academyy.Generics;

public class ReverseDemo {
	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Reverse<Integer> array = new Reverse<>(intArray);
		System.out.println(array.toString());
		array.reverse();
		System.out.println("Array after reverse: " + array.toString());

	}
}
