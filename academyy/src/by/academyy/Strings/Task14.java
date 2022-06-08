package by.academyy.Strings;
//Ввести число от 1 до 12. Вывести на консоль название месяца, соответ-ствующего данному числу.

//(Осуществить проверку корректности ввода чисел).

import java.util.Scanner;

public class Task14 {
	public enum Month {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = 0;
		do {
			System.out.println("Enter number of month");
			month = scan.nextInt();
			if (month < 1 || month > 12) {
				System.out.println("Enter number 1-12");
			}
		} while (month < 1 || month > 12);
		switch (month) {
		case 1:
			System.out.println(Month.JANUARY);
			break;
		case 2:
			System.out.println(Month.FEBRUARY);
			break;
		case 3:
			System.out.println(Month.MARCH);
			break;
		case 4:
			System.out.println(Month.APRIL);
			break;
		case 5:
			System.out.println(Month.MAY);
			break;
		case 6:
			System.out.println(Month.JUNE);
			break;
		case 7:
			System.out.println(Month.JULY);
			break;
		case 8:
			System.out.println(Month.AUGUST);
			break;
		case 9:
			System.out.println(Month.SEPTEMBER);
			break;
		case 10:
			System.out.println(Month.OCTOBER);
			break;
		case 11:
			System.out.println(Month.NOVEMBER);
			break;
		case 12:
			System.out.println(Month.DECEMBER);
			break;
		}
	}
}
