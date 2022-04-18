package by.academyy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
	public static Pattern patterndate = Pattern.compile("^\\d{2}[\\/\\-]\\d{2}[\\/\\-]\\d{4}$");
	public static Pattern patternAmerican = Pattern.compile("^\\+1\\d{10}$");
	public static Pattern patternBelarus = Pattern.compile("^\\+375\\d{9}$");
	public static Pattern patternEmail = Pattern.compile("^([a-zA-Z0-9]+\\.)*[a-z0-9]+@[a-z0-9]+(\\.[a-z0-9]+)*\\.[a-z]{2,6}$");
	//public static Pattern patternEmail = Pattern.compile("\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,6}");

	public static boolean checkdate(String date) {
		Matcher matcher = patterndate.matcher(date);
		return matcher.matches();
	}

	public static boolean checkAmerican(String valid) {
		Matcher matcher = patternAmerican.matcher(valid);
		return matcher.matches();
	}

	public static boolean checkBelarus(String valid) {
		Matcher matcher = patternBelarus.matcher(valid);
		return matcher.matches();
	}

	public static boolean checkEmail(String valid) {
		Matcher matcher = patternEmail.matcher(valid);
		return matcher.matches();
	}

}
