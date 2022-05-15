package by.academy.homework6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//Создать руками текстовый файл, закинуть следующий текст:
//Создать новый файл result.txt. Программно считать файл с текстом, удалить все пробелы и записать
//полученный текст в result.txt.

public class Task2 {

	public static void main(String[] arg) throws Exception {

		try (OutputStream output = new FileOutputStream("result.txt");
				InputStream input = new FileInputStream("Task2.txt")) {

			int size = input.available();
			for (int i = 0; i < size; i++) {

				Character p = (char) input.read();
				if (!p.equals(' '))
					output.write((char) p);
			}

			input.close();
			output.close();

		} catch (IOException e) {
			System.out.print("Exception");

		}

	}
}
