package com.wx.ssm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wx.ssm.mapper.CompanyuserMapper;
import com.wx.ssm.pojo.Companyuser;
import com.wx.ssm.service.CompanyuserService;

@Service
public class CompanyuserServiceImpl implements CompanyuserService {

	@Autowired
	CompanyuserMapper companyuserMapper;
	
	@Override
	public boolean insert(Companyuser companyuser) {
		// TODO Auto-generated method stub
		try {
			companyuserMapper.insert(companyuser);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("员工表的插入出错");
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		try {
			companyuserMapper.delete(id);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("员工表的删除出错");
		}
		return false;
	}

	@Override
	public boolean update(Companyuser companyuser) {
		// TODO Auto-generated method stub
		try {
			companyuserMapper.update(companyuser);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("员工表的更新出错");
		}
		return false;
	}

	@Override
	public List<Companyuser> getAll() {
		// TODO Auto-generated method stub
		return companyuserMapper.selectAll();
	}

	@Override
	public Companyuser getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return companyuserMapper.selectOneByUsername(username);
	}

	@Override
	public boolean login(String username, String password,int type) {		//登录功能 
		// TODO Auto-generated method stub
		Companyuser companyuser = null;
		companyuser=companyuserMapper.selectOneByUsername(username);
		if(companyuser!=null&&companyuser.getPassword().equals(password)&&(companyuser.getType()==type)) {
			return true;
		}
		return false;
	}

	@Override
	public List<Companyuser> getUserByCompanyID(int id) {
		// TODO Auto-generated method stub
		return companyuserMapper.selectByCompanyID(id);
	}

	@Override
	public Companyuser selectCompanyuserByID(int id) {
		// TODO Auto-generated method stub
		return companyuserMapper.selectOneByUserid(id);
	}

	@Override
	public Map<String, Object> validate(int companyID, String userId, String password, int type) {
		// TODO Auto-generated method stub
		Map<String, Object> loginMap = new HashMap<>();
		Companyuser companyuser = new Companyuser(companyID,type, userId, password);
		Map<String, String> map=companyuserMapper.getLogin(companyuser);
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

}
