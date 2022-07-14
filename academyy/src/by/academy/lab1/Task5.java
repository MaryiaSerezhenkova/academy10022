package by.academy.lab1;

import java.util.ArrayList;

//Составить программу, печатающую значение true, если указанное высказывание является истинным, и
//false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу).

public class Task5 {

	public static void main(String[] args) {
		// System.out.println(isPerfect(10));
		// System.out.println(isPerfect(6));
		// System.out.println(isPerfect(496));
		System.out.println(isPerfect(0));

	}

	public static boolean isPerfect(int n) {
		ArrayList<Integer> numb = new ArrayList<>();
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				numb.add(i);
			}
		}
		for (int j = 0; j < numb.size(); j++) {
			sum += numb.get(j);
		}

		System.out.println(numb.toString());
		System.out.println(sum);
		if (n == sum & n > 0) {
			return true;
		}

		else
			return false;
	}

}
