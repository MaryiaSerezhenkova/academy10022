package by.academyy.homework4;

public enum WeekDay {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

	public static void day(int intDayOfWeek) {
		switch (intDayOfWeek) {
		case 1:
			System.out.println(WeekDay.MONDAY);
			break;
		case 2:
			System.out.println(WeekDay.TUESDAY);
			break;
		case 3:
			System.out.println(WeekDay.WEDNESDAY);
			break;
		case 4:
			System.out.println(WeekDay.THURSDAY);
			break;
		case 5:
			System.out.println(WeekDay.FRIDAY);
			break;
		case 6:
			System.out.println(WeekDay.SATURDAY);
			break;
		case 7:
			System.out.println(WeekDay.SUNDAY);
			break;
		}
	}
}
	
	
	


