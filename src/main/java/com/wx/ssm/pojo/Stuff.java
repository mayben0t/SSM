package com.wx.ssm.pojo;

/*
 * 材料pojo类
 */
public class Stuff {
	private Integer ID;
	private String name;
	private String description;
	private String pay;
	
	
	
	public Stuff() {
//		super();
	}
	public Stuff(Integer iD, String name, String description, String pay) {
//		super();
		this.ID = iD;
		this.name = name;
		this.description = description;
		this.pay = pay;
	}
	
	
	
	public Stuff(String name, String description, String pay) {
		super();
		this.name = name;
		this.description = description;
		this.pay = pay;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	
	
	
}
