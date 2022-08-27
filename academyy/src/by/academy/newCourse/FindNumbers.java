package by.academy.newCourse;

public class FindNumbers {

	public static void main(String[] args) {
		String s = "Today is 26 august, 1 2 3";
		System.out.println(findNumbers(s));

	}

	public static int findNumbers(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				count++;
			}
		}
		return count;
	}
}
