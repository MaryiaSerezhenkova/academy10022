package Shop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import by.academyy.homework3.Reg;

public class Deal {
	protected String place;
	protected String timedate;
	protected User seller;
	protected User buyer;
	protected Product[] basket;
	protected int index = 0;
	private static final LocalDate DEADLINE = LocalDate.now().plusDays(10);

	public Deal() {
		super();
	}

	public Deal(String place, String timedate, User seller, User buyer) {
		this.place = place;
		this.timedate = timedate;
		this.seller = seller;
		this.buyer = buyer;
		this.basket = basket;
	}

	public void addProduct(Product product) {
		if (basket == null) {
			index = 0;
			basket = new Product[10];
		}
		if (index >= basket.length) {
			basketGrow();
		}

		basket[index++] = product;
	}

	private void basketGrow() {
		Product[] tempBasket = new Product [basket.length*2 + 1];
		System.arraycopy(basket, 0, tempBasket, 0, basket.length);
		basket= tempBasket;
	}
	public void removeProduct (int removeIndex) {
		if (removeIndex < basket.length && removeIndex >=0) {
			System.arraycopy(basket, removeIndex+1, basket, removeIndex, basket.length- removeIndex-1);
			basket[index--] = null;
		}
		
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getTimedate() {
		return timedate;
	}

	public void setTimedate(String timedate) {
		this.timedate = timedate;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public Product[] getBasket() {
		return basket;
	}

	public void setBasket(Product[] basket) {
		this.basket = basket;
	}

	public void deal() {
		if (Reg.checkdate(timedate) == true) {
			System.out.println("Date is valid");
		} 
		else if (Reg.checkdate(timedate) == false) {
			System.out.println("Write date: dd/mm/yyyy(dd-mm-yyyy)");
			return;
		}
		if (basket == null) {
			System.out.println("Your basket is empty");
			return;
		}
		double fullPrice = 0;
		for (int i = 0; i < basket.length; i++) {
		//for (Product i : basket) {
			if (basket[i]!= null) {
			
			fullPrice +=basket[i].getCalculatedPrice()*basket[i].getDiscount();
		}
	}
		double discount = 0;
		for (int i = 0; i < basket.length; i++) {
		//for (Product i : basket) {
			if (basket[i]!= null) {
				discount +=basket[i].getCalculatedPrice() - basket[i].getCalculatedPrice()*basket[i].getDiscount();
		}
	}
		if (buyer.getMoney() < fullPrice) {
			System.out.println("you dont have enough money");
			return;
		} else {
			System.out.println("-----------CHECK-----------");
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM u");
			String s = timedate.replaceAll("\\/", " ");
			System.out.println(dateTimeFormatter.parse(s));
			System.out.println("Discount " + discount);
			for (int i = 0; i < basket.length; i++) {
				if (basket[i] != null) {
					System.out.println(i + 1 + ". " + basket[i].getName() + "    " + basket[i].getQuantity() + "pieces   "
							+ basket[i].getCalculatedPrice() + "$");
				}
			}
			System.out.println(": " + fullPrice + "$");
			System.out.println("--------------------------");
			System.out.println("Sellers value is " + seller.sellerMoney(fullPrice) + "$");
			System.out.println("Users balance is " + buyer.buyerMoney(fullPrice) + "$");
		}
	}


	@Override
	public String toString() {
		return "Deal [place=" + place + ", timedate=" + timedate + ", seller=" + seller + ", buyer=" + buyer
				+ ", basket=" + Arrays.toString(basket) + ", index=" + index + "]";
	}
}
