package entity.dto;

public class ProductCreateDTO {

	private String title;
	private double price;
	private double discount;
	private String description;

	public ProductCreateDTO(String title, double price, double discount, String description) {
		super();
		this.title = title;
		this.price = price;
		this.discount = discount;
		this.description = description;
	}

	public ProductCreateDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
