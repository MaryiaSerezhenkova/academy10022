package by.academyy.homework4;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class DateDemo {

	public static void main(String[] args) {
		DateX date1 = new DateX(29, 4, 2022);
		DateX.Year year1 = date1.new Year(2022);
		DateX.Month month1 = date1.new Month(04);
		DateX.Day day1 = date1.new Day(29);

		DateX date2 = new DateX("02-05-2022");
		
		DateX date3 = new DateX("10-05-2020");

		year1.getYear();
		month1.getMonth();
		day1.getDay();

		date1.printDay();

		date2.printDay();
		System.out.println(DateX.countPeriod(date1, date2));

		year1.isLeapYear();
		date3.getYear().isLeapYear();

	}
}
