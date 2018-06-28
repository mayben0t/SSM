package com.wx.ssm.mapper;

import java.util.List;

import com.wx.ssm.pojo.Stuff;



public interface StuffMapper {
	//对材料表的增删改查操作
		void insert(Stuff stuff);
		void delete(int id);
		void update(Stuff stuff);
		List<Stuff> selectAll();
		Stuff selectOne(int id);
}
