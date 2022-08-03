package by.academy.multithreading;

public class ThreadDemo2 {

	public static void main(String[] args) {
		CustomThread t1 = new CustomThread();
		t1.start();
		System.out.println("Hello from main");
		Thread t2 = new Thread(new CustomThread2());
		t2.start();
	}

}
