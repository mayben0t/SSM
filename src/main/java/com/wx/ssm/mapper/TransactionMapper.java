package com.wx.ssm.mapper;

import java.util.List;

import com.wx.ssm.pojo.Transaction;

//import com.wx.ssm.pojo.Stuff;

public interface TransactionMapper {
	//对事务表的增删改查操作
		void insert(Transaction transaction);
		void delete(int id);
		void update(Transaction transaction);
		void updatebyuser(int userConfirm,int ID);
		List<Transaction> selectAll();
		Transaction selectOne(int id);
		List<Transaction> selectTransactionByuserID(int userid);	
		List<Transaction> selectTransactionBycompanyID(int companyid);	
}
