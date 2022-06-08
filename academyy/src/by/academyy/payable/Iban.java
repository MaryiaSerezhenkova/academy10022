package by.academyy.payable;

public abstract class Iban implements Payable{
	protected double sum=1000;
	
	public Iban(double sum) {
		super();
		this.sum=sum;
	}
	public double getBalance() {
		return sum;
	}
	

}
