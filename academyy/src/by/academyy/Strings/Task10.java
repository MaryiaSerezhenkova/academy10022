package by.academyy.Strings;
import java.util.Scanner;
 
//Используя оператор switch, написать программу, которая выводит на экран сообщения о принадлежности некоторого
//значения k интервалам (-10k, 0], (0, 5], (5, 10], (10, 10k].
public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int k = scan.nextInt();
        int variable = 0;
        if (k <= 0)
            variable = 0;
        if (k > 0 && k <= 5)
            variable = 1;
        if (k > 5 && k <= 10)
            variable = 2;
        if (k > 10)
            variable = 3;
 
        switch (variable) {
        case 0:
            System.out.println(k + " находится в интервале (" + 10 * k + ",0]");
            break;
        case 1:
            System.out.println(k + " находится в интервале (0, 5]");
            break;
        case 2:
            System.out.println(k + " находится в интервале (5, 10]");
            break;
        case 3:
            System.out.println(k + " находится в интервале (10, " + 10 * k + "]");
            break;
 
        }
    }
}
 
 
 