package com.wx.ssm.pojo;

public class Work {
	private Integer ID;
	private Integer companyID;
	private String companyUserid;
	private String description;
	
	
	public Work() {
	}
	
	
	
	public Work(Integer companyID, String companyUserid, String description) {
		super();
		this.companyID = companyID;
		this.companyUserid = companyUserid;
		this.description = description;
	}



	public Work(Integer iD, Integer companyID, String companyUserid, String description) {
		super();
		ID = iD;
		this.companyID = companyID;
		this.companyUserid = companyUserid;
		this.description = description;
	}



	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public Integer getCompanyID() {
		return companyID;
	}
	public void setCompanyID(Integer companyID) {
		this.companyID = companyID;
	}
	public String getCompanyUserid() {
		return companyUserid;
	}
	public void setCompanyUserid(String companyUserid) {
		this.companyUserid = companyUserid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
