package by.academyy.payable;

import java.util.ArrayList;

public class CardTest {

	public static void main(String[] args) {
		ArrayList<Iban> items = new ArrayList<>();
		items.add(new GoldCard(1000));
		items.add(new CreditCard(1000));
		items.add(new PlatinumCard(1000));
		for(Iban item:items) {
			try {
				item.pay(900);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println(item.getBalance());
		}
	}

}
