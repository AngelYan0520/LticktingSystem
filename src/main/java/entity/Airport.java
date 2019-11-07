package entity;

import java.io.Serializable;

/*
 * 机场实体类
 */
public class Airport implements Serializable{

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	
	private String airportCode; 
	private String city; 
	private String airportName;
	
	public Airport() {
		super();
	}

	public Airport(String airportCode, String city, String airportName) {
		super();
		this.airportCode = airportCode;
		this.city = city;
		this.airportName = airportName;
	}

	public String getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airportCode == null) ? 0 : airportCode.hashCode());
		result = prime * result + ((airportName == null) ? 0 : airportName.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
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
		Airport other = (Airport) obj;
		if (airportCode == null) {
			if (other.airportCode != null)
				return false;
		} else if (!airportCode.equals(other.airportCode))
			return false;
		if (airportName == null) {
			if (other.airportName != null)
				return false;
		} else if (!airportName.equals(other.airportName))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "airport [airportCode=" + airportCode + ", city=" + city + ", airportName=" + airportName + "]";
	} 
	
	
	
}
