package by.academy.patterns;

public class CarFactory {
	
	public static Car buildCar(CarType t) {
		switch (t) {
		case SMALL: return new SmallCar();
		case SEDAN: return new Sedan();
		case SPORT: return new SportCar();
		default: throw new RuntimeException("");
		}
	}

}
