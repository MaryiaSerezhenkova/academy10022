package entity.core;
public class ProductBuilder {
	private int id;
	private String title;
	private double price;
	private double discount;
	private String description;

	private ProductBuilder() {
	}

	public static ProductBuilder create() {
		return new ProductBuilder();
	}

	public Product build() {
		return new Product(id, title, price, discount, description);

	}

	public ProductBuilder setId(int id) {
		this.id = id;
		return this;
	}

	public ProductBuilder setTitle(String title) {
		this.title = title;
		return this;
	}

	public ProductBuilder setPrice(double price) {
		this.price = price;
		return this;
	}

	public ProductBuilder setDiscount(double discount) {
		this.discount = discount;
		return this;
	}

	public ProductBuilder setDescription(String description) {
		this.description = description;
		return this;
	}
}