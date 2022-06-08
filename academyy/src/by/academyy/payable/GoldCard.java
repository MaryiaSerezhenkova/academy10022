package by.academyy.payable;

@Bank(name = "Priorbank", age=6)
public class GoldCard extends Iban {

	public GoldCard(double sum) {
		super(sum);
	}

	protected double getCashback() {
		return 0.01;
	}

	@Override
	public void pay(double amount) throws Exception {
		if (sum - amount < 0) {
			throw new Exception("Out of limit");

		}
		sum = sum - amount + getCashback() * amount;

	}

}
