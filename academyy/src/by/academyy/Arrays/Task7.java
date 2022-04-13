package by.academyy.Arrays;
//Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. 

//Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.

public class Task7 {
	public static void main(String[] args) {
		int[] mas = new int[20];

		for (int i = 0, n1 = 1, n2 = 0; i < mas.length; i++) {
			if (i % 2 == 0) {
				
				n1 = n1 + n2;
				mas[i] = n1;
			} else {
				n2 = n1 + n2;
				mas[i] = n2;
			}
		}
		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + " ");
		}
	}
}
