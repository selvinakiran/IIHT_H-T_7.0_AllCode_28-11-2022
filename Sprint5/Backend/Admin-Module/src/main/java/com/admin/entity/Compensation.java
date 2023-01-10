package com.admin.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPENSAION")
public class Compensation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long planid;

	@Column(name = "PARTNER_NAME")
	private String partnername;

	@Column(name = "COMPENSATION_PLAN")
	private String compensationplan;
	
	@Column(name = "VALID_TO")
	private LocalDate validto;
	
	@Column(name = "VALID_FROM")
	private LocalDate validfrom;
	
	@Column(name = "CALCULATION_METHOD")
	private String calculation;

	public Long getPlanid() {
		return planid;
	}

	public void setPlanid(Long planid) {
		this.planid = planid;
	}

	public String getPartnername() {
		return partnername;
	}

	public void setPartnername(String partnername) {
		this.partnername = partnername;
	}

	public String getCompensationplan() {
		return compensationplan;
	}

	public void setCompensationplan(String compensationplan) {
		this.compensationplan = compensationplan;
	}

	public LocalDate getValidto() {
		return validto;
	}

	public void setValidto(LocalDate validto) {
		this.validto = validto;
	}

	public LocalDate getValidfrom() {
		return validfrom;
	}

	public void setValidfrom(LocalDate validfrom) {
		this.validfrom = validfrom;
	}

	public String getCalculation() {
		return calculation;
	}

	public void setCalculation(String calculation) {
		this.calculation = calculation;
	}

	public Compensation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Compensation [planid=" + planid + ", partnername=" + partnername + ", compensationplan="
				+ compensationplan + ", validto=" + validto + ", validfrom=" + validfrom + ", calculation="
				+ calculation + "]";
	}
	
	
	
	
	

}
