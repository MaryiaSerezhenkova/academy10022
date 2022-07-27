package by.academy.lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Создание типа Array, который является классом оболочкой над массивом целого типа.

//В данном типе должны быть реализованы конструкторы (позволяющие несколькими способами создавать объекты типа),
//get-ы, set-ы и переопределенные методы класса Object (toString(), equals(), hasCode()).

public class ArrayListCustom<T extends Number> {

	private T[] items;
	private int size;

	@SuppressWarnings("unchecked")
	public ArrayListCustom() {
		super();
		items = (T[]) new Object[10];
	}

	@SuppressWarnings("unchecked")
	public ArrayListCustom(int initCap) {
		super();
		items = (T[]) new Object[initCap];
	}

	public ArrayListCustom(T[] items) {
		super();
		this.items = items;
		size = items.length;
	}

	private void growth() {
		@SuppressWarnings("unchecked")
		T[] temp = (T[]) new Object[2 * items.length + 1];
		System.arraycopy(items, 0, temp, 0, items.length);
		items = temp;
	}

	public void add(T item) {
		if (size >= items.length) {
			growth();
		}
		items[size++] = item;
	}

	public void remove(int index) {
		if (index >= size || index < 0) {
			System.out.println("Попытка удаления пустого элемента");
			return;
		}

		if (index < size) {
			System.arraycopy(items, index + 1, items, index, size - index - 1);
		}
		items[--size] = null;
	}

	public void set(int index, T item) {
		if (index >= items.length || index < 0) {
			System.out.println(index + " indexOutBoundOfArray");
			return;
		}
		if (index >= size) {
			items[size++] = item;
		} else {
			items[index] = item;
		}
	}

	public T get(int index) {
		if (index >= size || index < 0) {
			System.out.println("Выход за предел массива");
			return null;
		} else {
			return items[index];
		}
	}

	public T[] getItems() {
		return items;
	}

	public double maxElement() {
		if (items.length == 0) {
			return 0;
		}
		if (items.length == 1) {
			return items[0].doubleValue();
		}
		double max = items[0].doubleValue();

		for (int i = 1; i < items.length; i++) {
			if (items[i].doubleValue() > max) {
				max = items[i].doubleValue();
			}
		}
		return max;
	}

	public double minElement() {
		if (items.length == 0) {
			return 0;
		}
		if (items.length == 1) {
			return items[0].doubleValue();
		}
		double min = items[0].doubleValue();

		for (int i = 1; i < items.length; i++) {
			if (items[i].doubleValue() < min) {
				min = items[i].doubleValue();
			}
		}
		return min;
	}

	private void swap(int index1, int index2) {
		T temp = items[index1];
		items[index1] = items[index2];
		items[index2] = temp;
	}

	public void bubbleSort() {
		boolean needIteration = true;
		while (needIteration) {
			needIteration = false;
			for (int i = 0; i < items.length - 1; i++) {
				if (items[i].doubleValue() > items[i + 1].doubleValue()) {
					swap(i, i + 1);
					needIteration = true;
				}
			}

		}
	}

	public T binarySearch(T item) {
		bubbleSort();
		return binarySearch(items, 0, items.length - 1, item);
	}

	private T binarySearch(T[] arr, int l, int r, T item) {
		if (r >= l) {
			int mid = (r - l) / 2;
			if (arr[mid].equals(item)) {
				return arr[mid];
			}
			if (arr[mid].doubleValue() > item.doubleValue()) {
				return binarySearch(arr, l, mid - 1, item);
			} else {
				return binarySearch(arr, mid + 1, r, item);

			}
		}

		return null;
	}

	public List<T> findSimpleNumbers() {
		List<T> sum = new ArrayList<>();
		for (int i = 0; i < items.length; i++) {
			if (isSimple(items[i].doubleValue())) {
				sum.add(items[i]);
			}
		}
		return sum;

	}

	private boolean isSimple(double n) {
		int counter = 0;
		for (int i = 2; i < n; i++) {
			if (counter >= 1) {
				return false;
			}
			if (n % i == 0) {
				counter++;
			}

		}
		return true;
	}
	public void fillFromFile(String filename) {
		String s;
		ArrayList<T>arr = new ArrayList<>();
		try (BufferedReader br=new BufferedReader(new FileReader(new File(filename)))) {
			while((s=br.readLine())!=null) {
				String[]array = s.split(" ");
				for (int i=0; i<array.length; i++) {
					arr.add(Double.valueOf(array[i]).doubleValue());
				}
				
			}
			
		}catch (IOException e) {
			
		}
	}
}
