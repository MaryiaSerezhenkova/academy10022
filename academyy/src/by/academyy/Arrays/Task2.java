package by.academyy.Arrays;
//Создайте массив из всех нечётных чисел от 1 до 99, 
//выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).


public class Task2 {
	public static void main(String[] args) {
		
		int[] mas = new int[50]; {

		for (int i=0, n=1; i<mas.length; n = n+2, i++) {
		mas[i] = n;}
		for (int i=0; i<mas.length; i++) {

		System.out.print(mas[i]+" ");
		}

		System.out.println();
		for (int i=mas.length-1; i>=0; i--) 

		System.out.print(mas[i]+" ");
		}}
		}


