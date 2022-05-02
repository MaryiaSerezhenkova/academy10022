package by.academyy.homework4;

import java.util.Arrays;

public class ArrayT<T> {

	private T[] array;
	private int index;

	public ArrayT() {
		super();
		this.array = (T[]) new Object[16];
	}

	public ArrayT(int arrayLength) {
		super();
		this.array = (T[]) new Object[arrayLength];
	}

	public void add(T object) {
		if (index >= array.length) {
			arrayGrow();
		}
		array[index++] = object;
	}

	private void arrayGrow() {
		T[] xArray = (T[]) new Object[array.length * 2 + 1];
		System.arraycopy(array, 0, xArray, 0, array.length);
		this.array = xArray;
	}

	public T get(int i) throws IndexOutOfBoundsException {
		if (i >= array.length) {
			throw new IndexOutOfBoundsException("<IndexOutOfBoundsException>");
		}
		return array[i];
	}

	public void remove(int i) {
		if (i < array.length && i >= 0) {
			System.arraycopy(array, i + 1, array, i, array.length - i - 1);
			index--;
		}
	}

	public void remove(T a) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null && array[i].equals(a)) {
				System.arraycopy(array, i + 1, array, i, array.length - i - 1);
				index--;
				break;
			}
		}
	}

	public T getFirst() {
		return array[0];
	}

	public T getLast() {
		return array[index - 1];
	}

	public int lastIndex() {
		return index - 1;
	}

	public int size() {
		return index;
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Array");
		builder.append(Arrays.toString(array));
		return builder.toString();
	}

	public Task3Iterator getIterator() {
		return new MyIterator();
	}

	private class MyIterator implements Task3Iterator {

		int index;

		@Override
		public boolean hasNext() {
			return index < array.length;
		}

		@Override
		public Object next() {
			return array[index++];
		}

		@Override
		public void remove() {
			// for (int i = 0; i < array.length; i++) {
			// if (array[i].equals( Object next())
			// System.arraycopy(array, i + 1, array, i, array.length - i - 1);
			// index--;
			// break;
		}

	}

}
