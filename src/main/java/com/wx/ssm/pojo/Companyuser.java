package com.wx.ssm.pojo;

/*
 * 公司员工pojo类
 * type实现身份标识＋权限控制
 */
public class Companyuser {
	private Integer ID;
	private Integer companyID;
	private Integer type;
	private String username;
	private String password;
	private String tel;
	private Integer income;			//员工收入 单位  元/月
	
	
	public Companyuser() {
//		super();
	}
	public Companyuser(Integer iD, Integer companyID, Integer type, String username, String password, String tel,
			Integer income) {
//		super();
		this.ID = iD;
		this.companyID = companyID;
		this.type = type;
		this.username = username;
		this.password = password;
		this.tel = tel;
		this.income = income;
	}
	
	
	public Companyuser(Integer companyID, Integer type, String username, String password) {
		super();
		this.companyID = companyID;
		this.type = type;
		this.username = username;
		this.password = password;
	}
	public Companyuser(Integer companyID, Integer type, String username, String password, String tel, Integer income) {
		super();
		this.companyID = companyID;
		this.type = type;
		this.username = username;
		this.password = password;
		this.tel = tel;
		this.income = income;
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
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public Integer getIncome() {
		return income;
	}
	public void setIncome(Integer income) {
		this.income = income;
	}
	
	
	
}
