package by.academyy.Generics;
//Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы - sum, multiply, divide, subtraction. 
//Параметры этих методов  - два числа разного типа, над которыми должна быть произведена операция.

public class Calc {
	
	public static <T extends Number, N extends Number> double sum(T a, N b) {
		return a.doubleValue()+b.doubleValue();
	}
	public static <T extends Number, N extends Number>  double multiply(T a, N b) {
		return a.doubleValue()*b.doubleValue();
	}
	public static <T extends Number, N extends Number>  double divide(T a, N b) {
		return a.doubleValue()/b.doubleValue();
	}
	public static <T extends Number, N extends Number>  double subtraction(T a, N b) {
		return a.doubleValue()-b.doubleValue();
	}
}
