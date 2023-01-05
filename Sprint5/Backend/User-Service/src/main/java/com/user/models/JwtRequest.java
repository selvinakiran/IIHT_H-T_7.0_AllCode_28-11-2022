package com.user.models;

public class JwtRequest {

	private String employeeID;
	private String password;

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public JwtRequest(String employeeID, String password) {
		super();
		this.employeeID = employeeID;
		this.password = password;
	}

	public JwtRequest() {
		super();
	}

}
