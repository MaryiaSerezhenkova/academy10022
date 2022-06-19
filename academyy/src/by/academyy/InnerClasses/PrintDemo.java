package by.academyy.InnerClasses;

public class PrintDemo {

	public static void main(String[] args) {
		User user5 = new User() {
			@Override
			public void print() {
				printAge();
				System.out.print("Print login+password");
			}

			public void printAge() {
				System.out.println("Print age");
			}
		};
		user5.print();
	}
}
