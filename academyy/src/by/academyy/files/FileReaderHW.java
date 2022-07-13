package by.academyy.files;

//Напишите Java-программу для построчного хранения содержимого текстового файла в массиве
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileReaderHW {

	public static void main(String[] args)  {
		File file = new File("src/studyJava");
		saveInArray(file);
	}

	public static void saveInArray(File file)  {
		try (BufferedReader fr = new BufferedReader(new FileReader(file))) {			
			String str = "";
			ArrayList<String> st = new ArrayList<>();
			
			while ((str=fr.readLine()) != null) {
				st.add(str);
			}
			System.out.println(Arrays.toString(st.toArray())); // почему последний элемент null?
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
}