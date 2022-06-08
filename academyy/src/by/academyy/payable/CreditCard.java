package by.academyy.payable;

public class CreditCard extends Iban {
	public CreditCard(double sum) {
		super(sum);
	}

	private double limit = 1000;

	@Override
	public void pay(double amount) throws Exception {

		if (sum - amount + limit < 0) {
			throw new Exception("Out of limit");

		}
		sum = sum - amount;
	}
}
