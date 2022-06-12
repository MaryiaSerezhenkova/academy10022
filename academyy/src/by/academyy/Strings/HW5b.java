package by.academyy.Strings;
//Напишите Java-программу для удаления всех пробелов из строки с помощью replace()
public class HW5b {
    public static void main(String[] args) {
        String str = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
 
        String newStr = str.replaceAll("\\s+", "");
        System.out.println(newStr);
    }
}
 