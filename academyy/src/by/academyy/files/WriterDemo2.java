package by.academyy.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo2 {

	public static void main(String[] args) throws IOException {
		// try (FileWriter writer = new FileWriter("src/files/1/2/Hello15.txt");
		// FileReader reader = new FileReader("src/files/1/2/Hello.txt")) {
		int size = 0;
		File file = new File("src/files/1/2/Hello17.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		try {
			Writer fw = new FileWriter(file);

			fw.write("Learn\nJava!\n");
			fw.close();
			BufferedReader fr = new BufferedReader(new FileReader(file));
			String str = null;
			while ((str = fr.readLine()) != null) {
				System.out.println(str);
			}

			fr.close();
		} catch (

		IOException e) {
			System.out.print(e.getMessage());
		}
	}
}