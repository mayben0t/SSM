package com.wx.ssm.mapper;

import java.util.List;
import java.util.Map;

import com.wx.ssm.pojo.Companyuser;
import com.wx.ssm.pojo.Work;

/*
 * 对Companyuser表的增删改查操作
 */
public interface CompanyuserMapper {
	void insert(Companyuser companyuser);
	void delete(int id);
	void update(Companyuser updateuser);
	List<Companyuser> selectAll();
	Companyuser selectOneByUsername(String username);            //需要后期实现 暂时先不处理
	List<Companyuser> selectByCompanyID(int companyID);
	Companyuser selectOneByUserid(int id);  
//	void insert(Work work);
//	void delete(int id);
//	void update(Work updatework);
//	List<Work> selectAll();
//	Work selectOne(int id);
//	List<Work> selectByCompanyID(int CompanyID);
	Map<String, String> getLogin(Companyuser companyuser);
}
