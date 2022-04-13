package by.academyy.Arrays;
//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, 

//выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, 
//для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

import java.util.Random;

public class Task5 {
	public static void main(String[] args) {
		int[] mas = new int[5];
		int[] mas2 = new int[5];
		int count = 0;
		int count2 = 0;
		double av = 0;
		double av2 = 0;
		Random rand = new Random();
		for(int i=0; i<mas.length; i++) {
		mas[i]= rand.nextInt(5);
		mas2[i]= rand.nextInt(5);
		}
		for(int i=0; i<mas.length; i++) {
			System.out.print(mas[i] + " ");}
		
			System.out.println();
			for(int i=0; i<mas2.length; i++) {		
			System.out.print(mas2[i] + " ");
			

}
			for(int i=0; i<mas.length; i++) {
				count = count + mas[i];
			}
			
			for(int i=0; i<mas2.length; i++) {
				count2 = count2 + mas2[i];
			}
			System.out.println();
			av = count/5;
			av2 = count2/5;
			if(av<av2) {
				System.out.println("Srednee arifmeticheskoje pervogo massiva menjshe srednego arifmethicheskogo vtorogo massiva");
				} else if(av2<av) {
				System.out.println("Srednee arifmeticheskoje vtorogo massiva menjshe srednego arifmethicheskogo pervogo massiva");
				} else {
					System.out.println("Srednije arifmethicheskije ravni drug drugu");
				}
			
			
	}
}
