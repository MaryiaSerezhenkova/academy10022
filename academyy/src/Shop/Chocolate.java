package Shop;
@Producer (startYear = 2022, founderFullName = "AlpenGold")


public class Chocolate extends Product {
	protected String color;
	protected String filling;

	public Chocolate() {
		super();
	}

	public Chocolate(String name, String type, double cost, int quantity, String color, String filling) {
		super(name, type, cost, quantity);
		this.color = color;
		this.filling = filling;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFilling() {
		return filling;
	}

	public void setFilling(String filling) {
		this.filling = filling;
	}

	@Override
	public String toString() {
		return "Chocolate [color=" + color + ", filling=" + filling + "]";
	}

	@Override
	public double getDiscount() {
		if (quantity >= 5) {
			return 0.9;
		}
			return 1;
	}

}
