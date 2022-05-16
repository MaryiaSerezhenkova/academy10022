package by.academy.homework6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

// Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст). В классе Main
//создайте ArrayList<User>, добавьте 10 пользователей в коллекцию.
//Создайте каталог(папку) users и для каждого пользователя создайте файл в этом каталоге.
//Назовите файл Имя_Фамилия.txt. Сериализуйте информацию о пользователе и положите в файл пользователя.
//Не забываем закрывать потоки. В блоке catch выводим сообщение ошибки на экран (System.err.println(e.getMessage());)

public class Task3 {

	public static void main(String[] arg) throws IOException {

		User user1 = new User("Олег", "Петров", 30);
		User user2 = new User("Сергей", "Иванов", 50);
		User user3 = new User("Михаил", "Антонович", 35);
		User user4 = new User("Артем", "Сереженков", 7);
		User user5 = new User("Виталий", "Сидоров", 40);
		User user6 = new User("Ольга", "Петрова", 30);
		User user7 = new User("Татьяна", "Иванова", 50);
		User user8 = new User("Юлия", "Антонович", 20);
		User user9 = new User("Мария", "Сереженкова", 35);
		User user10 = new User("Елена", "Петрова", 30);

		ArrayList<User> allUsers = new ArrayList<>();
		allUsers.add(user1);
		allUsers.add(user2);
		allUsers.add(user3);
		allUsers.add(user4);
		allUsers.add(user5);
		allUsers.add(user6);
		allUsers.add(user7);
		allUsers.add(user8);
		allUsers.add(user9);
		allUsers.add(user10);

		File dirs = new File("academyy/src/by/academy/homework6/users");

		if (!dirs.exists()) {
			dirs.mkdirs();
		}

		String[] fileNames = new String[allUsers.size()];

		String[] info = new String[allUsers.size()];

		for (int i = 0; i < allUsers.size(); i++) {
			fileNames[i] = allUsers.get(i).getName() + "_" + allUsers.get(i).getSurname() + ".txt";
			info[i] = allUsers.get(i).toString();
			char[] p = info[i].toCharArray();

			// System.out.println(fileNames[i]);

			File file = new File(dirs, fileNames[i]);
			if (!file.exists()) {
				file.createNewFile();

			}
			try (OutputStream output = new FileOutputStream("fileNames[i]")) {
				for (int j = 0; j < p.length; j++) {

					output.write((char) p[j]);
				}
				output.close();

			} catch (IOException e) {
				System.out.print("Exception");
			}

		}

	}

}
