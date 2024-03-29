package by.academy.lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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
		List<T> simple = new ArrayList<>();
		for (int i = 0; i < items.length; i++) {
			if (isSimple(items[i].doubleValue())) {
				simple.add(items[i]);
			}
		}
		return simple;

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

	public List<T> findFibonacciNumbers() {
		List<T> fib = new ArrayList<>();
		for (int i = 0; i < items.length; i++) {
			if (isFibonacci(items[i].doubleValue())) {
				fib.add(items[i]);
			}
		}
		return fib;

	}

	private boolean isFibonacci(double n) {
		for (int i = 0; i < fibonacciArray().length; i++) {
			if (n != fibonacciArray()[i]) {
				return false;
			}
		}

		return true;
	}

	private Double[] fibonacciArray() {
		Integer n = (int) maxElement();
		Double[] fibonacci = new Double[n + 1];
		fibonacci[0] = 0.0;
		fibonacci[1] = 1.0;

		for (int i = 2; i < n; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		return fibonacci;
	}

	public List<T> findDif10Numbers() {
		List<T> dif = new ArrayList<>();
		for (int i = 0; i < items.length; i++) {
			if (isDifNumbers(items[i].doubleValue())) {
				dif.add(items[i]);
			}
		}
		return dif;

	}

	private boolean is3DijitNumbers(double n) {
		if (n / 100 < 1 || n / 100 > 9) {
			return false;
		}
		return true;
	}

	private boolean isDifNumbers(double n) {
		if (!is3DijitNumbers(n)) {
			return false;
		}
		if (get10value(n)[0] != get10value(n)[1] & get10value(n)[0] != get10value(n)[2]
				& get10value(n)[1] != get10value(n)[2]) {
			return true;
		}
		return false;

	}

	private int[] get10value(double n) {
		if (!is3DijitNumbers(n)) {
			return null;
		}
		int[] values = new int[3];
		values[0] = (int) n / 100;
		values[1] = (int) (n - values[0] * 100) / 10;
		values[2] = (int) (n - values[0] * 100 - values[1] * 10);
		return values;
	}

	public void fillFromConsole(int n) {
		ArrayList<Double> arr = new ArrayList<>(n);// Как сделать с Т???
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter " + n + " numbers");
			for (int i = 0; i < n; i++) {
				double x = scan.nextDouble();
				arr.add(x);
			}
		}
		System.out.println(arr.toString());
	}

//	public void fillFromFile(String filename) {
//		String s;
//		ArrayList<T>arr = new ArrayList<>();
//		try (BufferedReader br=new BufferedReader(new FileReader(new File(filename)))) {
//			while((s=br.readLine())!=null) {
//				String[]array = s.split(" ");
//				for (int i=0; i<array.length; i++) {
//					arr.add(Double.valueOf(array[i]).doubleValue());
//				}
//				
//			}
//			
//		}catch (IOException e) {
//			
//		}
//	}
	public void fillRandom(int n, int start, int end) {
		ArrayList<Double> arr = new ArrayList<>(n);// Как сделать с Т???
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			double x = rand.nextDouble(start, (end - start) + 1);
			arr.add(x);
		}

		System.out.println(arr.toString());
	}
}
