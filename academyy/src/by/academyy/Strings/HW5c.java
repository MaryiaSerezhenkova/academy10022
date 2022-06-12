package by.academyy.Strings;
// Напишите Java-программу для удаления всех пробелов из строки без использования replace()
 
public class HW5c {
    public static void main(String[] args) {
        String str = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        String[] test = str.split(" ");
        String newStr = String.join("", test);
        System.out.println(newStr);
    }
}