package Shop;

public abstract class Product {
	protected String name;
	protected String type;
	protected double price;
	protected int quantity;
	
	public Product() {
		super();
	}

	public Product(String name, String type, double price, int quantity) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}
	public double getCalculatedPrice() {
		return price*quantity;}
	
	public abstract double getDiscount();
	
	public Product(int quantity, double price, String name) {
		this.quantity = quantity;
		this.price = price;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", type=" + type + ", price=" + price + ", quantity=" + quantity + ", getName()="
				+ getName() + ", getType()=" + getType() + ", getPrice()=" + getPrice() + ", getQuantity()="
				+ getQuantity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
