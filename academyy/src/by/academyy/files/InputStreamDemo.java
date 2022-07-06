package by.academyy.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamDemo {

	public static void main(String[] args) {
		try (OutputStream output = new FileOutputStream("src/files/1/2/Hello15.txt"); InputStream input = new FileInputStream("src/files/1/2/Hello.txt")) {
			char[] symbols = { '6', ' ', 'j', 'u', 'l' };
			for (int i = 0; i < symbols.length; i++) {
				// Запись каждого символа в текстовый файл
				output.write(symbols[i]);
			}

			int size = input.available();
			for (int i = 0; i < size; i++) {
				// Чтение текстового файла посимвольно
				System.out.print((char) input.read() + " ");
			}
		} catch (IOException e) {
			System.out.print("Exception");
		}
	}

}
