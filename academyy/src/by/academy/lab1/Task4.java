package by.academy.lab1;
//Составить программу, печатающую значение true, если указанное высказывание является истинным, и false —

//в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.

public class Task4 {

	public static void main(String[] args) {
		System.out.println(twoEvenNumb(-2, 0, -2, 1));

	}

	public static boolean twoEvenNumb(int a, int b, int c, int d) {
		int[] numbers = { a, b, c, d };
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				numbers[i] = 1;
			}
			sum += Math.abs(numbers[i]) % 2;
		}

		if (sum <= numbers.length - 2) {
			return true;
		} else
			return false;
	}

}