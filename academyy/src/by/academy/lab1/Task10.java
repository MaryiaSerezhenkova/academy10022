package by.academy.lab1;
//Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.

//Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй -
//соответствующие значения функции. F(x) = tg(x)

public class Task10 {

	public static void main(String[] args) {
		getFunction(1, 5, 1);
	}

	public static void getFunction(double a, double b, double h) {
		double x = a;
		double result = Math.tan(x);
		System.out.println(x + "  " + result);
		while (x <= (b - h)) {
			x = x + h;
			result = Math.tan(x);
			System.out.println(x + "  " + result);
		}

	}
}