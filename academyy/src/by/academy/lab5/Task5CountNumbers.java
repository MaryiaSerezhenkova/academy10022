package by.academy.lab5;
//Создать программу ввода целых чисел как аргументов командной строки, подсчета их суммы (произведения) и вывода результата на консоль.
 
import java.util.Scanner;
 
public class Task5CountNumbers {
 
    public static void main(String[] args) throws Exception {
        countNumbers(3);
 
    }
 
    public static void countNumbers(int quantity) throws Exception {
        if (quantity<=0) throw new Exception("Number is not valid");
        try (Scanner scan = new Scanner (System.in)) {
            int[] numbers = new int[quantity];
            int sum=0;
            int multiplyAll=1;
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Enter number" + (i + 1));
                numbers[i] = scan.nextInt();
                sum+=numbers[i];
                multiplyAll*=numbers[i];
            }
            System.out.println("Сумма всех элементов: "+sum);    
            System.out.println("Произведение всех элементов: "+multiplyAll);
        }
    }
}