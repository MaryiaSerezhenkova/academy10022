package by.academyy.homework4;

public class ArrayTDemo {
	public static void main(String[] args) {
		ArrayT<Integer> array1 = new ArrayT<>();

		array1.add(3);
		array1.add(13);
		array1.add(23);

		System.out.println("Arrays size " + array1.size());

		try {
			System.out.println(array1.get(3));
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(array1.get(17));
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(array1.get(1));
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("First element: " + array1.getFirst());
		System.out.println("Last element: " + array1.getLast());
		System.out.println("Last elements index: " + array1.lastIndex());

		System.out.println(array1.toString());
		array1.remove(0);
		System.out.println(array1.toString());

		Integer a = 13;
		array1.remove(a);
		System.out.println(array1.toString());

	}

}
