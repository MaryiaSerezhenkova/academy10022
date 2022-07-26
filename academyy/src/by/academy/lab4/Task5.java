package by.academy.lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Программа обработки текста, который может быть получен как с консоли, так и с файла.
//Из текста удалить все слова заданной длины, начинающиеся на согласную букву.
 
public class Task5 {
 
    public static void main(String[] args) {
        String text = "PAram pam amp pam abnbnb";
        System.out.println(removeWord(text, 3));
//      removeWords();
		File file = new File("src/studyJava");
      removeWords(file, 3);
  }

  public static void removeWords() {
      try (Scanner scan = new Scanner(System.in)) {
          System.out.println("Enter text");
          String text = scan.nextLine();
          System.out.println("Enter number");
          int n = scan.nextInt();
          System.out.println(removeWord(text, n));
      }
  }

  public static void removeWords(File f, int n) {
      String text;
      try (BufferedReader br = new BufferedReader(new FileReader(f))) {
          while ((text = br.readLine()) != null) {
              System.out.println(removeWord(text, n));
          }
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
    public static String removeWord (String text, int n) {
        StringBuilder sb = new StringBuilder();
        String words[] = text.split(" ");
        for (int i=0; i<words.length; i++) {
            if (!isSkip(words[i], n)) {
                sb.append(words[i]).append(" ");
            }
        }
        return sb.toString();
        
    }
    
    public static boolean isSkip(String word, int n) {
    	return word.length()==n && !isVowel((char)Character.toLowerCase(word.charAt(0)));
    }
    public static boolean isVowel(Character c) {
        switch (c) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'y':
        case 'а':
        case 'е':
        case 'ё':
        case 'и':
        case 'о':
        case 'у':
        case 'ы':
        case 'э':
        case 'ю':
        case 'я':
            return true;
        default:
            return false;
 
        }
    }
}
 
 