package by.academyy.Generics;

import java.util.Arrays;

//Написать обобщенный класс MinMax, который содержит методы для нахождения минимального и максимального
//элемента массива. Массив является переменной класса. Массив должен передаваться в класс через конструктор.

public class MinMax<T extends Comparable<T>> {
	private T[] array;
	private T max;
	private T min;
	private int size = 0;

	public MinMax() {
		super();

	}

	public MinMax(T[] array) {
		super();
		this.array = array;

	}

	public T maxElement() {
		max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i].compareTo(max) > 0) {
				max = array[i];
			}
		}
		return max;
	}

	public T minElement() {
		min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i].compareTo(min) < 0) {
				min = array[i];
			}
		}
		return min;
	}

	private void growth() {
		T[] temp = (T[]) new Object[2 * array.length + 1];
		System.arraycopy(array, 0, temp, 0, array.length);
		array = temp;
	}

	public void add(T array1) {
		if (size >= array.length) {
			growth();
		}
		array[size++] = array1;
	}

	public void remove(int index) {
		if (index >= size || index < 0) {
			System.out.println("Попытка удаления пустого элемента");
			return;
		}

		if (index < size) {
			System.arraycopy(array, index + 1, array, index, size - index - 1);
		}
		array[--size] = null;
	}

	public void set(int index, T array1) {
		if (index >= array.length || index < 0) {
			System.out.println(index + " indexOutBoundOfArray");
			return;
		}
		if (index == size) {
			array[size++] = array1;
		} else {
			array[index] = array1;
		}
	}

	public T get(int index) {
		if (index >= size || index < 0) {
			System.out.println("Выход за предел массива");
			return null;
		} else {
			return array[index];
		}
	}

	public T[] getArray() {
		return array;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MinMax [array=");
		builder.append(Arrays.toString(array));
		builder.append("]");
		return builder.toString();
	}
}
