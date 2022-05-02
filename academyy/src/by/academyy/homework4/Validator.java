package by.academyy.homework4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	public static Pattern patterndate = Pattern.compile("^\\d{2}[\\/\\-]\\d{2}[\\/\\-]\\d{4}$");

	public static boolean checkdate(String date) {
		Matcher matcher = patterndate.matcher(date);
		return matcher.matches();
	}

}
