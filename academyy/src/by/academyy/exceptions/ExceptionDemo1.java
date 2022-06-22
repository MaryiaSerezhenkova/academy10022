package by.academyy.exceptions;

import java.io.IOException;

public class ExceptionDemo1 {

	public static void main(String[] args) {

//		try {
//			int i = 10 / 0;
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//
//		}
//		try {
//			throwOne();
//		} catch (IllegalAccessException e) {
//			System.out.println("Выброс " + e);
//		}
		int i=2;
		try {
			devide(i, 1);
			System.out.println("After devide");
		} catch (IllegalAccessException | IOException e) {
			i=1;
			System.out.println(e.getMessage());
			return;
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally block");
		}
		System.out.println("After try/catch");
	}

	public static void throwOne() throws IllegalAccessException {
		System.out.println("Внутри throwOne.");
		throw new IllegalAccessException("demo");
	}

	public static double devide(int a, int b) throws IllegalAccessException, IOException {
		if (b == 0) {
			throw new IOException("Нельзя делить на 0");
		}
		if (a == 1) {
			throw new IllegalAccessException("for fun");
		}
		if (a == 2) {
			throw new CustomException("for fun");
		}
		return a / b;
	}
}
