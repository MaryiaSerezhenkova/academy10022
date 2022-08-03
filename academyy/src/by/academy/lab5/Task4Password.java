package by.academy.lab5;
import java.util.Scanner;
 
//Создать приложение для ввода пароля из командной строки и сравнения его со строкой-образцом
 
public class Task4Password {
    public static final String confirmPassword = "qwerty123";
 
    public static void main(String[] args) throws Exception {
        checkPassword();
        
 
    }
 
    public static void checkPassword() throws Exception {
        try (Scanner scan = new Scanner (System.in)) {
            System.out.println("Enter password");
            String password = scan.next();
 
            if (password == null) {
                throw new Exception("Password is empty");
            }
            if (!password.equals(confirmPassword)) {
                throw new Exception("Passwords not equals");
            }
        }
        System.out.println("Password is valid");
 
    }
}
 