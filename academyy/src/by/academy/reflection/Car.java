package by.academy.reflection;

public class Car extends Vehicle {
	public String color;
	private final int age;
	int wheelNumber;
	
	public Car(int age) {
		super();
		this.age=age;
	}
	@Producer(country = "New Zeland", founderFullName = "NewZelander", startYear = 1600)
	private void test1(String s) {
		System.out.println("Test1"+s);
	}

	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getWheelNumber() {
		return wheelNumber;
	}



	public void setWheelNumber(int wheelNumber) {
		this.wheelNumber = wheelNumber;
	}



	public int getAge() {
		return age;
	}



	@Override
	public String toString() {
		return "Car [color=" + color + ", age=" + age + ", wheelNumber=" + wheelNumber + "]";
	}
	

}
