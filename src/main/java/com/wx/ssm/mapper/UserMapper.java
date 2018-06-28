package com.wx.ssm.mapper;

import java.util.Map;

import com.wx.ssm.pojo.User;

public interface UserMapper {
	Map<String,String> getLogin(String userId);
	void register(User user);
}
