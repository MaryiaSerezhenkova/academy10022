package by.academy.lab6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Airline {

	public static void main(String[] args) {
		Plane plane1 = new Plane(PlaneType.lONGFLIGHT, "Boeing-777", 235, 20, 2600);
		Plane plane2 = new Plane(PlaneType.MIDDLEFLIGHT, "Ту-154", 180, 18, 5400);
		Plane plane3 = new Plane(PlaneType.SHORTFLIGHT, "Ту-134", 80, 8, 2500);
		ArrayList<Plane> airline = new ArrayList<>();
		airline.add(plane1);
		airline.add(plane1);
		airline.add(plane1);
		airline.add(plane2);
		airline.add(plane2);
		airline.add(plane2);
		airline.add(plane2);
		airline.add(plane2);
		airline.add(plane3);
		airline.add(plane3);
		airline.add(plane3);
		System.out.println("Общая вместимость " + allCapacity(airline) + " человек");
		System.out.println("Общая грузоподъемность " + allСarryingСapacity(airline) + " тонн");
		CapacityComparator myComparator = new CapacityComparator();
		airline.sort(myComparator);
		System.out.println("Sorted: ");
		for (Plane p : airline) {
			System.out.println(p);
		}
		System.out.println(findPlane(airline, 500));

		Searchable s = plane -> plane.getModel().equals("Boeing-777");

		try {
			System.out.println(planeModels(airline, s));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static int allCapacity(ArrayList<Plane> plane) {
		int sum = 0;
		for (Plane p : plane) {
			sum += p.capacity;
		}

		return sum;
	}

	public static int allСarryingСapacity(ArrayList<Plane> plane) {
		int sum = 0;
		for (Plane p : plane) {
			sum += p.getCarryingСapacity();
		}

		return sum;
	}

	public static String findPlane(ArrayList<Plane> plane, int value) {
		ArrayList<Plane> plane2 = new ArrayList<>();
		for (Plane p : plane) {
			if (p.fuelСonsumption <= value) {
				plane2.add(p);
			}
		}
		if (plane2.isEmpty() == true) {
			System.out.println("Самолет с такими параметрами не найден ");
		}
		return plane2.toString();
	}

	public static int planeModels(ArrayList<Plane> plane, Searchable s) throws IOException {
		int result = 0;

		for (Plane p : plane) {
			if (s.test(p)) {
				result++;
			}
		}
		return result;
	}

}
