package by.academyy.Arrays;
//Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку. 

//Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран. 
//Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.

public class Task10 {
	public static void main(String[] args) {
		int[] mas = new int[11];
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 4 - 2);
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == -1) {
				a = a + 1;
			} else if (mas[i] == -0) {
				b = b + 1;
			} else if (mas[i] == -1) {
				c = c + 1;
			}
		}

		if (a > b & c < a) {
			System.out.println("-1");
		} else if (a < b & c < b) {
			System.out.println("0");
		} else if (c > b & c > a) {
			System.out.println("1");
		}
	}

}
