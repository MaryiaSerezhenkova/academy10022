package by.academy.lab1;

//Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту окружность.
//Во сколько раз площадь вписанного квадрата меньше площади заданного?
public class Task3 {

	public static void main(String[] args) {
		double bigSquareArea = 100;
		// S1 = 4r^2, где S - площадь квадрата, r - радиус вписанной окружности.
		// S2 = 2r^2
		double radius = Math.sqrt(bigSquareArea) / 4;
		// System.out.println(radius);
		double smallSquareArea = Math.pow(radius * 2, 2);
		System.out.println("Площадь вписанного квадрата " + smallSquareArea);

		// double dif = bigSquareArea/smallSquareArea;
		System.out
				.println("Площадь вписанного квадрата меньше площади квадрата, в который вписана окружность в 4 раза. "
						+ "4r^2/2r^2=4 ");

	}

}
