package by.academy.producerConsumer;

public class Store {
	private int product = 0;

	public synchronized void get() {
		while (product < 1) {
			try {
				wait();
				System.out.println("Wait for resourse");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		product--;
		System.out.println(Thread.currentThread().getName() + "Consumer got 1 product. Number of products: " + product);
		notifyAll();
	}

	public synchronized void add() {
		while (product >= 10) {
			try {
				wait();
				System.out.println("Wait for place");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		product++;
		System.out.println(Thread.currentThread().getName() + "Producer add 1 product. Number of products: " + product);
		notifyAll();
	}
}
