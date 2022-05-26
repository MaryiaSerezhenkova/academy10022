package by.academyy.Arrays;

public class ArrayIteratorDemo {

	public static void main(String[] args) {
		int[] array = {1,5,3,17,2};
		ArrayIterator arIt = new ArrayIterator(array);
		while (arIt.hasNext()) {
			
			System.out.println(arIt.next());
		}

	}

}
