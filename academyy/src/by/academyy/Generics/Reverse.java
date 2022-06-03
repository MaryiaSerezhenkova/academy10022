package by.academyy.Generics;

import java.util.Arrays;
//Написать класс Reverse, который является дженериком. Класс принимает массив. Добавить метод reverse,
//который позволяет менять порядок элементов на обратный.

public class Reverse<T> {
	private T[] array;
	private T temp;

	public Reverse(T[] array) {
		this.array = array;
	}

	public void reverse() {
		int n = array.length;
		for (int i = 0; i < n / 2; i++) {
			temp = array[n - i - 1];
			array[n - i - 1] = array[i];
			array[i] = temp;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reverse [array=");
		builder.append(Arrays.toString(array));
		builder.append("]");
		return builder.toString();
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public T getTemp() {
		return temp;
	}

	public void setTemp(T temp) {
		this.temp = temp;
	}
}
