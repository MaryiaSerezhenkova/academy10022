package by.academyy.classwork.lesson1;

public class Application {
public static void main (String[] args) {
	Cat cat = new Cat ();
	Cat cat2 = new Cat ("Варя");

	cat2.sleep();
	cat2.eat();
    cat2.walk();

cat.grow(3);
cat.grow(3);
cat.grow(3);
cat.printAge();
cat2.setMoney(500);
}}
