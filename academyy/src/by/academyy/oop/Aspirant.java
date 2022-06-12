package by.academyy.oop;

public class Aspirant extends Student {

	public Aspirant(String firstName, String lastName, String group) {
		super(firstName, lastName, group);

	}

	@Override
	public int getScholarship() {
		if (averageMark >= 5) {
			return 200;
		} else
			return 180;
	}
}
