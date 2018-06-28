package com.wx.ssm.pojo;

public class Transaction {
	private Integer ID;
	private Integer userID;
	private Integer companyID;
	private Double money= 50.00;
	private String description;
	private Integer progress=0;
	private Integer userConfirm=0;
	private Double total=0.00;
	
	
	
	public Transaction() {
//		super();
	}
	

	public Transaction(Integer userID, Integer companyID, String description) {
		super();
		this.userID = userID;
		this.companyID = companyID;
		this.description = description;
	}


	public Transaction(Integer iD, Integer userID, Integer companyID, Double money, String description,
			Integer progress, Integer userConfirm, Double total) {
//		super();
		this.ID = iD;
		this.userID = userID;
		this.companyID = companyID;
		this.money = money;
		this.description = description;
		this.progress = progress;
		this.userConfirm = userConfirm;
		this.total = total;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Integer getCompanyID() {
		return companyID;
	}

	public void setCompanyID(Integer companyID) {
		this.companyID = companyID;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getProgress() {
		return progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public Integer getUserConfirm() {
		return userConfirm;
	}

	public void setUserConfirm(Integer userConfirm) {
		this.userConfirm = userConfirm;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	
	
}	
