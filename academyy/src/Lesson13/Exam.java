package Lesson13;

import java.util.Arrays;


public class Exam<T extends Number> {

	private T[] marks;
	private String name;
	double count = 0;

	public Exam() {
		super();
	}

	public Exam(String name, T marks[]) {
		super();
		this.name = name;
		this.marks = marks;

	}


	public void addMark(T mark) {
		
		T[] newArray = (T[])new Number[marks.length+1];
		System.arraycopy(marks, 0, newArray, 0, marks.length);
		marks= newArray;
		marks[marks.length-1]=mark;
		

	}
	
	public double calcFinalMark() {
		for (T i: marks) {
		count+=i.intValue();
		}
		System.out.println("Everage mark: ");
		return count/marks.length;
			
		}

	public T[] getMarks() {
		return marks;
	}

	public void setMarks(T[] marks) {
		this.marks = marks;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getCount() {
		return count;
	}

	public void setCount(double count) {
		this.count = count;
	}

	//@Override
	//public String toString() {
	//	return "Exam [marks=" + Arrays.toString(marks) + ", name=" + name + ", count=" + count + "]";
	//}

	}

