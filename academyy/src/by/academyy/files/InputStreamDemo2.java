package by.academyy.files;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class InputStreamDemo2 {

	public static void main(String[] args) {
		try (OutputStream output = new BufferedOutputStream(new FileOutputStream("src/files/1/2/Hello16.txt")); ) {
			byte[] symbols = { '6', ' ', 'j', 'u', 'l' };
			for (int i = 0; i < symbols.length; i++) {
				// Запись каждого символа в текстовый файл
				output.write(symbols);
			}

			
		} catch (IOException e) {
			System.out.print("Exception");
		}
	}

}
