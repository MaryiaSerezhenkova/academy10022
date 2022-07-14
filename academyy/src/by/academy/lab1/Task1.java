package by.academy.lab1;

//Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата.
public class Task1 {

	public static void main(String[] args) {
		System.out.println(lastSquareNumber(22));
		System.out.println(lastSquareNumber(0));
		System.out.println(lastSquareNumber(-18));
	}

	public static int lastSquareNumber(int number) {
		int lastNumber = Math.abs(number) % 10;
		int lastSquareNumber = (lastNumber * lastNumber) % 10;
		return lastSquareNumber;
	}
}