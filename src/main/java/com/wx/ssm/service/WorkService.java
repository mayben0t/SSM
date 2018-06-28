package com.wx.ssm.service;

import java.util.List;

import com.wx.ssm.pojo.Work;

public interface WorkService {
	//对业务表的操作
	boolean insert(Work work);				//插入业务功能
	boolean delete(int id);					//根据主键删除业务功能
	boolean update(Work work);				//更新业务功能
	Work selectWorkByID(int id);
	List<Work> getWork(int companyID); 		//根据公司id获取当前提供的业务功能
	List<Work> getAll();					//获取所有公司提供的业务功能
}
