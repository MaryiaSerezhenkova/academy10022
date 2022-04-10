package by.academyy.Cycles;
//Даны натуральные числа от 35 до 87. Найти и напечатать те из них, которые при делении на 7 дают остаток 1, 2 или 5.

public class Task9 {
	public static void main(String[] args) {
		for (int n = 35; n < 88; n++) {
			if (n % 7 == 1 || n % 7 == 2 || n % 7 == 5)

				System.out.println(n);
		}

	}
}
