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
import org.springframework.web.servlet.ModelAndView;

import com.wx.ssm.pojo.Work;
import com.wx.ssm.service.WorkService;

@Controller
@RequestMapping("/work")
public class WorkController {
	private static final Log log = LogFactory.getLog(WorkController.class);
	
	@Autowired
	WorkService workService;
	
	@RequestMapping("/insert")
	public String workInsert(HttpSession session) {				//因为是业务插入功能 所以返回的页面只能是公司的work新增界面
		if(session.getAttribute("type")==null) 
		{
		return "CompanyServiceInsert";
		}
		else {
		return "CompanyService";
		}
	}
	
	@RequestMapping(value="/insertcomplete",method=RequestMethod.POST)		
	public String workInsertComplete(@RequestParam(value="companyidinsert") Integer companyidinsert,
			@RequestParam(value="companyuseridinsert") String companyuseridinsert,
			@RequestParam(value="descriptioninsert") String descriptioninsert,
			HttpSession session) {		//这是插入业务完成的处理方法 因为只有公司才有插入业务的权限 所以插入完成后 所返回的页面也就必须是CompanyService页面
		log.error("进入到insertcomplete中");
		Work work = new Work(companyidinsert,companyuseridinsert,descriptioninsert);
		if(workService.insert(work)) {
			return getWorkByCompanyID(companyidinsert,session);
		}
		else {
			return "Error";
		}
	}
	
	@RequestMapping(value="/delete/{id}")
	public String workDelete(@PathVariable int id,HttpSession session) {
//		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz进入到删除");
//		System.out.println("id"+id+"    aaaaaaaaaaaaaaaaaa");
//		log.error("id"+id+"    aaaaaaaaaaaaaaaaaa");
		if(session.getAttribute("type")==null) 
		{
		if(workService.delete(id)) {
			int companyid=(int) session.getAttribute("CompanyID");
			return getWorkByCompanyID(companyid, session);
		}
		else {
			return "Error";
		}}
		else
		{
			return "Error";
		}
	}
	
	@RequestMapping(value="/update/{id}")
	public String workUpdate(@PathVariable int id,Model model,HttpSession session) {			//这个是第一次点击业务更新的处理方法，与插入用的是同一个页面，不同的是要在表单里赋值，其值就是根据id查找出来的值
//		log.debug(id+"    zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
		if(session.getAttribute("type")==null) {
		Work updatework=workService.selectWorkByID(id);
		model.addAttribute("updatework",updatework);
		return "CompanyServiceInsert";		}				//记得得在前端jsp页面中用jstl/el语句进行数据的填充
		else {
			return "Error";
		}
	}
	
	@RequestMapping(value="/updateComplete/{id}",method=RequestMethod.POST)
	public String workUpdateComplete(@PathVariable("id") int id,
			@RequestParam("companyID") int companyID,
			@RequestParam("companyUserid") String companyUserid,
			@RequestParam("description") String description,
			HttpSession session) {
		System.out.println("qqqqqqqqqqqqqqqqqq进入到updatecomplete方法中");
		Work work=new Work(id,companyID, companyUserid, description);
		if(workService.update(work)) {
			return getWorkByCompanyID(companyID, session);
		}else {
			return "Error";
		}
	}
	
	@RequestMapping(value="/companyselectAll/{CompanyID}",method=RequestMethod.GET)			//zz公司对业务的查询，只显示自家公司的业务
	public String getWorkByCompanyID(@PathVariable int CompanyID,HttpSession session) {
		System.out.println("进入到公司业务中");
		System.out.println(CompanyID);
		List<Work> getWorklist = null;
		getWorklist=workService.getWork(CompanyID);
		if(getWorklist!=null) { System.out.println("取到值了");}
		else { System.out.println("getWorklist为null");}
		session.setAttribute("CompanyWork", getWorklist);
		return "CompanyService";
	}
	
	
//	@RequestMapping(value="/userselectAll")				//用户对业务的查询
//	public ModelAndView workSelectAll(ModelAndView model) {
//		List<Work> workAlllist=workService.getAll();
//		model.addObject("workAlllist",workAlllist);
//		model.setViewName("service");
//		return model;
//	}
	
	@RequestMapping(value="/userselectAll")				//用户对业务的查询
	public String workSelectAll(Model model) {
		List<Work> workAlllist=workService.getAll();
		
		System.out.println("********************"+workAlllist.get(0).getCompanyID());
		for(Work work:workAlllist) {
			log.debug(work.getID()+" "+work.getCompanyID()+" "+work.getCompanyUserid()+" "+work.getDescription());
		}
		model.addAttribute("workAlllist",workAlllist);
//		model.setViewName("service");
		return "service";
	}
	
}
