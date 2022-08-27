package by.academy.newCourse;

public class Wheel extends Detail {
	private double radius;

	public Wheel(String name, int quantity, double radius) {
		super(name, quantity);
		this.radius = radius;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Detail [name=");
		builder.append(name);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", radius=");
		builder.append(radius);
		builder.append("]");
		return builder.toString();
	}

}
