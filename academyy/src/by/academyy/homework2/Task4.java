package by.academyy.homework2;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {

		// Напишите программу Deal.java, которая должна имитировать раздачу карт для
		// игры в покер.

//Программа получает число n, задаваемое с консоли пользователем, и раздает карты на n  игроков 
//(по 5 карт каждому) из рассортированной колоды.

//Разделяйте пять карт, выданных каждому игроку, пустой строкой.

		int k = 5;

		Scanner sc = new Scanner(System.in);
		{

			System.out.println("Enter number of players ");
		}

		int n = sc.nextInt();

		String[] mast = { "Piki", "Kresti", "Chervy", "Bubny" };
		String[] num = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dama", "Korol", "Tuz" };
		int allcards = mast.length * num.length;
		{

			if (allcards < k * n) {
				System.out.println("Impossible quantity");
			}

			else if (n <= 0) {
				System.out.println("Impossible quantity");
			}

			else {
				String[] coloda = new String[allcards];

				for (int i = 0; i < num.length; i++) {
					for (int j = 0; j < mast.length; j++) {
						coloda[mast.length * i + j] = num[i] + " " + mast[j];
					}
				}
				for (int i = 0; i < allcards; i++) {
					int a = i + (int) (Math.random() * (allcards - i));
					String x = coloda[a];
					coloda[a] = coloda[i];
					coloda[i] = x;
				}
				for (int i = 0; i < k * n; i++) {
					System.out.println(coloda[i]);
					if (i % k == k - 1)
						System.out.println();

				}
			}

			sc.close();

		}
	}
}
