package by.academy.newCourse;

public class Motor extends Detail {
	private int power;

	public Motor(String name, int quantity, int power) {
		super(name, quantity);
		this.power = power;

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Detail [name=");
		builder.append(name);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", power=");
		builder.append(power);
		builder.append("]");
		return builder.toString();
	}

}
