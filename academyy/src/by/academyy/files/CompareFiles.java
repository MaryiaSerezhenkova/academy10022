package by.academyy.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

//Напишите программу на Java, чтобы сравнить два файла лексикографически.

public class CompareFiles {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("src/studyJava");
		File file2 = new File("src/WordLength.txt");
		File file3 = new File("src/WordLength2");
		compareFiles(file, file2);
		compareFiles(file3, file2);

	}

	public static void compareFiles(File f1, File f2) throws IOException, FileNotFoundException {
		ArrayList<Integer> arr = new ArrayList<>();
		try (InputStream input = new FileInputStream(f1); InputStream input2 = new FileInputStream(f2)) {
			byte[] ff1 = input.readAllBytes();
			byte[] ff2 = input2.readAllBytes();
			int size = ff1.length < ff2.length ? ff1.length : ff2.length;
			for (int i = 0; i < size; i++) {
				if (ff1[i] != ff2[i]) {
					arr.add(i);
				}
			}
			if (ff1.length < ff2.length) {
				for (int i = size; i < ff2.length; i++) {
					arr.add(i);
				}
			} else {
				for (int i = size; i < ff1.length; i++) {
					arr.add(i);
				}
			}
			if (arr.isEmpty() == true) {
				System.out.println("Texts are equal");
			} else {
				System.out.println("Texts are not equal");
				System.out.println(Arrays.asList(arr));
			}
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}

}