package com.resourse.entity;

public class Resourse {
	
	private Long rID;
	private String resourcename;
	private String domain;
	private String email;
	private Long userID;
	
	public Resourse(Long rID, String resourcename, String domain, String email, Long userID) {
		super();
		this.rID = rID;
		this.resourcename = resourcename;
		this.domain = domain;
		this.email = email;
		this.userID = userID;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Long getrID() {
		return rID;
	}

	public void setrID(Long rID) {
		this.rID = rID;
	}

	public String getResourcename() {
		return resourcename;
	}

	public void setResourcename(String resourcename) {
		this.resourcename = resourcename;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}
	
	

}
