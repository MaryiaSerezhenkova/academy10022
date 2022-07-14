package by.academy.lab1;
//Даны две точки А(х1, у1) и В(х2, у2).

//Составить алгоритм, определяющий, которая из точек находится ближе к началу координат x, y.

public class Task7 {

	public static void main(String[] args) {
		findNearestPoint(5, 8, 1, 1, 0, 0);
		// findNearestPoint(5,8, 11,111, 0,0);

	}

	public static void findNearestPoint(int x1, int y1, int x2, int y2, int x, int y) {
		double distAX = Math.sqrt((Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2)));
		double distBX = Math.sqrt((Math.pow((x2 - x), 2) + Math.pow((y2 - y), 2)));
		System.out.println(distAX);
		System.out.println(distBX);
		if (distAX < distBX) {
			System.out.println("Point A is closest to the origin");
		}
		if (distAX == distBX) {
			System.out.println("Points are on the similar distance to the origin");
		} else if (distAX > distBX) {
			System.out.println("Point B is closest to the origin");
		}

	}
}
