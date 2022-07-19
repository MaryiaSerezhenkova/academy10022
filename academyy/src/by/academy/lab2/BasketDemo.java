package by.academy.lab2;
//Наполнить корзину мячиками. Определить вес мячиков в корзине и количество синих мячиков.

import java.util.ArrayList;

public class BasketDemo {

	public static void main(String[] args) {
		Ball ball1 = new Ball("blue", 5);
		Ball ball2 = new Ball("blue", 10);
		Ball ball3 = new Ball("red", 5);
		Ball ball4 = new Ball("red", 10);
		Ball ball5 = new Ball("blue", 5);
		Ball ball6 = new Ball("blue", 5);
		Ball ball7 = new Ball("pink", 5);

		ArrayList<Ball> basket = new ArrayList<>();
		basket.add(ball1);
		basket.add(ball2);
		basket.add(ball3);
		basket.add(ball4);
		basket.add(ball5);
		basket.add(ball6);
		basket.add(ball7);

		BallsWeight(basket);
		getBallsColor(basket, "blue");
		getBallsColor(basket, "orange");
	}

	public static void BallsWeight(ArrayList<Ball> balls) {
		int sum = 0;
		for (Ball b : balls) {
			sum += b.getWeight();
		}
		System.out.println("Weight of basket is " + sum + " gr");
	}

	public static void getBallsColor(ArrayList<Ball> balls, String color) {
		int quantity = 0;
		for (Ball b : balls) {
			if (b.getColor().equalsIgnoreCase(color)) {
				quantity += 1;
			}
		}
		System.out.println("Quantity of " + color + " balls is " + quantity);
	}
}
