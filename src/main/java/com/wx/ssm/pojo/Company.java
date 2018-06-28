package com.wx.ssm.pojo;

public class Company {
	private Integer ID;
	private String userid;
	private String password;
	private String tel;
	
	
	public Company() {
//		super();
	}
	public Company(String userid, String password, String tel) {
		super();
//		ID = iD;
		this.userid = userid;
		this.password = password;
		this.tel = tel;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
}
