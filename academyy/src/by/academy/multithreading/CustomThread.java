package by.academy.multithreading;

public class CustomThread extends Thread {

	@Override
	public void run() {
		System.out.println("Hello from thread"+ getName());
	}
}
