package by.academy.multithreading;

public class ThreadDemo1 {

	public static void main(String[] args) {
		Thread t1 = new Thread (new Runnable () {

			@Override
			public void run() {
				for (int i=0; i<=1000; i++) {
					System.out.println(i+" in thread");
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
				}
				
			}
			
		});
		t1.setDaemon(false);
		t1.start();
		
		for (int i=0; i<=1000; i++) {
			System.out.println(i+" outside thread");
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		t1.start();
	}

}
