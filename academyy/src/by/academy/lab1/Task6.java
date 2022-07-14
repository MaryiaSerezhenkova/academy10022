package by.academy.lab1;
//Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому моменту

public class Task6 {

	public static void main(String[] args) {
		int n = 54100;
		if (n > 0 & n <= 86400) {
			int sec;
			int m;
			int min;
			int h;
			int hour;
			sec = n % 60;
			m = (n - sec) / 60;
			min = m % 60;
			h = (m - min) / 60;
			hour = h % 24;
			System.out.println(hour + " hours " + min + " minutes " + sec + " seconds");
		} else
			System.out.println("Number is not valid");
	}
}
