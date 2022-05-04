package by.academyy.lesson16;

import java.util.function.Consumer;

import by.academyy.lesson12.HeavyBox;

 
//6.    Написать лямбда выражение, которое принимает на вход объект типа HeavyBox и выводит на консоль сообщение
//“Отгрузили ящик с весом n”. “Отправляем ящик с весом n” Используем функциональный интерфейс Consumer
//и метод по умолчанию andThen.
 
 
public class Task6Lambda {
    
    public static void main(String[] args) {
        HeavyBox box1 = new HeavyBox (10, 1, 1, 5);
        
        
        Consumer<HeavyBox> printWeight = n -> System.out.println("Отгрузили ящик с весом " + n.getWeight());
 
        Consumer<HeavyBox> printSending = n -> System.out.println("Отправляем ящик с весом " + n.getWeight());
        
        printWeight.andThen(printSending).accept(box1);
    }
}