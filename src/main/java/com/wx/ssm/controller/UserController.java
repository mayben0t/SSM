package com.wx.ssm.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wx.ssm.pojo.User;
import com.wx.ssm.service.UserService;

@Controller
@RequestMapping("/User")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("username") String username,
			@RequestParam("password") String password,
			HttpSession session,HttpServletRequest request){
		Map<String,Object> tempmap=userService.validate(username,password);
//		Map<String,String> map2=tempmap
//		log.error(tempmap.get("status"));
//		System.out.println(((String)tempmap.get("status")).equals("1"));
//		System.out.println(tempmap.get("status").toString().equals("1"));
//		System.out.println("@@@@@@@@@@@@@@@@@"+request.getParameterNames().toString());
		Enumeration zz=request.getParameterNames();
		while(zz.hasMoreElements()) {
			System.out.println("@@@@@@"+zz.nextElement());
		}
		System.out.println("username and password"+username+" "+password);
		if(tempmap!=null&&tempmap.get("status").toString().equals("1")) 
		{
//			System.out.println("进入到if中");
//			HttpSession session=request.getSession();
			Map<String,String> map2=(Map<String, String>) tempmap.get("loginMap");
//			session.setAttribute("ID", map2.get("ID"));
//			System.out.println();
//			log.debug("*************************************");
//			log.debug(map2.get("ID"));
//			log.debug(map2.get("Userid"));
			session.setAttribute("UserID",map2.get("ID"));
//			session.setAttribute("CompanyUserid",map2.get("userid"));
//			session.setAttribute("CompanyTel",map2.get("tel"));
//			session.setAttribute("CompanyID",companyid);
			return "Base";
		}
		return "UserLogin";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String login(@RequestParam("username") String username,
			@RequestParam("password") String password,
			@RequestParam("tel") String tel,
			@RequestParam("description") String description) {
		System.out.println("test");
		if(userService.insert(username,password,tel,description))	return "UserLogin";
		return "UserRegister";
	}
	
}
