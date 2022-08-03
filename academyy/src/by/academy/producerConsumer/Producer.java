package by.academy.producerConsumer;

public class Producer implements Runnable {
	private Store store;

	public Producer(Store store) {
		super();
		this.store = store;
	}

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			store.add();

		}
	}

}
