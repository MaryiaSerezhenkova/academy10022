package by.academyy.InnerClasses;

//Анонимный класс Cookable
//Создать интерфейс Cookable, содержащий метод void cook(String str).
//Создать класс Food, содержащий метод public void prepare(Cookable c, String str) { c.cook(str);}

public class Food implements Cookable {
	protected String name;
	protected int quantity;

	public Food() {
		super();
	}

	public Food(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}

	public void prepare(Cookable c, String str) {
		c.cook(str);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Food [name=");
		builder.append(name);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public void cook(String str) {
		System.out.println(str+" "+ this.name);
		
	}

}
