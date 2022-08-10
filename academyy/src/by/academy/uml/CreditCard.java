package by.academy.uml;

import java.time.LocalDate;

public class CreditCard implements Payment {
	private String issuer;
	private long cardNo;
	private LocalDate expiryDate;
	@Override
	public void pay() {
		System.out.println("Pay by credit card");
		
	}

}
