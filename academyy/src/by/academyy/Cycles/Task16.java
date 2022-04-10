package by.academyy.Cycles;
//В бригаде, работающей на уборке сена, имеется N сенокосилок.Первая сенокосилка работала m часов, 

//а каждая следующая на 10 минут больше, чем предыдущая.Сколько часов проработала вся бригада?

import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double sum = 0;
		double W = 0;

		System.out.println("Enter number of machines");
		int N = scan.nextInt();
		while (N < 1) {
			System.out.println("Try again");
			N = scan.nextInt();
		}

		System.out.println("Enter number of hours");
		double m = scan.nextDouble();
		while (m < 1) {

			System.out.println("Try again");
			m = scan.nextDouble();
		}
		
		//Min = m * 60*N+(N-1)*10;
		//Min = m * 60;
		for (int i = 0; i < N; i++) {
		
			sum+=m*60+(10*i);
			}
			W = sum / 60;
		
	
	
		System.out.println(W);
		
		
		
	}
}


