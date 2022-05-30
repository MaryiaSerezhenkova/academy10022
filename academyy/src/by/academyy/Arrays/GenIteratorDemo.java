package by.academyy.Arrays;

public class GenIteratorDemo {
	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		String[] strArray = { "abc", "vbn", "qwe" };
		
		GenericIterator genIt = new GenericIterator(intArray);

		GenericIterator genIt2 = new GenericIterator(strArray);
		while (genIt.hasNext()) {
			
			System.out.println(genIt.next());
		}
		while (genIt2.hasNext()) {
			System.out.println(genIt2.next());
		}

	}
}
