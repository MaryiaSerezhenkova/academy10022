package by.academyy.lesson16;

import java.util.Random;
import java.util.function.Supplier;
 
//1.    Написать лямбда выражение, которое возвращает случайное число от 0 до 10.
//Используем функциональный интерфейс Supplier.
 
public class Task8Lambda {
    public static void main(String[] args) {
 
        Random rand = new Random();
 
        Supplier<Integer> supplierNum = () -> rand.nextInt(11);
 
        System.out.println(supplierNum.get());
    }
}
    