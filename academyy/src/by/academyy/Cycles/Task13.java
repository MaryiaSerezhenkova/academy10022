package by.academyy.Cycles;
//Найти сумму чисел от 100 до 200 кратных 17.

public class Task13 {
	public static void main(String[] args) {
		int sum =0;
		for (int n = 100; n < 201; n++) {
			if (n % 17 == 0)
			    sum += n;
		}

				System.out.println(sum);
		}

	

}
