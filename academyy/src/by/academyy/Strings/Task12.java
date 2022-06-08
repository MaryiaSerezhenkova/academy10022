package by.academyy.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//Написать программу, которая выводит числа от 1 до 25 в виде матрицы 5x5 слева направо и сверху вниз.
public class Task12 {
	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose direction");
		String direction = scan.nextLine();
		List<Integer> numbers = new ArrayList<Integer>(25);
		for (int i = 1; i <= 25; i++) {
			numbers.add(i);
		}
		Iterator<Integer> numIt = numbers.iterator();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (direction.equalsIgnoreCase("from left to right"))
					matrix[i][j] = numIt.next();

				else if (direction.equalsIgnoreCase("top down"))
					matrix[j][i] = numIt.next();
			}

		}
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}

	}

}
