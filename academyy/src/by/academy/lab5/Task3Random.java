package by.academy.lab5;
 
import java.util.Arrays;
import java.util.Random;
 
//Создать приложение, выводящее заданное количество случайных чисел с переходом и без перехода на новую строку.
 
public class Task3Random {
 
    public static void main(String[] args) {
        randomNumbers(5, 1, 20);
 
    }
 
    public static void randomNumbers(int quantity, int start, int end) {
        
    int[] array = new int [quantity];
    Random rand  = new Random();
    for (int i = 0; i < quantity; i++) {
        array[i] = rand.nextInt(end-start+1) + start;
        System.out.println(array[i]);
        System.out.println();
    }
    System.out.println(Arrays.toString(array));
 
    }
}
 
 