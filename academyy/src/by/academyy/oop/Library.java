package by.academyy.oop;

import java.util.HashMap;

public class Library {

	public static void main(String[] args) {

		HashMap<Reader, Book> readInfo = new HashMap<>();

		Reader r1 = new Reader("Иванов С.П.", 105105, "ФММП", "10.01.2000", "+375297777777");
		Reader r2 = new Reader("Петров В.В.", 108108, "ФТУГ", "20.02.2000", "+375295555555");
		Reader r3 = new Reader("Антонович М.С.", 103333, "ЭФ", "15.05.2000", "+37529131313131");

		Book b1 = new Book("Энциклопедия", "С.В.");
		Book b2 = new Book("Экономическая теория", "М.Н.");
		Book b3 = new Book("Справочник", "Р.В.");
		Book b4 = new Book("Статистика", "П.П.");
		Book b5 = new Book("Высшая математика", "И.И.");
		Book b6 = new Book("История", "Л.Л.");
		Book b7 = new Book("Логика", "С.В.");
		Book b8 = new Book("Бухучет", "Л.В.");
		Book b9 = new Book("Делопроизводство", "Д.Д.");
		Book b10 = new Book("Основы права", "Н.Н.");

		readInfo.put(r1, b1);
		readInfo.put(r1, b2);
		readInfo.put(r1, b3);
		readInfo.put(r1, b4);
		readInfo.put(r2, b5);
		readInfo.put(r2, b6);
		readInfo.put(r3, b7);

		r1.takeBook();
		r1.takeBook(b1,b2, b3,b4);
		//takeBook(readInfo);
	}

	public static void takeBook(HashMap<Reader, Book> readInfo) {
		for (Reader key : readInfo.keySet()) {
			System.out.println(key + " : " + readInfo.get(key));
		}
	}
}