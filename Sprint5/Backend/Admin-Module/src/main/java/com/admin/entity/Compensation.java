package com.admin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "VALID_TO")
	private Date validto;
	
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "VALID_FROM")
	private Date validfrom;
	
	@Column(name = "CALCULATION_METHOD")
	private String calculation;
	
	@Column(name = "TRANSACTION_PERCENTAGE")
	private String tranpercentage;
	

	public String getTranpercentage() {
		return tranpercentage;
	}

	public void setTranpercentage(String tranpercentage) {
		this.tranpercentage = tranpercentage;
	}

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

	public Date getValidto() {
		return validto;
	}

	public void setValidto(Date validto) {
		this.validto = validto;
	}

	public Date getValidfrom() {
		return validfrom;
	}

	public void setValidfrom(Date validfrom) {
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

	public Compensation(Long planid, String partnername, String compensationplan, Date validto, Date validfrom,
			String calculation, String tranpercentage) {
		super();
		this.planid = planid;
		this.partnername = partnername;
		this.compensationplan = compensationplan;
		this.validto = validto;
		this.validfrom = validfrom;
		this.calculation = calculation;
		this.tranpercentage = tranpercentage;
	}
	
	
	
	
	

}
