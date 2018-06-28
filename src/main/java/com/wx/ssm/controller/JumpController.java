package com.wx.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wx.ssm.pojo.Work;
import com.wx.ssm.service.CompanyService;
//import com.wx.ssm.service.CompanyServiceService;

@Controller
@RequestMapping("/jump")
public class JumpController {
//	@Autowired
//	CompanyServiceService companyServiceService;

	@RequestMapping("/UserRegister")
	public String jumpA() {
		return "UserRegister";
	}
	
	@RequestMapping("/CompanyLogin")
	public String jumpB() {
//		System.out.println("ttttttt");
		return "CompanyLogin";
	}
	
	@RequestMapping("/CompanyRegister")
	public String jumpC() {
		return "CompanyRegister";
	}
	
	@RequestMapping("/UserLogin")
	public String jumpD() {
		return "UserLogin";
	}
	
	@RequestMapping("/service")
	public String jumpE() {
		return "service";
	}
	
	@RequestMapping("/transaction")
	public String jumpF() {
		return "transaction";
	}
	
	@RequestMapping("/connect")
	public String jumpG() {
		return "connect";
	}
	
	@RequestMapping(value="/CompanyServiceInsert")
	public String jumpH(HttpSession session) {
//		session=request.getSession();
		if(session.getAttribute("Type")==null||"".equals(session.getAttribute("Type")))
		return "CompanyServiceInsert";
		
		return "CompanyService";
	}
	
//	@RequestMapping(value="/CompanyServiceUpdate")
//	public String jumpCompanyService(Model model,HttpSession session) {
//		if(session.getAttribute("Type")==null||"".equals(session.getAttribute("Type")))
//		{
//			return "CompanyServiceInsert";
//		if(session.getAttribute("id")!=null)					//id不为空说明是修改/删除
//		{
//		int id=(int) session.getAttribute("id");
//		List<Work> list = companyServiceService.getService(id);
//		model.addAttribute(list);
//		}else													//否则打开CompanyServiceInsert页面
//		{
//			List<Work> list2=companyServiceService.getAll();
//			model.addAttribute(list2);
//		}
//		
//		return "CompanyServiceInsert";}
//		else {
//			return "CompanyService";
//		}
//	}
	
	@RequestMapping(value="/CompanyTransaction")
	public String jumpCompanyTransaction() {
		return "CompanyTransaction";
	}
	
	@RequestMapping(value="/CompanyEmployee")
	public String jumpCompanyEmployee() {
		return "CompanyEmployee";
	}
	
	@RequestMapping(value="/CompanyStuff")
	public String jumpCompanyStuff() {
		return "CompanyStuff";
	} 
	
	@RequestMapping(value="/CompanyUserLogin")
	public String jumpCompanyUserLogin() {
		return "login";
	}
}
