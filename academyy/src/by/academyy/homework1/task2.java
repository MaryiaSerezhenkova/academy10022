package by.academyy.homework1;

import java.util.Scanner;

public class task2 {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Введите тип данных: ");		
			String type = scanner.next();
			
			
			System.out.println("Введите переменную: ");
			
			
	switch (type) {
	case "int":
	  int i = scanner.nextInt();	
	  System.out.println(i%2);
	                    break;
	case "double":
	 double d = scanner.nextDouble();	
	 System.out.println(d*0.7);
	 break;
	case "float":
	 float f = scanner.nextFloat();
	 System.out.println(f*f);
	 break;
	case "char":
	 char ch = scanner.next().charAt(0);;
	 System.out.println(ch);
	 break;
	case "String":
	 String s = scanner.next();
	 System.out.println("Hello " +s);
	 break;
	default:
	 System.out.println("Unsupported type ");
	}
	scanner.close();
	}
}
