package entity;

import java.io.Serializable;

/*
 * 飞机机型实体类
 */
public class AirplaneModel implements Serializable{

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	
	private String model;
	private int maxSailLength;
	private int firstClassSeats;
	private int businessClassSeats;
	private int economyClassSeats;
	
	
	public AirplaneModel() {
		super();
	}
	public AirplaneModel(String model, int maxSailLength, int firstClassSeats, int businessClassSeats,
			int economyClassSeats) {
		super();
		this.model = model;
		this.maxSailLength = maxSailLength;
		this.firstClassSeats = firstClassSeats;
		this.businessClassSeats = businessClassSeats;
		this.economyClassSeats = economyClassSeats;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxSailLength() {
		return maxSailLength;
	}
	public void setMaxSailLength(int maxSailLength) {
		this.maxSailLength = maxSailLength;
	}
	public int getFirstClassSeats() {
		return firstClassSeats;
	}
	public void setFirstClassSeats(int firstClassSeats) {
		this.firstClassSeats = firstClassSeats;
	}
	public int getBusinessClassSeats() {
		return businessClassSeats;
	}
	public void setBusinessClassSeats(int businessClassSeats) {
		this.businessClassSeats = businessClassSeats;
	}
	public int getEconomyClassSeats() {
		return economyClassSeats;
	}
	public void setEconomyClassSeats(int economyClassSeats) {
		this.economyClassSeats = economyClassSeats;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + businessClassSeats;
		result = prime * result + economyClassSeats;
		result = prime * result + firstClassSeats;
		result = prime * result + maxSailLength;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		AirplaneModel other = (AirplaneModel) obj;
		if (businessClassSeats != other.businessClassSeats)
			return false;
		if (economyClassSeats != other.economyClassSeats)
			return false;
		if (firstClassSeats != other.firstClassSeats)
			return false;
		if (maxSailLength != other.maxSailLength)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AirplaneModel [model=" + model + ", maxSailLength=" + maxSailLength + ", firstClassSeats="
				+ firstClassSeats + ", businessClassSeats=" + businessClassSeats + ", economyClassSeats="
				+ economyClassSeats + "]";
	}
	
	

}
