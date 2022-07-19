package by.academy.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

//Вывести с помощью рефлексии все поля и методы, сначала через
//getMethod("name")
//getMethods()
//getField("name")
//getFields()
//а затем через
//getDeclaredMethod("name")
//getDeclaredMethods()
//getDeclaredField("name")
//getDeclaredFields()
//Посмотреть разницу. Просетать все значения через Reflection. (set метод класса Field).
//Вывести значения полей через Reflection. (get метод класса Field). Вызвать toString через invoke.

public class UserDemo {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		User user1 = new User("Ann", "Smith", 20, "10.05.2002", "Ann2002", "qwerty", "ann@gmail.com");
		Class<User> userClass = User.class;
		System.out.println(userClass.getName());
		Method printUserInfoMethod;
		try {
			printUserInfoMethod = userClass.getMethod("printUserInfo");
			System.out.println("Method name: " + printUserInfoMethod.getName());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		System.out.println();
		List<Method> methods = Arrays.asList(userClass.getMethods());
		for (Method m : methods) {
			System.out.println(m.getName());
		}
		System.out.println();
		List<Method> methods2 = Arrays.asList(userClass.getDeclaredMethods());
		for (Method m : methods2) {
			System.out.println(m.getName());
		}
		System.out.println();
		List<Field> fields = Arrays.asList(userClass.getFields());
		List<Field> fields2 = Arrays.asList(userClass.getDeclaredFields());
		for (Field f : fields) {
			System.out.println(f.getName());
		}
		System.out.println();
		for (Field f : fields2) {
			System.out.println(f.getName());
		}
		System.out.println();

		try {
			Method m1 = userClass.getDeclaredMethod("setLogin", String.class);
			try {
				m1.invoke(user1, "Nina");
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		System.out.println(user1.getLogin());

		try {
			Field LastNameField = userClass.getField("getLastName");
			LastNameField.setAccessible(true);
			System.out.println("Before change:" + LastNameField.get(user1));
			LastNameField.set(user1, "Adams");
			System.out.println("After change:" + LastNameField.get(user1));
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}