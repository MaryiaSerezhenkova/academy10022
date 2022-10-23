package core;

import api.IMenuRow;
import api.IPizzaInfo;

public class MenuRow implements IMenuRow {

	private Long id;
	private PizzaInfo pizzaInfo;
	private double price;

	public MenuRow(PizzaInfo pizzaInfo, double price) {
		super();
		this.pizzaInfo = pizzaInfo;
		this.price = price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setPizza(PizzaInfo pizzaInfo) {
		this.pizzaInfo = pizzaInfo;
	}

	public IPizzaInfo getInfo() {
		return (PizzaInfo) this.pizzaInfo;
	}

	public double getPrice() {
		return price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PizzaInfo getPizzaInfo() {
		return pizzaInfo;
	}

	public void setPizzaInfo(PizzaInfo pizzaInfo) {
		this.pizzaInfo = pizzaInfo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MenuRow [id=");
		builder.append(id);
		builder.append(", pizzaInfo=");
		builder.append(pizzaInfo);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

}
