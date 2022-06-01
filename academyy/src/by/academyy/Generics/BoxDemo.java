package by.academyy.Generics;

public class BoxDemo {
	public static void main(String[] args) {
		Box <Integer> box1 = new Box<>();
		box1.add(5);
		box1.add(15);
		box1.add(25);
		box1.remove(1);
		box1.set(1, 125);
		System.out.println(box1.get(1));
	}

}
