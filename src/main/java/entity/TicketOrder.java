package entity;

import java.io.Serializable;

/**
 * 机票
 * @author windows
 *
 */
public class TicketOrder implements Serializable{
	
	private static final long serialVersionUID = 2427165183041369292L;
	private long ticketOrderId;
	private int flightId;
	private String passengerName;
	private String certificationNumber;
	private String orderDate;
	private String level;
	private String passengerType;
	private int branchId;
	private int salesId;
	
	public TicketOrder() {}

	public TicketOrder(long ticketOrderId, int flightId, String passengerName, String certificationNumber,
			String orderDate, String level, String passengerType, int branchId, int salesId) {
		super();
		this.ticketOrderId = ticketOrderId;
		this.flightId = flightId;
		this.passengerName = passengerName;
		this.certificationNumber = certificationNumber;
		this.orderDate = orderDate;
		this.level = level;
		this.passengerType = passengerType;
		this.branchId = branchId;
		this.salesId = salesId;
	}

	public long getticketOrderId() {
		return ticketOrderId;
	}

	public void setticketOrderId(long ticketOrderId) {
		this.ticketOrderId = ticketOrderId;
	}

	public int getflightId() {
		return flightId;
	}

	public void setflightId(int flightId) {
		this.flightId = flightId;
	}

	public String getpassengerName() {
		return passengerName;
	}

	public void setpassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getcertificationNumber() {
		return certificationNumber;
	}

	public void setcertificationNumber(String certificationNumber) {
		this.certificationNumber = certificationNumber;
	}

	public String getorderDate() {
		return orderDate;
	}

	public void setorderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getpassengerType() {
		return passengerType;
	}

	public void setpassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	public int getbranchId() {
		return branchId;
	}

	public void setbranchId(int branchId) {
		this.branchId = branchId;
	}

	public int getsalesId() {
		return salesId;
	}

	public void setsalesId(int salesId) {
		this.salesId = salesId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + branchId;
		result = prime * result + ((certificationNumber == null) ? 0 : certificationNumber.hashCode());
		result = prime * result + flightId;
		result = prime * result + ((level == null) ? 0 : level.hashCode());
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + ((passengerName == null) ? 0 : passengerName.hashCode());
		result = prime * result + ((passengerType == null) ? 0 : passengerType.hashCode());
		result = prime * result + salesId;
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
		TicketOrder other = (TicketOrder) obj;
		if (branchId != other.branchId)
			return false;
		if (certificationNumber == null) {
			if (other.certificationNumber != null)
				return false;
		} else if (!certificationNumber.equals(other.certificationNumber))
			return false;
		if (flightId != other.flightId)
			return false;
		if (level == null) {
			if (other.level != null)
				return false;
		} else if (!level.equals(other.level))
			return false;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (passengerName == null) {
			if (other.passengerName != null)
				return false;
		} else if (!passengerName.equals(other.passengerName))
			return false;
		if (passengerType == null) {
			if (other.passengerType != null)
				return false;
		} else if (!passengerType.equals(other.passengerType))
			return false;
		if (salesId != other.salesId)
			return false;
		if (ticketOrderId != other.ticketOrderId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TicketOrder [ticketOrderId=" + ticketOrderId + ", flightId=" + flightId + ", passengerName="
				+ passengerName + ", certificationNumber=" + certificationNumber + ", orderDate=" + orderDate
				+ ", level=" + level + ", passengerType=" + passengerType + ", branchId=" + branchId + ", salesId="
				+ salesId + "]";
	}
	
	
	
	
}
