package com.wx.ssm.mapper;

import java.util.List;

import com.wx.ssm.pojo.Work;

//import com.wx.ssm.pojo.Companyuser;

public interface WorkMapper {
	//对业务表的增删改查操作
	void insert(Work work);
	void delete(int id);
	void update(Work updatework);
	List<Work> selectAll();
	Work selectOne(int id);
	List<Work> selectByCompanyID(int CompanyID);
}
