package by.academyy.Strings;
import java.util.Scanner;
 
//Используя оператор switch, написать программу, которая выводит на экран сообщения о принадлежности некоторого
//значения k интервалам (-10k, 5], [0, 10], [5, 15], [10, 10k]
public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int k = scan.nextInt();
        int variable = 0;
        if (k < 0)
            variable = 0;
        if (k >= 0 && k < 5)
            variable = 1;
        if (k ==5)
            variable = 3;
        if (k > 5 && k < 10)
            variable = 2;
        if (k ==10)
            variable = 4;
        
        if (k > 10 && k <= 15)
            variable = 5;
        if (k > 15)
            variable = 6;
        
        switch (variable) {
        case 0:
            System.out.println(k + " находится в интервале [" + 10 * k + ",5]");
            break;
        case 1:
            System.out.println(k + " находится в интервалах [" + (-10) * k + ",5]" + ",  [0, 10]");
            break;
        case 2:
            System.out.println(k + " находится в интервале [0, 10], [5, 15]");
            break;
        case 3:
            System.out.println(k + " находится в интервалах [" + (-10) * k + ",5]" + ",  [0, 10], [5, 15]");
            break;
        case 4:
            System.out.println(k + " находится в интервале [0, 10], [5, 15], [10, " + 10 * k + "]");
            break;
                    
        case 5:
            System.out.println(k + " находится в интервале [5, 15], [10, " + 10 * k + "]");
            break;
        case 6:
            System.out.println(k + " находится в интервале [10, " + 10 * k + "]");
            break;
 
        }
    }
}
