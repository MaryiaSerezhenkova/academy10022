package by.academy.multithreading;

import java.util.ArrayList;
import java.util.List;

public class Port {
	private int containersQuantity;
	private int docksQuantity;
	private int containersCapacity;
	List<Thread> ships = new ArrayList<>();

	public Port(int containersQuantity, int docksQuantity, int containersCapacity) {
		super();
		this.containersQuantity = containersQuantity;
		this.docksQuantity = docksQuantity;
		this.containersCapacity = containersCapacity;
	}

	public int getContainersQuantity() {
		return containersQuantity;
	}

	public void setContainersQuantity(int containersQuantity) {
		this.containersQuantity = containersQuantity;
	}

	public int getDocksQuantity() {
		return docksQuantity;
	}

	public void setDocksQuantity(int docksQuantity) {
		this.docksQuantity = docksQuantity;
	}

	public int getContainersCapacity() {
		return containersCapacity;
	}

	public void setContainersCapacity(int containersCapacity) {
		this.containersCapacity = containersCapacity;
	}

	public void addContainer() {
		containersQuantity++;
	}

	public void takeContainer() {
		containersQuantity--;
	}

	public synchronized void getDock() {

		while (docksQuantity < 1) {
			try {
				wait();
				System.out.println("Wait for free dock");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		ships.add(Thread.currentThread());
		System.out.println(Thread.currentThread().getName() + " can enter the port");
		docksQuantity--;
		notifyAll();
	}

	public synchronized void leavePort() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " is leaving dock");

		System.out.println("Current containers Qty in Port: " + containersQuantity);

		if (ships.contains(Thread.currentThread())) {
			docksQuantity++;
		}
		ships.remove(Thread.currentThread());
		notifyAll();
	}
}