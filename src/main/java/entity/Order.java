package entity;

import java.io.Serializable;
/**
 * 订单 
 * @author windows
 *
 */
public class Order implements Serializable{
	private static final long serialVersionUID = 2427165183041369292L;
	private long orderId;
	private long ticketOrderId;
	private double price;
	private char status;
	private char fightNumber;
	
	public Order() {}

	public Order(long orderId, long ticketOrderId, double price, char status, char fightNumber) {
		super();
		this.orderId = orderId;
		this.ticketOrderId = ticketOrderId;
		this.price = price;
		this.status = status;
		this.fightNumber = fightNumber;
	}

	public long getorderId() {
		return orderId;
	}

	public void setorderId(long orderId) {
		this.orderId = orderId;
	}

	public long getticketOrderId() {
		return ticketOrderId;
	}

	public void setticketOrderId(long ticketOrderId) {
		this.ticketOrderId = ticketOrderId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public char getfightNumber() {
		return fightNumber;
	}

	public void setfightNumber(char fightNumber) {
		this.fightNumber = fightNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fightNumber;
		result = prime * result + (int) (orderId ^ (orderId >>> 32));
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + status;
		result = prime * result + (int) (ticketOrderId ^ (ticketOrderId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (fightNumber != other.fightNumber)
			return false;
		if (orderId != other.orderId)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (status != other.status)
			return false;
		if (ticketOrderId != other.ticketOrderId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", ticketOrderId=" + ticketOrderId + ", price=" + price + ", status="
				+ status + ", fightNumber=" + fightNumber + "]";
	}
	
	
}
