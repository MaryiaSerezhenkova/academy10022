package by.academyy.homework4;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Создать объект класса Date, используя вложенные классы Год, Месяц, День.
//Методы: задать дату, вывести на консоль день недели по заданной дате.
//День недели представить в виде перечисления.
//Рассчитать количество дней, в заданном временном промежутке.
//Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки.
//После валидации в конструкторе создаем объекты класса Year, Month, Day.
//Добавить метод, который проверяет высокосный ли год или нет.

public class DateX {

	private Day day;
	private Year year;
	private Month month;

	public DateX() {
		super();

	}

	public DateX(String patternString) {
		super();
		if (Validator.checkdate(patternString)) {
			this.year = new Year(Integer.parseInt(patternString.substring(6)));
			this.month = new Month(Integer.parseInt(patternString.substring(3, 5)));
			this.day = new Day(Integer.parseInt(patternString.substring(0, 2)));
		} else {
			System.out.println("Date should be entered in format dd-mm-yyyy");
		}
	}

	public DateX(int day, int month, int year) {
		super();
		this.day = new Day(day);
		this.year = new Year(year);
		this.month = new Month(month);

	}

	public void setDate(int year, int month, int day) {
		this.year = new Year(year);
		this.month = new Month(month);
		this.day = new Day(day);
	}

	public void printDay() {
		Calendar c = new GregorianCalendar();
		c.set(year.getYearN(), month.getMonthN(), day.getDayN()+3);
		int a = c.get(Calendar.DAY_OF_WEEK);
		WeekDay.day(a);
	}

	public static int countPeriod (Calendar date1, Calendar date2) {
		if (date1.get(Calendar.YEAR) == date2.get(Calendar.YEAR)) {
				return Math.abs(date1.get(Calendar.DAY_OF_YEAR) - date2.get(Calendar.DAY_OF_YEAR));
			} 
		else {
			if (date2.get(Calendar.YEAR) > date1.get(Calendar.YEAR)) {
				Calendar x = date1;
				date1 = date2;
				date2 = x;
			}
			int resultDays = 0;
			int ALLYearDays = date1.get(Calendar.DAY_OF_YEAR);
			while (date1.get(Calendar.YEAR) > date2.get(Calendar.YEAR)) {
				date1.add(Calendar.YEAR, -1);
				resultDays += date1.getActualMaximum(Calendar.DAY_OF_YEAR);
			}
			return resultDays - date2.get(Calendar.DAY_OF_YEAR) + ALLYearDays;
		}
	}
	
	public static int countPeriod(DateX a, DateX b) {
		Calendar c1 = new GregorianCalendar(a.getYear().getYearN(), a.getMonth().getMonthN(), a.getDay().getDayN());
		Calendar c2 = new GregorianCalendar(b.getYear().getYearN(), b.getMonth().getMonthN(), b.getDay().getDayN());
		int period = countPeriod(c1, c2);
		return period;
		
	}
	

	

	public class Year {

		@Override
		public String toString() {
			return "Year [" + year + "]";
		}

		public int year;

		public Year(int year) {
			super();
			this.year = year;
		}

		public void getYear() {
			System.out.println(year);

		}

		public int getYearN() {
			return year;

		}

		public void isLeapYear() {
			this.year = year;
			if (year % 4 == 0)
				System.out.println(year + " is LeapYear");
			else
				System.out.println(year + " is not LeapYear");

		}
	}

	public class Month {
		@Override
		public String toString() {
			return "Month [" + month + "]";
		}

		public int month;

		public Month(int month) {
			super();
			this.month = month;
		}

		public void getMonth() {
			System.out.println(month);

		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getMonthN() {
			return month;

		}

	}

	public class Day {
		public int day;

		public Day(int day) {
			super();
			this.day = day;
		}

		@Override
		public String toString() {
			return "Day [" + day + "]";
		}

		public void getDay() {
			System.out.println(day);

		}

		public int getDayN() {
			return day;

		}

	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", year=" + year + ", month=" + month + "]";
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	

}
