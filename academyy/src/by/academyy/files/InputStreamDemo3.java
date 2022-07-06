package by.academyy.files;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamDemo3 {

	public static void main(String[] args) {
		try (InputStream input = new BufferedInputStream(new FileInputStream("src/files/1/2/Hello16.txt"));) {

		//	System.out.println(Arrays.toString(input.readAllBytes()));
			for (byte c:input.readAllBytes()) {
				System.out.print((char) c);
			}
		}

		catch (IOException e) {
			System.out.print("Exception");
		}
	}

}
