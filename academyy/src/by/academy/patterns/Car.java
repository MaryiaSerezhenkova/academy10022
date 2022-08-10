package by.academy.patterns;

public class Car {
	private CarType type;

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}

	public Car(CarType type) {
		super();
		this.type = type;
	}
	

}
