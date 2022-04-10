package by.academyy.Cycles;

//Найти произведение двузначных нечетных чисел кратных 13.
public class Task12 {
	public static void main(String[] args) {
		int p = 1;
		for (int n = 10; n < 100; n++) {
			if (n % 2 != 0 & n % 13 == 0)
				p *= n;
		}

		System.out.println(p);
	}

}
