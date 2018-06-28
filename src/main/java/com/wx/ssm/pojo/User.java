package com.wx.ssm.pojo;

public class User {
    private Integer ID;

    private String userid;

    private String password;

    private String tel;

    private String description;

    
    
	public User() {
//		super();
	}

	public User( String userid, String password, String tel, String description) {
//		super();
		this.userid = userid;
		this.password = password;
		this.tel = tel;
		this.description = description;
	}

	public Integer getID() {
		return ID;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setID(Integer iD) {
		ID = iD;
	}


	
    

   
}