package by.academy.lab4;
//Программа обработки текста, который может быть получен как с консоли, так и с файла.
 
//В тексте после буквы Р, если она не последняя в слове, ошибочно напечатана буква А вместо О. Внести исправления в текст.
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 
public class Task2 {
 
    public static void main(String[] args) {
 
//        String text = "PAram nnpa tap a";
//        System.out.println(replaceA(text));
//        replaceLetter();
        File f = new File("src/Param.txt");
        replaceLetter(f);
 
    }
 
    public static String replaceA(String text) {
        char words[] = text.toCharArray();
        String newString = "";
        for (int i = 0; i < words.length - 1; i++) {
            if ((words[i] == 'P' || words[i] == 'p') & (words[i + 1] == 'A' || words[i + 1] == 'a')) {
                words[i + 1] = 'o';
            }
            newString = new String(words);
        }
        return newString;
 
    }
 
    public static void replaceLetter() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter text");
            String text = scan.nextLine();
            System.out.println(replaceA(text));
        }
    }
 
    public static void replaceLetter(File f) {
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String text = br.readLine();
            System.out.println(replaceA(text));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}