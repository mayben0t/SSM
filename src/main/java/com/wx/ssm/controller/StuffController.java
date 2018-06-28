package com.wx.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wx.ssm.pojo.Stuff;
import com.wx.ssm.pojo.Work;
import com.wx.ssm.service.StuffService;
import com.wx.ssm.service.WorkService;
import com.wx.ssm.util.typeutil;

@Controller
@RequestMapping("/stuff")
public class StuffController {
private static final Log log = LogFactory.getLog(WorkController.class);
	
	@Autowired
	StuffService stuffService;
	
	@RequestMapping("/insert")
	public String stuffInsert(HttpSession session) {				//因为是业务插入功能 所以返回的页面只能是公司的work新增界面
		if(session.getAttribute("type")==null||(int)session.getAttribute("type")<=typeutil.getType())
		return "CompanyStuffInsert";
		return "Error";
	}
	
	@RequestMapping(value="/insertcomplete",method=RequestMethod.POST)		
	public String workInsertComplete(@RequestParam("stuffnameinsert")String name,
			@RequestParam("stuffdescriptioninsert") String companyUserid,
			@RequestParam("stuffpayinsert") String pay,
			Model model) {		//这是插入业务完成的处理方法 因为只有公司才有插入业务的权限 所以插入完成后 所返回的页面也就必须是CompanyService页面
		Stuff stuff = new Stuff(name,companyUserid,pay);
		if(stuffService.insert(stuff)) {
			return getStuffByCompanyID(model);
		}
		else {
			return "Error";
		}
	}
	
	@RequestMapping(value="/delete/{id}")
	public String stuffDelete(@PathVariable int id,Model model,HttpSession session) {
		if(session.getAttribute("type")==null||(int)session.getAttribute("type")<=typeutil.getType()) {
		if(stuffService.delete(id)) {
			return getStuffByCompanyID(model);
		}
		else {
			return "Error";
		}}
		else {
			return "Error";
		}
	}
	
	@RequestMapping(value="/update/{id}")
	public String stuffUpdate(@PathVariable int id,Model model,HttpSession session) {			//这个是第一次点击材料更新的处理方法，与插入用的是同一个页面，不同的是要在表单里赋值，其值就是根据id查找出来的值
		if(session.getAttribute("type")==null||(int)session.getAttribute("type")<=typeutil.getType())
		{
		Stuff updatestuff=stuffService.selectStuffByID(id);
		model.addAttribute("updatestuff",updatestuff);
		return "CompanyStuffInsert";						//记得得在前端jsp页面中用jstl/el语句进行数据的填充
		}
		else {
			return "Error";
		}
	}
	
	@RequestMapping(value="/updateComplete/{id}",method=RequestMethod.POST)
	public String workUpdateComplete(@PathVariable("id") int id,
			@RequestParam("stuffname") String name,
			@RequestParam("stuffdescription") String description,
			@RequestParam("stuffpay") String pay,
			Model model) {
		Stuff stuff=new Stuff(id,name,description,pay);
		if(stuffService.update(stuff)) {
			return getStuffByCompanyID(model);
		}else {
			return "Error";
		}
	}
	
	@RequestMapping(value="/companyselectAll",method=RequestMethod.GET)			//公司对材料的查询，只显示自家公司的材料
	public String getStuffByCompanyID(Model model) {
//		System.out.println("进入到公司材料中");
//		System.out.println(CompanyID);
		List<Stuff> getStufflist = null;
		getStufflist=stuffService.getAll();
		if(getStufflist!=null) { System.out.println("取到值了");}
		else { System.out.println("getStufflist为null");}
		model.addAttribute("CompanyStuff", getStufflist);
		return "CompanyStuff";
	}
	
	
//	@RequestMapping(value="/userselectAll")				//用户对业务的查询
//	public ModelAndView workSelectAll(ModelAndView model) {
//		List<Work> workAlllist=workService.getAll();
//		model.addObject("workAlllist",workAlllist);
//		model.setViewName("service");
//		return model;
//	}
	
	@RequestMapping(value="/userselectAll")				//用户对业务的查询
	public String stuffSelectAll(Model model) {
		List<Stuff> stuffAlllist=stuffService.getAll();
		
		System.out.println("********************"+stuffAlllist.get(0).getName());
		for(Stuff stuff:stuffAlllist) {
			log.debug(stuff.getID()+" "+stuff.getName()+" "+stuff.getDescription()+" "+stuff.getPay());
		}
		model.addAttribute("stuffAlllist",stuffAlllist);
//		model.setViewName("service");
		return "userstuff";
	}
	
}
