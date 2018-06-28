package com.wx.ssm.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.sun.xml.internal.xsom.impl.scd.Iterators.Map;
import com.wx.ssm.mapper.CompanyMapper;
import com.wx.ssm.pojo.Company;
import com.wx.ssm.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{
	private static final Log log=LogFactory.getLog(CompanyServiceImpl.class);

	@Autowired
	CompanyMapper companyMapper;
	
	@Override
	public Map<String, Object> validate(String userId, String password) {
		// TODO Auto-generated method stub
		Map<String, Object> loginMap = new HashMap<>();
		Map<String, String> map=companyMapper.getLogin(userId);
		try { 
			if(map.get("password").equals(password)) {
				loginMap.put("loginMap", map);
				loginMap.put("status", 1);
				System.out.println("状态为1");
			} else {
				loginMap.put("status", 2);
			}
		}catch(Exception e) {
			loginMap.put("status", 0);
		}
		
		return loginMap;
	}

	@Override
	public boolean insert(String userId, String password, String tel) {
		// TODO Auto-generated method stub
		Company company=new Company(userId, password, tel);
		Map<String,String> map=companyMapper.getLogin(userId);
		try {
			log.error("已进入到try中");
			if(map==null) {
				log.error("已进入到if循环中");
				companyMapper.register(company);
				return true;
			}
		}catch(Exception e) {
			log.error("已进入到catch中");
			return false;
		}
		return false;
	}

}
