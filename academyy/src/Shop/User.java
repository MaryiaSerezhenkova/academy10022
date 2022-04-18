package Shop;

import java.util.Scanner;

import by.academyy.homework3.BelarusPhoneValidator;
import by.academyy.homework3.Reg;

public class User {

	protected String name;
	protected int age;
	protected double money;
	private String dateOfBirth;
	private String phoneNum;
	private String email;

	public User() {
		super();
	}

	public User(String name, int age, double money) {
		this.name = name;
		this.age = age;
		this.money = money;
		

		System.out.println("Enter date of birth " + name);
		Scanner scan = new Scanner(System.in);

		this.dateOfBirth = scan.nextLine();

		if (Reg.checkdate(dateOfBirth) == true) {
			System.out.println("Date is valid");
		} else if (Reg.checkdate(dateOfBirth) == false) {
			System.out.println("Chanfe date: dd/mm/yyyy(dd-mm-yyyy)");
			while (Reg.checkdate(dateOfBirth) == false) {
				System.out.println("Try again");
				dateOfBirth = scan.nextLine();
			}
		}
		System.out.println("Enter your phone number " + name);

		this.phoneNum = scan.nextLine();

		BelarusPhoneValidator x = new BelarusPhoneValidator();
		if (x.isValid(phoneNum) == false) {
			System.out.println("You should enter: +375XXXXXXXXX");
			while (x.isValid(phoneNum) == false) {
				System.out.println("Try again");
				phoneNum = scan.nextLine();
			}
		} else if (Reg.checkdate(dateOfBirth) == true) {
			System.out.println("The phone number is valid");
		}
	}
	public User(String name, int age, double money, String phoneNum, String email) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.phoneNum = phoneNum;
		this.email = email;}
		

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	public double sellerMoney(double fullPrice) {
		this.money += fullPrice;
		return money;
	}

	public double buyerMoney(double fullPrice) {
		this.money -= fullPrice;
		return money;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", money=" + money + ", dateOfBirth=" + dateOfBirth
				+ ", phoneNum=" + phoneNum + ", email=" + email + "]";
	}

	

}
