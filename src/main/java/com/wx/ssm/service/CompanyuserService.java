package com.wx.ssm.service;

import java.util.List;
import java.util.Map;

import com.wx.ssm.pojo.Companyuser;
import com.wx.ssm.pojo.Work;

/*
 * 对公司用户表的操作
 */
public interface CompanyuserService {
	boolean insert(Companyuser companyuser);		//插入员工
	boolean delete(int id);							//删除员工
	boolean update(Companyuser companyuser);		//修改员工
	List<Companyuser> getAll();						//获取所有员工值
	Companyuser getUserByUsername(String username);	//在登录时根据员工的登录名拿到该员工的数据 以便于权限控制
	boolean login(String username,String password,int type);	//员工的登录功能实现
	List<Companyuser> getUserByCompanyID(int id);
	Companyuser selectCompanyuserByID(int id);
	Map<String,Object> validate(int companyID,String userId,String password,int type);
}
