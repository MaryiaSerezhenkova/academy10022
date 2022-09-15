package by.it_academy.servlet;
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
//Найти количество цифр в строке
 
public class Task1 {
 
    public static void main(String[] args) {
        String text = "this 1 text contains 2 digits 123";
        System.out.println(countNumbers(text));
        System.out.println(countNumbers2(text));
    }
 
    public static int countNumbers(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                count++;
            }
        }
        return count;
    }
 
    public static int countNumbers2(String text) {
        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher(text);
        int count = 0;
        while (m.find()) {
            count++;
        }
        return count;
 
    }
 
}
 