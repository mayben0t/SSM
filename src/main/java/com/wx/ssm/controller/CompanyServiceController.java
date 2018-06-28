package com.wx.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Companyservice")
public class CompanyServiceController {
	@RequestMapping("/insert")
	public String serviceinsert() {
		return null;
	}
	
	@RequestMapping("/delete")
	public String servicedelete() {
		return null;
	}
	
	@RequestMapping("/update")
	public String serviceupdate() {
		return null;
	}
	
	@RequestMapping("/query")
	public String servicequery() {
		return null;
	}
}
