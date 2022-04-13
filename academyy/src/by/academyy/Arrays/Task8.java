package by.academyy.Arrays;
//Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. 

//Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.

public class Task8 {
	public static void main(String[] args) {
		int[] mas = new int[12];
		int max = 0;
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 31 - 15);
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] >= max) {
				max = mas[i];
				j = i;
			}
		}
		System.out.println();
		System.out.println("Max elemeny is " + mas[j]);
		System.out.println("Index " + +j);
	}

}
