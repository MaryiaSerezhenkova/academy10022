package by.academyy.Cycles;
//Бизнессмен взял ссуду m тысяч рублей в банке под 20% годовых.
//через сколько лет его долг превысит s тысяч рублей, если за это
//время он не будет отдавать долг.

public class Task28 {
	public static void main(String[] args) {
		double s = 800.0;
		int m = 300;
		int period = 1;
		for (double sum = m; m * Math.pow(1.2, period) < s; period++) {
			sum = m * Math.pow(1.2, period);
			System.out.println(sum);
		}
		System.out.println("Превысит через " + period  + " лет");

		

	}
}