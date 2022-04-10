package by.academyy.Cycles;

//
public class Task10 {
	// Даны натуральные числа от 1 до 50. Найти сумму тех из них, которые делятся на
	// 5 или на 7.
	public static void main(String[] args) {
		int sum =0;
		for (int n = 1; n < 51; n++) {
			if (n % 5 == 0 || n % 7 == 0)
			    sum += n;
		}

				System.out.println(sum);
		}

	}

