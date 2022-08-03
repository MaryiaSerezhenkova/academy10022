package by.academy.lab5;
import java.util.Scanner;
 
//Создать класс Hello, который будет приветствовать любого пользователя при вводе его имени через командную строку.
 
public class Task1Hello {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your name");
        String name = scan.next();
        System.out.println("Hello, "+name);
        scan.close();
    }
}
 
 
 