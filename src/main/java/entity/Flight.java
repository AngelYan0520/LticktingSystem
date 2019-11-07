package entity;
/**
 * 航班
 * @author windows
 *
 */

import java.io.Serializable;
import java.util.Date;

public class Flight implements Serializable{
	
	private static final long serialVersionUID = 2427165183041369292L;
	private int flightId;
	private String flightNumber;
	private Date departureDate;
	private int firstClassRemainSeats;
	private int businessClassRemainSeats;
	private int economyClassRemainSeats;
	private double seasonDiscount;
	
	public Flight() {}
	
	public Flight(int flightId, String flightNumber, Date departureDate, int firstClassRemainSeats,
			int businessClassRemainSeats, int economyClassRemainSeats, double seasonDiscount) {
		super();
		this.flightId = flightId;
		this.flightNumber = flightNumber;
		this.departureDate = departureDate;
		this.firstClassRemainSeats = firstClassRemainSeats;
		this.businessClassRemainSeats = businessClassRemainSeats;
		this.economyClassRemainSeats = economyClassRemainSeats;
		this.seasonDiscount = seasonDiscount;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getflightNumber() {
		return flightNumber;
	}

	public void setflightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Date getdepartureDate() {
		return departureDate;
	}

	public void setdepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public int getFirstClassRemainSeats() {
		return firstClassRemainSeats;
	}

	public void setFirstClassRemainSeats(int firstClassRemainSeats) {
		this.firstClassRemainSeats = firstClassRemainSeats;
	}

	public int getBusinessClassRemainSeats() {
		return businessClassRemainSeats;
	}

	public void setBusinessClassRemainSeats(int businessClassRemainSeats) {
		this.businessClassRemainSeats = businessClassRemainSeats;
	}

	public int getEconomyClassRemainSeats() {
		return economyClassRemainSeats;
	}

	public void setEconomyClassRemainSeats(int economyClassRemainSeats) {
		this.economyClassRemainSeats = economyClassRemainSeats;
	}

	public double getSeasonDiscount() {
		return seasonDiscount;
	}

	public void setSeasonDiscount(double seasonDiscount) {
		this.seasonDiscount = seasonDiscount;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + businessClassRemainSeats;
		result = prime * result + ((departureDate == null) ? 0 : departureDate.hashCode());
		result = prime * result + economyClassRemainSeats;
		result = prime * result + ((flightNumber == null) ? 0 : flightNumber.hashCode());
		result = prime * result + firstClassRemainSeats;
		result = prime * result + flightId;
		long temp;
		temp = Double.doubleToLongBits(seasonDiscount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Flight other = (Flight) obj;
		if (businessClassRemainSeats != other.businessClassRemainSeats)
			return false;
		if (departureDate == null) {
			if (other.departureDate != null)
				return false;
		} else if (!departureDate.equals(other.departureDate))
			return false;
		if (economyClassRemainSeats != other.economyClassRemainSeats)
			return false;
		if (flightNumber == null) {
			if (other.flightNumber != null)
				return false;
		} else if (!flightNumber.equals(other.flightNumber))
			return false;
		if (firstClassRemainSeats != other.firstClassRemainSeats)
			return false;
		if (flightId != other.flightId)
			return false;
		if (Double.doubleToLongBits(seasonDiscount) != Double.doubleToLongBits(other.seasonDiscount))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightNumber=" + flightNumber + ", departureDate=" + departureDate
				+ ", firstClassRemainSeats=" + firstClassRemainSeats + ", businessClassRemainSeats="
				+ businessClassRemainSeats + ", economyClassRemainSeats=" + economyClassRemainSeats
				+ ", seasonDiscount=" + seasonDiscount + "]";
	}
	
	
}