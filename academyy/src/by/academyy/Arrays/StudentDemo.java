package by.academyy.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentDemo {
	public static void main(String[] args) {
		Student st1 = new Student("Nick", "108122", 3);
		Student st2 = new Student("Jim", "103115", 4);
		Student st3 = new Student("Kate", "101388", 5);
		Student st4 = new Student("Nina", "108122", 3);

		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(st1);
		studentList.add(st2);
		studentList.add(st3);
		studentList.add(st4);
		System.out.println(studentList.toString());
		System.out.println();
		System.out.println(st1.getAverageMark());
		System.out.println(st2.getAverageMark());
		System.out.println(st3.getAverageMark());
		System.out.println(st4.getAverageMark());

		nextCourse(studentList);
		printStudents(studentList, 3);

	}

	public static void nextCourse(ArrayList<Student> a1) {
		Student[] st1 = new Student[a1.size()];
		a1.toArray(st1);
		for (int i = 0; i < st1.length; i++) {
			if (st1[i].getAverageMark() >= 3 && st1[i].getCourse() < 5) {
				System.out.println(st1[i].getName() + " go to the " + (st1[i].getCourse() + 1) + " course ");
			}
			if (st1[i].getAverageMark() >= 3 && st1[i].getCourse() == 5) {
				System.out.println(st1[i].getName() + " sucsesfully end the University");
			}
			if (st1[i].getAverageMark() < 3) {
				a1.remove(st1[i]);
				System.out.println(st1[i].getName() + " expelled from the University");
			}
		}
	}

	public static void printStudents(ArrayList<Student> a1, int a) {
		Student[] sameCourse = new Student[a1.size()];
		a1.toArray(sameCourse);
		for (int i = 0; i < sameCourse.length; i++) {
			if (sameCourse[i].getCourse() == a) {
//				System.out.println("List of "+ a+ "course: ");
//				System.out.println(sameCourse[i].getName());
				System.out.print(a1.get(i) + " ");
			}
		}
	}
}
