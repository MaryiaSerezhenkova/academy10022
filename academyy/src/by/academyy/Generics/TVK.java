package by.academyy.Generics;

import java.io.Serializable;

//Создать обобщенный класс с тремя параметрами (T, V, K).
//Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K), методы возвращающие значения трех переменных.
//Создать метод, выводящий на консоль имена классов для трех переменных класса.
//Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (классы оболочки, String), V должен реализовать интерфейс 
//Serializable и расширять класс Animal, K должен расширять класс Number.

public class TVK<T extends Comparable<String>, V extends Serializable, K extends Number> {

	private T varT;
	private V varV;
	private K varK;

	public TVK(T varT, V varV, K varK) {
		super();
		this.varT = varT;
		this.varV = varV;
		this.varK = varK;
	}

	public void printK() {
		System.out.println(varK.getClass().getName());
	}

	public void printT() {
		System.out.println(varT.getClass().getName());
	}

	public void printV() {
		System.out.println(varV.getClass().getName());
	}

	public T getVarT() {
		return varT;
	}

	public void setVarT(T varT) {
		this.varT = varT;
	}

	public V getVarV() {
		return varV;
	}

	public void setVarV(V varV) {
		this.varV = varV;
	}

	public K getVarK() {
		return varK;
	}

	public void setVarK(K varK) {
		this.varK = varK;
	}

}
