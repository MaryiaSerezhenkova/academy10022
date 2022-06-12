package by.academyy.oop;

public class StudentDemo {
	public static void main(String[] args) {
		Student[] students = new Student[4];
		students[0] = new Student("Kate", "Smith", "108108");
		students[1] = new Student("Jane", "Grant", "105105");
		students[2] = new Aspirant("Jack", "Davis", "233233");
		students[3] = new Aspirant("Nick", "Williams", "255255");

		for (int i = 0; i < students.length; i++) {

			System.out.println(students[i].toString());
		}
	}
}