package by.academy.homework6;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

 
//Прочесть информацию введеную из клавиатури и записать в созданный вами txt файл, если введена "stop"
//строка тогда закончить запись в файл.
 
public class Task1 {
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream output = new FileOutputStream("f1.txt");
        String text;
 
        System.out.println("Enter lines of text");
        System.out.println("Enter 'stop' to quit");
        do {
            text = br.readLine();
            char[] symbols = text.toCharArray();
            for (int i = 0; i < symbols.length; i++) {
            	   output.write(symbols[i]);}
        } while (!text.equals("stop"));
        output.close();
    }
}
            