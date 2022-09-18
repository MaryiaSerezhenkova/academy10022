package entity.core;
public class Product {

	private final int id;
	private final String title;
	private final double price;
	private final double discount;
	private final String description;

	public Product(int id, String title, double price, double discount, String description) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.discount = discount;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public double getDiscount() {
		return discount;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", price=" + price + ", discount=" + discount
				+ ", description=" + description + "]";
	}

}