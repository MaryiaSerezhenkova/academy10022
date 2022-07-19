package by.academy.lab2;

import java.util.ArrayList;

public class Basket {
	public ArrayList<Ball> basket;

	public Basket(ArrayList<Ball> basket) {
		super();
		this.basket = basket;
	}

	public ArrayList<Ball> getBasket() {
		return basket;
	}

	public void setBasket(ArrayList<Ball> basket) {
		this.basket = basket;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Basket [basket=");
		builder.append(basket);
		builder.append("]");
		return builder.toString();
	}
}
