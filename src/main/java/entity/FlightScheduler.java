package entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 航班计划
 * @author windows
 *
 */
public class FlightScheduler implements Serializable{
	
	private static final long serialVersionUID = 2427165183041369292L;
	private char fightNumber;
	private Date startDate;
	private Date endDate;
	private char fromCity;
	private char toCity;
	private Date departureTime;
	private Date arrivalTime;
	private String  airplane;
	private char scheduler;
	private double sailLength;
	
	
	public FlightScheduler() {}


	public FlightScheduler(char fightNumber, Date startDate, Date endDate, char fromCity, char toCity,
			Date departureTime, Date arrivalTime, String airplane, char scheduler, double sailLength) {
		super();
		this.fightNumber = fightNumber;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.airplane = airplane;
		this.scheduler = scheduler;
		this.sailLength = sailLength;
	}


	public char getfightNumber() {
		return fightNumber;
	}


	public void setfightNumber(char fightNumber) {
		this.fightNumber = fightNumber;
	}


	public Date getstartDate() {
		return startDate;
	}


	public void setstartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getendDate() {
		return endDate;
	}


	public void setendDate(Date endDate) {
		this.endDate = endDate;
	}


	public char getfromCity() {
		return fromCity;
	}


	public void setfromCity(char fromCity) {
		this.fromCity = fromCity;
	}


	public char gettoCity() {
		return toCity;
	}


	public void settoCity(char toCity) {
		this.toCity = toCity;
	}


	public Date getdepartureTime() {
		return departureTime;
	}


	public void setdepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}


	public Date getarrivalTime() {
		return arrivalTime;
	}


	public void setarrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}


	public String getAirplane() {
		return airplane;
	}


	public void setAirplane(String airplane) {
		this.airplane = airplane;
	}


	public char getScheduler() {
		return scheduler;
	}


	public void setScheduler(char scheduler) {
		this.scheduler = scheduler;
	}


	public double getsailLength() {
		return sailLength;
	}


	public void setsailLength(double sailLength) {
		this.sailLength = sailLength;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airplane == null) ? 0 : airplane.hashCode());
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + fightNumber;
		result = prime * result + fromCity;
		long temp;
		temp = Double.doubleToLongBits(sailLength);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + scheduler;
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + toCity;
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
		FlightScheduler other = (FlightScheduler) obj;
		if (airplane == null) {
			if (other.airplane != null)
				return false;
		} else if (!airplane.equals(other.airplane))
			return false;
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (fightNumber != other.fightNumber)
			return false;
		if (fromCity != other.fromCity)
			return false;
		if (Double.doubleToLongBits(sailLength) != Double.doubleToLongBits(other.sailLength))
			return false;
		if (scheduler != other.scheduler)
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (toCity != other.toCity)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "FlightScheduler [fight_number=" + fightNumber + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", fromCity=" + fromCity + ", toCity=" + toCity + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + ", airplane=" + airplane + ", scheduler=" + scheduler
				+ ", sailLength=" + sailLength + "]";
	}
	
	
		
	
}
