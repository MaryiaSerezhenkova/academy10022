package by.academy.uml;


import java.time.LocalDate;

public class DebitCard implements Payment {
	private String issuer;
	private long cardNo;
	private LocalDate expiryDate;
	
	@Override
	public void pay() {
		System.out.println("Pay by debit card");
		
	}

}
