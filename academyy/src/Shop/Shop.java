package Shop;

import by.academyy.homework3.Reg;
import by.academyy.homework3.Validator;

public class Shop {
	public static void main(String[] args) {
		Validator emailValidator = new Validator() {

			@Override
			public boolean isValid(String valid) {
				 if (Reg.checkEmail(valid) == true) {
			            return true;
			        }
			        else {
				return false;
			}
			
		}
		};
		User seller = new User ("Jack", 30, 500);
		User buyer = new User ("Kate", 18, 1000);
		Product[] basket = new Product[3];
		Vine vine = new Vine("Whitehorse", "drink", 100, 3, "white", 18);
		//Vine vine2 = new Vine("Redhorse", "drink", 150, 3, "red", 19);
		//Vine vine3 = new Vine("Blackhorse", "drink", 200, 3, "white", 20);
		Chocolate chocolate = new Chocolate("AlpenGolg", "candy", 20, 1, "milk", "with nuts");
		//Chocolate chocolate2 = new Chocolate("Milka", "candy", 10, 2, "milk", "with oreo");
		//Chocolate chocolate3 = new Chocolate("Spartak", "candy", 15, 3, "dark", " ");
		Cheese cheese = new Cheese("Hohland", "food", 20, 200, 0, "with pepper");
		//Cheese cheese2 = new Cheese("BB", "food", 40, 200, 2, "Parmesan");
		//Cheese cheese3 = new Cheese("NB", "food", 80, 200, 4, "bluecheese");
		
		//basket[0] = vine; 
		//basket[1] = vine2;
		//basket[2] = vine3;
		
		Deal deal = new Deal ("Minsk", "26/03/2022", seller, buyer);
		deal.addProduct(vine);
		deal.addProduct(chocolate);
		deal.addProduct(cheese);
		
		
		System.out.println(deal);
		
		deal.removeProduct(2);
		System.out.println(deal);
		
		deal.deal();
		
		
	

}
}
