package by.academyy.Cycles;
//Напечатать те из двузначных чисел которые делятся на 4, но не делятся на 6.

public class Task11 {
	public static void main(String[] args) {
		for (int n = 11; n < 100; n++) {
			if (n % 4 == 0 & n % 6 != 0)

				System.out.println(n);
		}

	}
}
