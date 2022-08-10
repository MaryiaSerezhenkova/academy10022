package by.academy.multithreading;

import java.util.ArrayList;
import java.util.List;

public class PortDemo {

	public static void main(String[] args) {
		Port port = new Port(100, 2, 1000);

		List<Ship> ships = new ArrayList<>();

		for (int i = 0; i < 4; i++) {
			ships.add(new Ship("Ship " + i, 20, 30, port));
		}

		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("All ships have finished their task");

	}

}
