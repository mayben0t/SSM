package com.wx.ssm.mapper;

import java.util.Map;

import com.wx.ssm.pojo.Company;


public interface CompanyMapper {
	Map<String,String> getLogin(String userId);
	void register(Company user);
	int getCompanyid(String userid);		//根据公司名获取公司的id值
}
