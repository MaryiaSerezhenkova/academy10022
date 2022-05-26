package by.academyy.Arrays;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator implements Iterator <Integer>{
	
	private int [] array;
	private int index=0;
	
	public ArrayIterator(int array[]) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		
		return index<array.length;
	}

	@Override
	public Integer next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		
		return array[index++];
	}

}
