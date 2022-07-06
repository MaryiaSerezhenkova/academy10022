package by.academyy.files;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File dir = new File("src/files/1/2");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir, "Hello.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		File file1 = new File(dir, "Hello1.txt");
		if (!file1.exists()) {
			file1.createNewFile();

		}
		for (File f : dir.listFiles()) {
			System.out.println("Имя файла: " + f.getName());
			System.out.println("Путь: " + f.getPath());
			System.out.println("Абсолютный путь: " + f.getAbsolutePath());
			System.out.println("Родительский каталог: " + f.getParent());
			new File(f.getParent());
			System.out.println(f.exists() ? "Файл/каталог существует." : "Файл/каталог не существует.");
			System.out.println(f.canWrite() ? "Файл/каталог доступен для редактирования."
					: "Файл/каталог не доступен для редактирования.");
			System.out.println(
					f.canRead() ? "Файл/каталог доступен для чтения." : "Файл/каталог не доступен для чтения.");
			System.out.println((f.isDirectory() ? "Каталог." : "Не каталог."));
			System.out.println(f.isFile() ? "Файл." : "Не файл.");
			System.out.println(f.isAbsolute() ? "Абсолютный путь." : "Не абсолютный путь.");
			System.out.println("Дата последнего редактирования: " + new Date(f.lastModified()));
			System.out.println("Размер: " + f.length() + " байт.");

			System.out.println("----------------------------------------------------------");

		}
		File file3 = new File("src/files/1");
		long size =calculateFileSize(file3);
		System.out.println(size);
	}

	public static long calculateFileSize(File f) {
		System.out.println(f.getName());
		if (f.isDirectory()) {
			long length = 0;
			for (File file : f.listFiles()) {
				length += calculateFileSize(file);
			}
			return length;

		} else {
			return f.length();
		}
	}
}
