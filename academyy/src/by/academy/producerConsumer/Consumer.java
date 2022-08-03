package by.academy.producerConsumer;

public class Consumer implements Runnable {
	private Store store;

	public Consumer(Store store) {
		super();
		this.store = store;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			store.get();
		}

	}

}
