package by.academyy.RegEx;
//Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//текста также могут быть пробелы, но могут и отсутствовать.
 
import java.util.Arrays;
import java.util.regex.Pattern;
 
public class Task2 {
    public static void main(String[] args) {
        String words = "Подсчитать количество (0-5) слов123...   в тексте!.";
        words = words.replaceAll("[!.,:;()-d]", "");
        Pattern pattern = Pattern.compile("\\s+");
        String[] word = pattern.split(words);
        System.out.print(Arrays.toString(word));
        System.out.println();
        System.out.println(word.length);
    }
}