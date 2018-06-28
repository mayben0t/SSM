package com.wx.ssm.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wx.ssm.pojo.Transaction;
import com.wx.ssm.service.TransactionService;
import com.wx.ssm.mapper.TransactionMapper;

@Service
public class TransactionServiceImpl implements TransactionService {
	private static final Log log = LogFactory.getLog(TransactionServiceImpl.class);

	@Autowired
	TransactionMapper transactionMapper;
	
	@Override
	public boolean insert(Transaction transaction) {
		// TODO Auto-generated method stub
		log.info("进入到事务插入");
		try {
			transactionMapper.insert(transaction);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			log.error("事务插入出错");
		}
		return false;
	}

	@Override
	public boolean update(Transaction transaction) {
		// TODO Auto-generated method stub
		
		try { transactionMapper.update(transaction);return true;}
		catch(Exception e) {
			e.printStackTrace();return false;
		}
	}

	@Override
	public boolean updatebyuser(int userConfirm, int ID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Transaction> getAll() {
		// TODO Auto-generated method stub
		return transactionMapper.selectAll();
	}

	@Override
	public Transaction selectTransactionByID(int id) {
		// TODO Auto-generated method stub
		return transactionMapper.selectOne(id);
	}

	@Override
	public List<Transaction> selectTransactionByuserID(int userid) {
		// TODO Auto-generated method stub
		return transactionMapper.selectTransactionByuserID(userid);
	}

	@Override
	public List<Transaction> selectTransactionBycompanyID(int companyid) {
		// TODO Auto-generated method stub
		return transactionMapper.selectTransactionBycompanyID(companyid);
	}

}
