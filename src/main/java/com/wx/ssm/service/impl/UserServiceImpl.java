package com.wx.ssm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wx.ssm.mapper.UserMapper;
import com.wx.ssm.pojo.User;
import com.wx.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	private static final Log log=LogFactory.getLog(UserServiceImpl.class);
	
	@Autowired
	UserMapper usermapper;
	
//	@Autowired
//	User user;

	@Override
	public Map<String, Object> validate(String userId,String password) {
		// TODO Auto-generated method stub
		Map<String, Object> loginMap = new HashMap<>();
		Map<String,String> map=usermapper.getLogin(userId);
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
	public boolean insert(String userId, String password, String tel, String description) {
		// TODO Auto-generated method stub
		System.out.println("test1");
		User record=new User(userId,password,tel,description);
		Map<String,String> map=usermapper.getLogin(userId);
		try {
			System.out.println("test2");
			if(map!=null) System.out.println("zzzzzzzzzzzzzzzzaaqq");
			if(map==null) {				//要先判断map是否为空再判断map里是否有数据 否则空指针异常 最直接进catch里 破坏了程序流程
				System.out.println("test11zzzzzzzzzzzzzz");
				usermapper.register(record);
				return true;
			}
		}catch(Exception e) {
			System.out.println("test3");
			return false;
		}
		return false;
	}
	
	
}
