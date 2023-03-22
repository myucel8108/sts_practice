package kr.co.rland.web.entity;

public class UserInfo {
	private String username;
	private String email;
	private String regDate;
	private String roleId;
	
	
	//생성자
	public UserInfo(String username, String email, String regDate, String roleId) {
		super();
		this.username = username;
		this.email = email;
		this.regDate = regDate;
		this.roleId = roleId;
	}
	
	public String getUsername() {
			return username;
		}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRegDate() {
		return regDate;
	}


	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}


	public String getRoleId() {
		return roleId;
	}


	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "UserInfo [username=" + username + ", email=" + email + ", regDate=" + regDate + ", roleId=" + roleId
				+ "]";
	}



	
	
}
