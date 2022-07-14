package by.academy.lab1;

import java.time.LocalDate;

//Составить программу, которая по заданным году и номеру месяца определяет количество дней
//в этом месяце и корректно определялись все високосные года.

public class Task2 {

	public static void main(String[] args) {
		System.out.println(daysInMonth(2022, 62));
		System.out.println(isLeapYear(2020, 7));
	}

	public static int daysInMonth(int year, int month) {
		if (month > 0 & month < 13) {
			LocalDate ourDate = LocalDate.of(year, month, 1);
			return ourDate.lengthOfMonth();
		} else
			System.out.println("Year has 1-12 monthes!");
		return 0;
	}

	public static boolean isLeapYear(int year, int month) {
		LocalDate ourDate = LocalDate.of(year, month, 1);
		return ourDate.isLeapYear();
	}
}
