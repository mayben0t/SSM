package com.wx.ssm.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wx.ssm.service.CompanyService;

@Controller
@RequestMapping("/Company")
public class CompanyController {
	private static final Log log=LogFactory.getLog(CompanyController.class);
	
	@Autowired
	CompanyService companyService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("CompanyID") String companyid,
			@RequestParam("password") String password,HttpSession session){
//		 response.setContentType("text/html;charset=UTF-8");/
		System.out.println("companyid and password"+companyid+" "+password);
		Map<String,Object> tempmap=companyService.validate(companyid,password);
//		Map<String,String> map2=tempmap
		log.error(tempmap.get("status"));
//		System.out.println(((String)tempmap.get("status")).equals("1"));
//		System.out.println(tempmap.get("status").toString().equals("1"));
		if(tempmap!=null&&tempmap.get("status").toString().equals("1")) 
		{
			System.out.println("进入到if中");
//			HttpSession session=request.getSession();
			Map<String,String> map2=(Map<String, String>) tempmap.get("loginMap");
//			session.setAttribute("ID", map2.get("ID"));
//			System.out.println();
			log.debug("*************************************");
			log.debug(map2.get("ID"));
			log.debug(map2.get("Userid"));
			session.setAttribute("CompanyID",map2.get("ID"));
			session.setAttribute("CompanyUserid",map2.get("userid"));
			session.setAttribute("CompanyTel",map2.get("tel"));
//			session.setAttribute("CompanyID",companyid);
			return "CompanyBase";
		}
		return "CompanyLogin";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(@RequestParam("userId") String userId,
			@RequestParam("password") String password,
			@RequestParam("tel") String tel) 
	{
		if(companyService.insert(userId, password, tel)) return "CompanyLogin";
		return "CompanyRegister";
	}
}
