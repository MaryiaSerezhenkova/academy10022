package by.academy.lesson2;

public class Main {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat(1);
		Cat cat3 = new Cat(2, "Vaska");
		Cat cat4 = new Cat(2, "Petka");
		Cat cat5 = new Cat(2, "Barsik");

		cat1.eat();

		cat3.grow(5);
		
		int cat2Age = cat2.getAge();
		System.out.println(cat2Age);
		
		System.out.println(cat2.getAge());
		cat2.setAge(100);
		System.out.println(cat2.getAge());

		System.out.println(cat2.getNickname());
		cat2.setNickname("Varya");
		System.out.println(cat2.getNickname());
	}
}