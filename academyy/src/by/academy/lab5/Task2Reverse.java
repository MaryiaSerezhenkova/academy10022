package by.academy.lab5;
//Создать приложение, которое отображает в окне консоли аргументы командной строки метода main() в обратном порядке.
 
import java.util.Scanner;
 
public class Task2Reverse {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        char[] symb = text.toCharArray();
        for (int i = symb.length - 1; i >= 0; i--) {
            System.out.print(symb[i]);
        }
        scan.close();
    }
 
}
 