package by.academyy.lesson16;

public class BirdDemo{
	
	public static void main(String[] args) {
	
	Bird bird1 = new Bird("vorona");
	Flyable f = b -> System.out.println("I can fly");
	f.fly(bird1);
	
    Printable p = b -> System.out.println("This is "+ b);
    p.print(bird1);
    
}
}
