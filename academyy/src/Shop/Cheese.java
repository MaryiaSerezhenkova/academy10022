package Shop;
@Producer (startYear = 2022, founderFullName = "SSS")
public class Cheese extends Product{
	protected int age;
	protected String sort;

	public Cheese() {
		super();
	}

	public Cheese(String name, String type, double cost, int quantity, int age, String sort) {
		super(name, type, cost, quantity);
		this.age = age;
		this.sort = sort;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "Cheese [age=" + age + ", sort=" + sort + "]";
	}

	@Override
	public double getDiscount() {
		if (age >= 5) {
		return 0.9;}
		return 1;
	}
	

}
