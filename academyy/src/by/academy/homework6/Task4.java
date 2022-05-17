package by.academy.homework6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader("Task2.txt"))) {
			String i = null;
			while ((i = br.readLine()) != null) {
				sb.append(i);
			}

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		String text = sb.toString();

		for (int i = 1; i < 101; i++) {
			String path = "academyy//src//by//academy//homework6//Files" + i + ".txt";
			try (OutputStream output = new FileOutputStream(path)) {

				int size2 = RANDOM.nextInt(text.length());

				char[] x = text.substring(0, size2).toCharArray();
				for (int j = 0; j < size2; j++) {
					output.write((char) x[j]);
				}
				// output.close();
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}

			try (FileWriter writer = new FileWriter("result_info.txt");
					BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
				for (File file : dirs.listFiles()) {

					bufferedWriter.write("Имя файла: " + file.getName() + "Размер: " + file.length() + " байт.");
					bufferedWriter.newLine();

				}
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}

		}
	}
}
