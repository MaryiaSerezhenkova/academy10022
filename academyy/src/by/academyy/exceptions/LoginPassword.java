package by.academyy.exceptions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lesson15.WrongLoginException;
import lesson15.WrongPasswordException;

public class LoginPassword {
	public static final Pattern valid = Pattern.compile("[a-zA-Z0-9_]{5,20}");

	public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter login");
			String login = scan.next();
			System.out.println("Enter password");
			String password = scan.next();
			System.out.println("Enter password again");
			String confirmPassword = scan.next();
			System.out.println(checkLoginPassword(login, password, confirmPassword));
			scan.close();
		} catch (WrongLoginException e) {
			System.out.println("Login error " + e.getMessage());
		} catch (WrongPasswordException e) {
			System.out.println("Password error " + e.getMessage());
		}

	}

	public static boolean checkLoginPassword(String login, String password, String confirmPassword)
			throws WrongLoginException, WrongPasswordException {
		if (login == null) {
			throw new WrongLoginException("Login is empty");
		}

		if (password == null) {
			throw new WrongPasswordException("Password is empty");
		}

		Matcher matcher = valid.matcher(login);
		Matcher matcher2 = valid.matcher(password);

		if (!matcher.matches()) {
			throw new WrongLoginException("Login is not valid");
		}
		if (!matcher2.matches()) {
			throw new WrongPasswordException("Password is not valid");

		}
		if (!password.equals(confirmPassword)) {
			throw new WrongPasswordException("Passwords not equals");
		}
		return (true);

	}
}
