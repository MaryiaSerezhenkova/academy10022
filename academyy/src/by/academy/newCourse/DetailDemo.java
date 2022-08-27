package by.academy.newCourse;

import java.util.ArrayList;

public class DetailDemo {

	public static void main(String[] args) {
		Detail d1 = new Motor("motor", 1, 200);
		Detail d2 = new Detail("door", 4);
		Detail d3 = new Wheel("wheel", 4, 20.0);

		ArrayList<Detail> allDetails = new ArrayList<>();
		allDetails.add(d1);
		allDetails.add(d2);
		allDetails.add(d3);

		System.out.println(allDetails.toString());

		for (Detail d : allDetails) {
			System.out.println(d.getName());
		}

	}

}
