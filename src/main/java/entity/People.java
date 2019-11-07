package entity;

import java.io.Serializable;

/*
 * 普通用户实体类
 */
public class People implements Serializable{

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	
	private int peopleId;
	private String peopleName;
	private String password;
	private String phone;
	private String idCard;
	
	public People() {}
	
	public People(String peopleName, String password, String phone, String idCard) {
		super();
		this.peopleName = peopleName;
		this.password = password;
		this.phone = phone;
		this.idCard = idCard;
	}
	public People(int peopleId, String peopleName, String password, String phone, String idCard) {
		super();
		this.peopleId = peopleId;
		this.peopleName = peopleName;
		this.password = password;
		this.phone = phone;
		this.idCard = idCard;
	}
	public int getPeopleId() {
		return peopleId;
	}
	public void setPeopleId(int peopleId) {
		this.peopleId = peopleId;
	}
	public String getPeopleName() {
		return peopleName;
	}
	public void setPeopleName(String peopleName) {
		this.peopleName = peopleName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCard == null) ? 0 : idCard.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + peopleId;
		result = prime * result + ((peopleName == null) ? 0 : peopleName.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
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
		People other = (People) obj;
		if (idCard == null) {
			if (other.idCard != null)
				return false;
		} else if (!idCard.equals(other.idCard))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (peopleId != other.peopleId)
			return false;
		if (peopleName == null) {
			if (other.peopleName != null)
				return false;
		} else if (!peopleName.equals(other.peopleName))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "people [peopleId=" + peopleId + ", peopleName=" + peopleName + ", password=" + password + ", phone="
				+ phone + ", idCard=" + idCard + "]";
	}
	
	

}
