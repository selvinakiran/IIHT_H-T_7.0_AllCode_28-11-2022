package com.user.models;

public class JwtResponse {

	private String jwtToken;
	private String employeeID;
	private String role;

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public JwtResponse() {
		super();
	}

	public JwtResponse(String jwtToken, String employeeID, String role) {
		super();
		this.jwtToken = jwtToken;
		this.employeeID = employeeID;
		this.role = role;
	}

	
}
