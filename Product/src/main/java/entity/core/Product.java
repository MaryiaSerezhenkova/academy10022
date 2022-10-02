package entity.core;

public class Product {

	private long id;
	private String title;
	private double price;
	private double discount;
	private String description;

	public Product() {
		super();
	}

	public Product(long id, String title, double price, double discount, String description) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.discount = discount;
		this.description = description;
	}

	public long getId() {
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

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", price=" + price + ", discount=" + discount
				+ ", description=" + description + "]";
	}

}