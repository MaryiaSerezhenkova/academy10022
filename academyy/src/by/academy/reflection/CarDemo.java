package by.academy.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

public class CarDemo {

	public static void main(String[] args) {
		try {
			Class<?> carClass1 = Class.forName("by.academy.reflection.Car");
			System.out.println(carClass1.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Car car = new Car(10);
		Class<? extends Car> carClass2 = car.getClass();
		System.out.println(carClass2.getName());

		Class<Car> carClass3 = Car.class;
//		List<Field> fields = Arrays.asList(carClass3.getFields());
//		List<Field> fields2 = Arrays.asList(carClass3.getDeclaredFields());
//		for (Field f:fields2) {
//			System.out.println(f.getName());
//		}

		try {
			Field f1 = carClass3.getDeclaredField("age");
			f1.setAccessible(true);
			System.out.println(f1.getModifiers());
			System.out.println(Modifier.isPrivate(f1.getModifiers()));
			try {
				System.out.println(f1.get(car));
				f1.set(car, 5);
				System.out.println(f1.get(car));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(f1.getName());
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

		List<Method> methods = Arrays.asList(carClass3.getDeclaredMethods());
		try {
			Method m1 = carClass3.getDeclaredMethod("test1", String.class);
			Producer p = m1.getAnnotation(Producer.class);
			System.out.println(p.founderFullName());
			
			m1.setAccessible(true);
			try {
				m1.invoke(car, "alala");
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
//		for (Method m:methods) {
//			System.out.println(m.getName());
//		try {
//			Method toString = carClass3.getDeclaredMethod("toString");
//			List<Annotation> a = Arrays.asList(toString.getAnnotations());
//			for(Annotation a1:a) {
//				System.out.println(a1.annotationType());
//			}
//			Override o = toString.getAnnotation(Override.class);
//			System.out.println(o.annotationType());
//			
//		} catch (NoSuchMethodException e) {
//			e.printStackTrace();
//		} catch (SecurityException e) {
//			e.printStackTrace();
//		}

	}
}

