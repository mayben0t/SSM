package com.wx.ssm.service;

import java.util.List;
import java.util.Map;

import com.wx.ssm.pojo.User;

public interface UserService {
	Map<String, Object> validate(String userId,String password);
	
	boolean insert(String userId,String password,String tel,String description);
}
