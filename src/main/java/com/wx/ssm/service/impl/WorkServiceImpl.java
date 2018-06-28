package com.wx.ssm.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.alibaba.druid.support.logging.LogFactory;
import com.wx.ssm.mapper.WorkMapper;
import com.wx.ssm.pojo.Work;
import com.wx.ssm.service.WorkService;

@Service
public class WorkServiceImpl implements WorkService {
	private static final Log log = LogFactory.getLog(WorkServiceImpl.class);

	@Autowired
	WorkMapper workMapper;

	@Override
	public boolean insert(Work work) {
		// TODO Auto-generated method stub
		log.error("进入到workserviceimpl中的insert方法中");
		try {
			log.error("进入到workserviceimpl中的insert方法中的try中");
			workMapper.insert(work);
			return true;
		} catch (Exception e) {
			log.error("插入失败1");
			e.printStackTrace();
			// return false;
		}
		log.error("插入失败2");
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		try {
			workMapper.delete(id);
			return true;
		} catch (Exception e) {
			log.error("删除失败1");
			e.printStackTrace();
		}
		log.error("删除失败2");
		return false;
	}

	@Override
	public boolean update(Work work) {
		// TODO Auto-generated method stub
		try {
			workMapper.update(work);
			return true;
		} catch (Exception e) {
			log.error("更新失败1");
			e.printStackTrace();
		}
		log.error("更新失败2");
		return false;
	}

	@Override
	public List<Work> getWork(int companyID) {
		// TODO Auto-generated method stub
		return workMapper.selectByCompanyID(companyID);
	}

	@Override
	public List<Work> getAll() {
		// TODO Auto-generated method stub
//		log.error(workMapper.selectAll());
//		for(Work work:workMapper.selectAll()) {
//			System.out.println(work.getID()+" "+work.getCompanyID()+" "+work.getCompanyUserid()+" "+work.getDescription());
//		}
		return workMapper.selectAll();
	}

	@Override
	public Work selectWorkByID(int id) {
		// TODO Auto-generated method stub
		return workMapper.selectOne(id);
	}

}
