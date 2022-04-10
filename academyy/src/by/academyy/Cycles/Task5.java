package by.academyy.Cycles;

import java.util.Scanner;

public class Task5 {
	// 5. Составьте программы перевода старинных русских мер длины, торгового и
	// аптекарского веса(счетчик цикла от 1 до 10)
	// * саженей в метры(1 сажень равна 2,1366 м)
	// * из дюймов в сантиметры(1 дюйм равен 2,5 см)
	// * футов в метры(1 фут равен 0,3048 м)
	// * драхм в граммы(1 драхма равна 3,7325 г)
	// * унций в граммы(1 унция равна 29,86 г)
	// * фунтов в килограммы(1 фунт равен 0,40951 кг)
	// * аршинов в метры(1 аршин равен 0,7112 м)
	// * золотников в граммы(1 золотник равен 4,2657 г)
	// * дюймов в миллиметры(1 дюйм равен 25,3995 мм)
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter old type: ");		
		String oldTtype = scanner.nextLine();
		
		System.out.println("Enter number 1-10: ");

	    int oldSize = scanner.nextInt();
	
		while (oldSize > 10) {
			System.out.println("Try again");
			oldSize = scanner.nextInt();}
		
		double modernSize;
		
			switch (oldTtype) {

			case "sazhen":
				modernSize = oldSize * 2.1366;
				System.out.println("Length is " + modernSize + "m");
				break;
			case "dyim":
				modernSize = oldSize * 2.5;
				System.out.println("Length is " + modernSize + "sm");
				break;
			case "fut":
				modernSize = oldSize * 0.348;
				System.out.println("Length is " + modernSize + "m");
				break;
			case "drahm":
				modernSize = oldSize * 3.7325;
				System.out.println("Weight is " + modernSize + "gr");
				break;
			case "unzia":
				modernSize = oldSize * 29.86;
				System.out.println("Weight is " + modernSize + "gr");
				break;
			case "funt":
				modernSize = oldSize * 0.4051;
				System.out.println("Weight is " + modernSize + "kg");
				break;
			case "arshin":
				modernSize = oldSize * 0.7112;
				System.out.println("Length is " + modernSize + "m");
				break;
			case "zolotnik":
				modernSize = oldSize * 4.2657;
				System.out.println("Weight is " + modernSize + "gr");
				break;
			case "dyim mm":
				modernSize = oldSize *25.3995;
				System.out.println("Length is " + modernSize + "mm");
				break;
			}
		}
	}

