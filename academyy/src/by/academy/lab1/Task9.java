package by.academy.lab1;
//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.

//S = π × r2
//L = 2π × r

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите радиус");
		double R = scan.nextDouble();
		if (R > 0) {
			double S = Math.PI * Math.pow(R, 2);
			double L = Math.PI * 2 * R;
			System.out.println("Длина окружности " + L);
			System.out.println("Площадь круга " + S);
		} else {
			System.out.println("Радиус должен быть больше 0");
		}
		scan.close();
	}

}
