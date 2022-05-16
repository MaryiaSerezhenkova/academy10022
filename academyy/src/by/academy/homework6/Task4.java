package by.academy.homework6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

//Создайте каталог(папку). Создайте в папке 100 txt файлов (Например, 1.txt, 2.txt ... 100.txt).
//Считываем текст из 2-ого задания, получаем его длинну (576 символов). Для каждого файла генерируем рандомное число
//от 0 до 576, достаем из текста (из 2 задания) такое-же количество символов (string.substring()) и
//сохраняем в наш файл. Создайте файл result.txt и запишите туда список всех файлов и их размеры.

public class Task4 {
	 public static final Random RANDOM = new Random();
	 
	    public static void main(String[] arg) throws IOException {
	        File dirs = new File("academyy/src/by/academy/homework6//Files");
	 
	        if (!dirs.exists()) {
	            dirs.mkdirs();
	        }
	 
	        for (int i = 1; i < 101; i++) {
	            File file = new File(dirs, i + ".txt");
	 
	            if (!file.exists()) {
	 
	                file.createNewFile();
	            }
	        }
	        for (int i = 1; i < 101; i++) {
	            String path = "academyy//src//by//academy//homework6//Files" + i + ".txt";
	            try (InputStream input = new FileInputStream("Task2.txt");
	                    OutputStream output = new FileOutputStream(path)) {
	                int size = input.available();
	                System.out.print(size);
	               int size2 = RANDOM.nextInt(size);
	               char a = (char) input.read();
	               String text = Character.toString(a);
	               for (int j = 0; j < size2; j++) {
	                char[] x = text.substring(0, j).toCharArray();
	                 output.write((char) x[j]);
	                }
	               input.close();
	               output.close();
	            } catch (IOException e) {
	                System.err.println(e.getMessage());
	            }
	            
	            try (OutputStream output2 = new FileOutputStream("result_info.txt")) {
	            for (File file : dirs.listFiles()) {
	            	String info = "Имя файла: " + file.getName()+"Размер: " + file.length() + " байт.";
	            	char[]x = info.toCharArray();
	            	for (int j = 1; j < 101; j++) {
	            	output2.write(x[j]);
	            	}
	            	output2.close();
	            	
	            } }catch (IOException e) {
	                System.err.println(e.getMessage());
	        }
	 
	        }
	    }
}
	 
	
	    