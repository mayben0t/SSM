package com.wx.ssm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wx.ssm.pojo.Transaction;
import com.wx.ssm.service.TransactionService;

@Controller
@RequestMapping("/trans")
public class TransactionController {
	@Autowired
	TransactionService transactionService;
	
	@RequestMapping("/selectbyuserid")
	public String selectbyuserid(HttpSession session,Model model) {
		int userid = (int)session.getAttribute("UserID");
		List<Transaction> list= transactionService.selectTransactionByuserID(userid);
		model.addAttribute("transactionlist", list);
		return "transaction";
	}
	
	@RequestMapping("/insert/{id}/{companyid}/{description}")
	public String insert(@PathVariable(value="id") int userID,
			@PathVariable(value="companyid") int companyID,
			@PathVariable(value="description") String description,
			HttpSession session,
			Model model) {
		Transaction transaction =  new Transaction(userID,companyID,description);
		transactionService.insert(transaction);
		return selectbyuserid(session, model);
	}
	
	@RequestMapping(value="/pay/{traid}/{money}")
	public String pay(@PathVariable(value="traid") int traid,
			@PathVariable(value="money") int money,
			@RequestParam(value="userConfirm") int userConfirm,
			HttpServletResponse response,
			Model model,
			HttpSession session) throws IOException {
//		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz执行到了61");
		
		if(userConfirm == 7) {
//			PrintWriter out = response.getWriter();
//			out.println("<script>alert('该项目已结束，无法继续打款!');</script>");
//			response.setContentType("text/html; charset=utf-8");
//			PrintWriter out;
//			out = response.getWriter();
//			out.println("<html><body><script type='text/javascript'>alert('该项目已结束，无法继续打款!');</script></body></html>");
			return selectbyuserid(session, model);
		}
		model.addAttribute("paytraid", traid);
		model.addAttribute("paymoney", money);
		return "Pay";
	}
	
	@RequestMapping(value="/paycomplete",method=RequestMethod.POST)
	public String paycomplete(@RequestParam("paytraid") int traid,
			@RequestParam("pay") int money,
			HttpSession session,
			Model model) {
		Transaction transaction = transactionService.selectTransactionByID(traid);
		int userconfirm = transaction.getUserConfirm();
		int progress = transaction.getProgress();
		if(userconfirm==progress&&userconfirm<=6)  {
			if(userconfirm+1 == 1) userconfirm = 2;
			else userconfirm =userconfirm+1;
			transaction.setUserConfirm(userconfirm);
			if(transaction.getProgress()==0) {
			transaction.setProgress(transaction.getProgress()+1);}
			transaction.setTotal(transaction.getTotal()+transaction.getMoney());
			transactionService.update(transaction);}
		return selectbyuserid(session, model);
	}
	
	
	@RequestMapping(value="/companyselect")
	public String companyselect(HttpSession session,Model model) {
		int companyid = (int)session.getAttribute("CompanyID");
		try {
		List<Transaction> list= transactionService.selectTransactionBycompanyID(companyid);
		model.addAttribute("companytrans", list);
		return "CompanyTransaction";
		}catch(Exception e) {
			e.printStackTrace();
			return "Error";
		}
	}
	
	
	@RequestMapping(value="/update/{traid}")
	public String update(@PathVariable("traid") int id,
			HttpSession session,Model model) {
		Integer type = (Integer) session.getAttribute("type");
//		if(type==null) return "Error";
		Transaction transaction = transactionService.selectTransactionByID(id);
		int currentprogress = transaction.getProgress();
		int userconfirm = transaction.getUserConfirm();
		if(type==(currentprogress+1)&&currentprogress<=userconfirm&&currentprogress<=7) {
			model.addAttribute("transselect", transaction);
			return "transactionPage";
		}
		return "Error";
	}
	@RequestMapping(value="/confirm/{traid}")
	public String confrim(
			@PathVariable("traid") int id,
			HttpSession session,Model model) {
		Integer type = (Integer) session.getAttribute("type");
		if(type==null) return "Error";
		if(type==0) {
			Transaction transaction = transactionService.selectTransactionByID(id);
			if(transaction.getProgress()<7&&transaction.getProgress()<transaction.getUserConfirm()) {
			transaction.setProgress(transaction.getProgress()+1);
			try {
				transactionService.update(transaction);
			}catch(Error e) {
				e.printStackTrace();
				return "Error";
			}
		}
		return companyselect(session, model);}
		else {
			return "Error";
		}
	}
	
	@RequestMapping(value="/updatecomplete",method=RequestMethod.POST)
	public String updatecomplete(@RequestParam("transID") int id,
			@RequestParam("userid") int userid,
			@RequestParam("companyID") int companyID,
			@RequestParam("money") double money,
			@RequestParam("description") String description,
			@RequestParam("progress") int progress,
			@RequestParam("userconfirm") int userconfirm,
			@RequestParam("total") double total,
			HttpSession session,
			Model model) {
		Transaction transaction = new Transaction(id, userid, companyID, money, description, progress, userconfirm, total);
//		transaction.setProgress(transaction.getProgress()+1);
		if(transactionService.update(transaction)) {
			return companyselect(session, model);
		}
		else {
		return "Error";
		}
	}
}
