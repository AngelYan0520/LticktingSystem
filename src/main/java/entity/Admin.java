package entity;
/*
 * 管理员实体类
 */
import java.io.Serializable;

public class Admin implements Serializable{

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	
	private int adminId ;
	private String adminName;
	private String password;
	private int departmentId;
	private String phone;
	
	public Admin() {
		super();
	}
	public Admin(String adminName, String password, int departmentId,String phone) {
		super();
		this.adminName = adminName;
		this.password = password;
		this.departmentId = departmentId;
		this.phone = phone;
	}
	public Admin(int adminId, String adminName, String password, int departmentId,String phone) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.password = password;
		this.departmentId = departmentId;
		this.phone = phone;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
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
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adminId;
		result = prime * result + ((adminName == null) ? 0 : adminName.hashCode());
		result = prime * result + departmentId;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		Admin other = (Admin) obj;
		if (adminId != other.adminId)
			return false;
		if (adminName == null) {
			if (other.adminName != null)
				return false;
		} else if (!adminName.equals(other.adminName))
			return false;
		if (departmentId != other.departmentId)
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
		return true;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", password=" + password + ", departmentId="
				+ departmentId + ", phone=" + phone + "]";
	}
	
	
}
