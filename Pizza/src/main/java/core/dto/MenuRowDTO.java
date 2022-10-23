package core.dto;

public class MenuRowDTO {
	private PizzaInfoDTO pizzaInfo;
	private double price;

	public MenuRowDTO() {
	}

	public MenuRowDTO(PizzaInfoDTO pizzaInfoDto, double price) {
		this.pizzaInfo = pizzaInfoDto;
		this.price = price;
	}

	public void setPizzaInfo(PizzaInfoDTO pizzaInfoDto) {
		this.pizzaInfo = pizzaInfoDto;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public PizzaInfoDTO getInfo() {
		return this.pizzaInfo;
	}

	public double getPrice() {
		return price;
	}
}