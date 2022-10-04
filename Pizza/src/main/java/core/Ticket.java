package core;

import java.time.LocalDateTime;
import java.util.ArrayList;

import api.IOrder;
import api.ITicket;

public class Ticket implements ITicket {
	
	private String orderNumber;
	private LocalDateTime start;
	private IOrder order;
	

	public Ticket(String orderNumber, LocalDateTime start, IOrder order) {
		super();
		this.orderNumber = orderNumber;
		this.start = start;
		this.order = order;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public void setOrder(IOrder order) {
		this.order = order;
	}

	public String getNumber() {
		return orderNumber;
	}

	public LocalDateTime getCreatAt() {
		return start;
	}

	public IOrder getOrder() {
		return order;
	}

}
