package by.academyy.Arrays;
//оздайте массив из 4 случайных целых чисел из отрезка [10;99], 
//выведите его на экран в строку. Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.

public class Task6 {
	public static void main(String[] args) {
		int[] mas = new int[4];
		int flag;
		flag = 0;
		for(int i=0; i<mas.length; i++){
			mas[i] = (int)(Math.random()*89+10);
		}
		for(int i=0; i<mas.length; i++) {
			System.out.print(mas[i]+" ");
		}
		System.out.println();
		for(int i=0; i<mas.length-1; i++) {
			if(mas[i]>mas[i+1]) {
				flag = 1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}


}
