package Shop;
@Producer (startYear = 1995, founderFullName = "VVV")

public class Vine extends Product {
	protected String color;
	protected int age;

	public Vine() {
		super();
	}

	public Vine(String name, String type, double cost, int quantity, String color, int age) {
		super(name, type, cost, quantity);
		this.color = color;
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Vine [color=" + color + ", age=" + age + "]";
	}

	@Override
	public double getDiscount() {
		if (quantity >= 3) {
		return 0.8;
	}
		return 1;
}
}
