package by.academyy.Generics;
import java.util.Iterator;
import java.util.NoSuchElementException;
 
public class GenericIterator<T> implements Iterator<T> {
    private T[] array;
    private int index = 0;
 
    public GenericIterator(T[] array) {
        this.array = array;
    }
 
    @Override
    public boolean hasNext() {
        return index < array.length;
    }
 
    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return array[index++];
    }
}