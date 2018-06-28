package com.wx.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wx.ssm.mapper.StuffMapper;
import com.wx.ssm.pojo.Stuff;
import com.wx.ssm.service.StuffService;

@Service
public class StuffServiceImpl implements StuffService {

	@Autowired
	StuffMapper stuffMapper;
	
	@Override
	public boolean insert(Stuff stuff) {
		// TODO Auto-generated method stub
		try {
			stuffMapper.insert(stuff);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("材料表插入出错");
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		try {
			stuffMapper.delete(id);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("材料表删除出错");
		}
		return false;
	}

	@Override
	public boolean update(Stuff stuff) {
		// TODO Auto-generated method stub
		try {
			stuffMapper.update(stuff);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("材料表更新出错");
		}
		return false;
	}

	@Override
	public List<Stuff> getAll() {
		// TODO Auto-generated method stub
		return stuffMapper.selectAll();
	}

	@Override
	public Stuff selectStuffByID(int id) {
		// TODO Auto-generated method stub
		return stuffMapper.selectOne(id);
	}

}
