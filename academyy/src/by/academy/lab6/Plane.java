package by.academy.lab6;

import java.util.Objects;

//Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию. Посчитать общую вместимость и грузоподъемность.
//Провести сортировку самолетов компании на основе одного и нескольких параметров.
//Найти самолет в компании, соответствующий заданному диапазону параметров потребления горючего.
enum PlaneType {
	lONGFLIGHT, MIDDLEFLIGHT, SHORTFLIGHT
}

public class Plane {
	PlaneType type;
	public String model;
	public int capacity;
	public int carryingСapacity;
	public int fuelСonsumption;

	public Plane(PlaneType type, String model, int capacity, int carryingСapacity, int fuelСonsumption) {
		super();
		this.type = type;
		this.capacity = capacity;
		this.carryingСapacity = carryingСapacity;
		this.fuelСonsumption = fuelСonsumption;
		this.model = model;
	}

	public PlaneType getType() {
		return type;
	}

	public void setType(PlaneType type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCarryingСapacity() {
		return carryingСapacity;
	}

	public void setCarryingСapacity(int carryingСapacity) {
		this.carryingСapacity = carryingСapacity;
	}

	public int getFuelСonsumption() {
		return fuelСonsumption;
	}

	public void setFuelСonsumption(int fuelСonsumption) {
		this.fuelСonsumption = fuelСonsumption;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Plane [type=");
		builder.append(type);
		builder.append(", model=");
		builder.append(model);
		builder.append(", capacity=");
		builder.append(capacity);
		builder.append(", carryingСapacity=");
		builder.append(carryingСapacity);
		builder.append(", fuelСonsumption=");
		builder.append(fuelСonsumption);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(capacity, carryingСapacity, fuelСonsumption, model, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plane other = (Plane) obj;
		return capacity == other.capacity && carryingСapacity == other.carryingСapacity
				&& fuelСonsumption == other.fuelСonsumption && Objects.equals(model, other.model) && type == other.type;
	}
}
