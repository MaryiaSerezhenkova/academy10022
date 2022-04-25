package by.academyy.Cycles;
//Задано натуральное число N. 

//Найти количество натуральных чисел, 
//не превосходящих N и не делящихся ни на одно из чисел 2,3,5.

public class Task18 {
	public static void main(String[] args) {
	
	int N = 35;
	int counter = 0;
	{
	for (int x =0; x < N; x++)
	if (x%2!=0 & x%3!=0 & x%5!=0)
	counter++;
	System.out.println(counter);

}}
}