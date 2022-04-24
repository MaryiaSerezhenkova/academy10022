package Lesson13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyExam {
	public static void main(String[] args) {

Random rand = new Random();

Integer tasks=rand.nextInt(20);
System.out.println(tasks);

Integer[] array2 = new Integer[tasks];

for(int i = 0;i<array2.length;i++) {
	Scanner sc = new Scanner(System.in);
	array2[i] = sc.nextInt();	
	while (array2[i] < 0 || array2[i]>=10) {
		System.out.println("Try again");
		array2[i] = sc.nextInt();
	}
}

Exam<Integer> exam = new Exam<>("Jim", array2);
System.out.println(Arrays.toString(array2));

exam.addMark(9);

System.out.println(Arrays.toString(exam.getMarks()));
System.out.println(exam.calcFinalMark());
	}

}
