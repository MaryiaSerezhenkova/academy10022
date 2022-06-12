package by.academyy.oop;

import java.util.Random;

//Наследование Student, Aspirant

//Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием
//некой научной работы.
//Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark,
//содержащую среднюю оценку.
//Создать переменную типа Student, которая ссылается на объект типа Aspirant.
//Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
//Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в классе Aspirant.
//Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
//Создать массив типа Student, содержащий объекты класса Student и Aspirant.
//Вызвать метод getScholarship() для каждого элемента массива.

public class Student {
	protected String firstName;
	protected String lastName;
	protected String group;
	protected int[] mark;
	protected double averageMark;
	Random rand = new Random();

	public Student(String firstName, String lastName, String group) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.group = group;
		this.mark = new int[5];
		for (int i = 0; i < mark.length; i++) {
			mark[i] = rand.nextInt(9);
		}
		int sum = 0;
		for (int i = 0; i < mark.length; i++) {
			sum += mark[i];
		}
		averageMark = (double) sum / mark.length;
	}

	public int getScholarship() {
		if (averageMark >= 5) {
			return 100;
		} else
			return 80;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", group=");
		builder.append(group);
		builder.append(", averageMark=");
		builder.append(averageMark);
		builder.append(", Scholarship=");
		builder.append(getScholarship());
		builder.append("]");
		return builder.toString();
	}
}