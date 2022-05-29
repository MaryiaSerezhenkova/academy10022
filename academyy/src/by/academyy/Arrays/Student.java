package by.academyy.Arrays;
//Добавить студентов в коллекцию
//Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
//Создать коллекцию, содержащую объекты класса Student.
//Написать метод, который удаляет студентов со средним баллом меньше 3.
//Если средний балл>=3, студент переводится на следующий курс.
//Напишите метод printStudents(List<Student> students, int course), который получает список студентов и номер курса.
//А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.

import java.util.Arrays;
import java.util.Random;

public class Student {
	protected String name;
	protected String group;
	protected int course;
	protected int[]marks;
	protected int count=0;
	protected double averageMark;
	Random rand = new Random();
	
	public Student() {
		super();
	}

	public Student(String name, String group, int course) {
		super();
		this.name = name;
		this.group = group;
		this.course = course;
		this.marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = rand.nextInt(11);
            count+= marks[i];        
        }
        averageMark = count/marks.length;        
	}

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", group=");
		builder.append(group);
		builder.append(", course=");
		builder.append(course);
		builder.append(", marks=");
		builder.append(Arrays.toString(marks));
		builder.append("]");
		return builder.toString();
	}

}
