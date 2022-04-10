package by.academyy.Cycles;

import java.util.Scanner;

public class Task6 {
	//В сберкассу на трёхпроцентный вклад положили S рублей.Какой станет сумма вклада через N лет.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your value: ");		
		int s = scanner.nextInt();
		while (s<1) {
			System.out.println("Try again");
			s= scanner.nextInt();}
		
		System.out.println("Enter your period: ");
	    int n = scanner.nextInt();
	    while (n < 1) {
			System.out.println("Try again");
			n = scanner.nextInt();}
	    
	   double sum = s;
	   for (int i=1; i<=n; i++)
		   sum = sum + (sum*0.03);
	   System.out.println(sum);
	    
}
}
