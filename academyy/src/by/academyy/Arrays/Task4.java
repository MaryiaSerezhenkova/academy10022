package by.academyy.Arrays;
//Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку. 

//Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.

import java.util.Random;

public class Task4 {
	public static void main(String[] args) {
		int[] mas = new int[8];
		for(int i=0; i<mas.length; i++) {
		mas[i]=(int) (Math.random()*10+1);
		}
		for(int i=0; i<mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		for(int i=0; i<mas.length; i++) {
			if(i%2==0) {
				mas[i]=0;
			}
			System.out.print(mas[i]+" ");
		}
	
}
}