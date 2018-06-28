package com.wx.ssm.service;

import java.util.List;

import com.wx.ssm.pojo.Transaction;

//import com.wx.ssm.pojo.Stuff;

public interface TransactionService {
	boolean insert(Transaction transaction);			//新增事务
//	boolean delete(int id);					
	boolean update(Transaction transaction);			//修改事务
	boolean updatebyuser(int userConfirm,int ID);
	List<Transaction> getAll();
	Transaction selectTransactionByID(int id);			//根据id获取事务对象 并进行填充
	List<Transaction> selectTransactionByuserID(int userid);	
	List<Transaction> selectTransactionBycompanyID(int companyid);	
}
