package by.academyy.Arrays;
//Задача 1. Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, 

//отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки). 
//Перед созданием массива подумайте, какого он будет размера.

public class Task1 {
	public static void main(String[] args) {
	
int[] mas = new int[10]; {

for (int i=0, n=2; i<mas.length; n = n+2, i++) {
mas[i] = n;}
for (int i=0; i<mas.length; i++) {

System.out.print(mas[i]+" ");
}

System.out.println();
for (int i=0; i<mas.length; i++) 

System.out.println(mas[i]);
}}
}
