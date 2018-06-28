package com.wx.ssm.service;

import java.util.List;

import com.wx.ssm.pojo.Stuff;

/*
 * 对材料表的操作
 */
public interface StuffService {
	boolean insert(Stuff stuff);			//新增材料
	boolean delete(int id);					//用id删除材料
	boolean update(Stuff stuff);			//修改材料
	List<Stuff> getAll();
	Stuff selectStuffByID(int id);			//根据id获取材料对象 并进行填充
}
