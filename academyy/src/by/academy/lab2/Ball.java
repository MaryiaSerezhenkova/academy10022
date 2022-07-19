package by.academy.lab2;
//Создать класс Мяч. Создать класс Корзина.

//Наполнить корзину мячиками. Определить вес мячиков в корзине и количество синих мячиков.

public class Ball {
	public String color;
	public int weight;

	public Ball() {
		super();
	}

	public Ball(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ball [color=");
		builder.append(color);
		builder.append(", weight=");
		builder.append(weight);
		builder.append("]");
		return builder.toString();
	}

}
