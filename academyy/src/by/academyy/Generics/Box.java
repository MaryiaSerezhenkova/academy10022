package by.academyy.Generics;

import java.util.Arrays;

public class Box <T>{
	private T [] items;
	private int size=0;
	
	public Box() {
	super();
	items = (T[]) new Object[10]; 
	}

	public Box(T[] items) {
		super();
		this.items = items;
		this.size=items.length;
	}
	@SuppressWarnings("unchecked")
	private void growth() {
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
		if (index == size) {
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Box [items=");
		builder.append(Arrays.toString(items));
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(items);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		return Arrays.deepEquals(items, other.items);
	}
	

}
