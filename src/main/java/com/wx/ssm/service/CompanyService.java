package com.wx.ssm.service;

import java.util.Map;

public interface CompanyService {
	Map<String,Object> validate(String userId,String password);
	
	boolean insert(String userId,String password,String tel);
}
