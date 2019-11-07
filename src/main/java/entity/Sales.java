package entity;

import java.io.Serializable;

/**
 * 营业员表
 * @author windows
 *
 */
public class Sales implements Serializable{
	
	private static final long serialVersionUID = 2427165183041369292L;
	private int salesId;
	private int branchId;
	private String name;
	private String password;
	private String phone;
	
	public Sales() {}

	public Sales(int salesId, int branchId, String name, String password, String phone) {
		super();
		this.salesId = salesId;
		this.branchId = branchId;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}

	public int getsalesId() {
		return salesId;
	}

	public void setsalesId(int salesId) {
		this.salesId = salesId;
	}

	public int getbranchId() {
		return branchId;
	}

	public void setbranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + branchId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + salesId;
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
		Sales other = (Sales) obj;
		if (branchId != other.branchId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (salesId != other.salesId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sales [salesId=" + salesId + ", branchId=" + branchId + ", name=" + name + ", password=" + password
				+ ", phone=" + phone + "]";
	}
	
	
}
