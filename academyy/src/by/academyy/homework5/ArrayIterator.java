package by.academyy.homework5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
 
 
//Написать итератор по двумерному массиву. (Отдельный класс. Наследуемся от Iterator<T>)
//Протестировать в main.
 
public class ArrayIterator<T> implements Iterable<T> {
 
    private final List<T> elements;
 
    public ArrayIterator(T[][] array) {
        elements = new LinkedList<>();
        for (T[] array1 : array) {
            for (T array11 : array1)
                elements.add(array11);
        }
    }
 
    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }
 
    public static void main(String[] args) {
 
        Integer[][] array = { { 1 }, { 2, 3, 4, 5, }, { 8, 9, 10, 11, 12, }, {1, 3} };
        ArrayIterator<Integer> arrayIterator = new ArrayIterator<>(array);
        Iterator<Integer> iterator = arrayIterator.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
 
    }
 
}