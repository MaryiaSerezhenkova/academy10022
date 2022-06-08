package by.academyy.Strings;

public class Task13 {
	public static void main(String[] args) {
		System.out.println("Находение корней квадратного уравнения ax^2 + bx + c = 0, a != 0: ");
		if (args.length < 3) {
			System.out.println("Введите параметры уравнения(a, b, c) с командной строки");
			return;
		}
		final int a = Integer.parseInt(args[0]);
		final int b = Integer.parseInt(args[1]);
		final int c = Integer.parseInt(args[2]);
		System.out.println(a + "x^2 + " + b + "x + " + c + " = 0, a != 0: ");
		int x, x1, x2;
		final int discriminant = (b * b) - (4 * a * c);
		String noRoots = "Корней нет";
		String oneRoot = "Один корень: ";
		String twoRoots = "Корней два: ";
		if (a == 0) {
			System.out.println("a == 0");
			return;
		} else if (b == 0 & c == 0) {
			x = 0;
			System.out.println(oneRoot + x);
			return;
		} else if (b == 0) {
			x = -c / a;
			if (x >= 0) {
				x = (int) Math.sqrt(-c / a);
				System.out.println(twoRoots + x + ", " + (-x));
			} else {
				System.out.println(noRoots);
				return;
			}
		} else if (c == 0) {
			x1 = 0;
			x2 = -(b / a);
			System.out.println(twoRoots + x1 + ", " + x2);
		} else if (discriminant < 0) {
			System.out.println(noRoots);
			return;
		} else if (discriminant == 0) {
			x = (int) ((-b + Math.sqrt(discriminant)) / 2 * a);
			System.out.println(oneRoot + x);
		} else if (discriminant > 0) {
			x1 = (int) ((-b + Math.sqrt(discriminant)) / 2 * a);
			x2 = (int) ((-b - Math.sqrt(discriminant)) / 2 * a);
			System.out.println(twoRoots + x1 + ", " + x2);
		}
}

}

