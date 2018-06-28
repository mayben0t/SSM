package com.wx.ssm.controller;

import java.util.List;
import java.util.Map;

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

import com.wx.ssm.pojo.Companyuser;
import com.wx.ssm.pojo.Work;
import com.wx.ssm.service.CompanyuserService;

@Controller
@RequestMapping(value = "/companyuser")
public class CompanyuserController {
	private static final Log log = LogFactory.getLog(CompanyuserController.class);
	@Autowired
	CompanyuserService companyuserService;

	/*
	 * @RequestMapping(value="insert",method=RequestMethod.POST) public String
	 * userInsert() { return null; }
	 */
	
	@RequestMapping(value="/companyselectAll/{CompanyID}",method=RequestMethod.GET)			//zz公司对业务的查询，只显示自家公司的业务
	public String getUserByCompanyID(@PathVariable int CompanyID,HttpSession session) {
//		System.out.println("进入到公司业务中");
//		System.out.println(CompanyID);
		System.out.println("qqqqqqqqwwwwwwwwwwwwwwwwwwweeeeeeeeeeeeeeeeeeeeee");
		List<Companyuser> getUserlist = null;
		getUserlist=companyuserService.getUserByCompanyID(CompanyID);
//		if(getUserlist!=null) { System.out.println("取到值了");}
//		else { System.out.println("getWorklist为null");}
		session.setAttribute("CompanyUser", getUserlist);
		return "CompanyEmployee";
	}
	
	
	@RequestMapping("/insert")
	public String userInsert(HttpSession session) { // 因为是员工插入功能 所以返回的页面只能是公司的user新增界面
		if(session.getAttribute("type")==null) 
		{
		return "CompanyEmployeeInsert";
		}
		else {
			return "Error";
		}
	}

	/*
	 * @RequestMapping("/update") public String userUpdate() { return
	 * "CompanyuserInsert"; }
	 */

	@RequestMapping(value = "/insertcomplete", method = RequestMethod.POST)
	public String save(
			@RequestParam("companyidinsert") Integer companyID,
			@RequestParam("companyusertypeinsert") int type,
			@RequestParam("companyusernameinsert") String username,
			@RequestParam("companyuserpasswordinsert") String password, 
			@RequestParam("companyusertelinsert") String tel,
			@RequestParam("companyuserincomeinsert") int income,
			HttpSession session) { // 这是插入业务完成的处理方法 因为只有公司才有插入业务的权限 所以插入完成后 所返回的页面也就必须是CompanyService页面
//		if (ID == null) {
		if(session.getAttribute("type")==null) 
		{
			Companyuser companyuser = new Companyuser(companyID, type, username, password, tel, income);
			if (companyuserService.insert(companyuser)) {
				return getUserByCompanyID(companyID, session);
			} else {
				return "Error";
			}
		}
		else {
			return "Error";
		}
	}
//		} else {
//			Companyuser companyuser = new Companyuser(ID, companyID, type, username, password, tel, income);
//			if (companyuserService.update(companyuser)) {
//				return "CompanyEmployee";
//			} else {
//				return "Error";
//			}
//		}
//	}

	@RequestMapping(value = "/delete/{ID}")
	public String userDelete(@PathVariable("ID") Integer id,
			HttpSession session) {
		if(session.getAttribute("type")==null) 
		{
		if (companyuserService.delete(id)) {
			int Companyid=(int) session.getAttribute("CompanyID");
			return getUserByCompanyID(Companyid, session);
		} else {
			return "Error";
		}}
		else {
			return "Error";
		}
	}

	@RequestMapping(value="/update/{id}")
	public String workUpdate(@PathVariable int id,Model model,HttpSession session) {			//这个是第一次点击业务更新的处理方法，与插入用的是同一个页面，不同的是要在表单里赋值，其值就是根据id查找出来的值
//		log.debug(id+"    zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
		if(session.getAttribute("type")==null) 
		{
		Companyuser updateuser=companyuserService.selectCompanyuserByID(id);
		model.addAttribute("updateuser",updateuser);
		return "CompanyEmployeeInsert";						//记得得在前端jsp页面中用jstl/el语句进行数据的填充
		}
		else {
			return "Error";
		}
	}

	@RequestMapping(value="/updateComplete/{id}",method=RequestMethod.POST)
	public String workUpdateComplete(@PathVariable("id") int id,
			@RequestParam("companyid") Integer companyID,
			@RequestParam("companyusertype") int type,
			@RequestParam("companyusername") String username,
			@RequestParam("companyuserpassword") String password, 
			@RequestParam("companyusertel") String tel,
			@RequestParam("companyuserincome") int income,
			HttpSession session) {
//		System.out.println("qqqqqqqqqqqqqqqqqq进入到updatecomplete方法中");
		Companyuser companyuser = new Companyuser(id,companyID, type, username, password, tel, income);
		if (companyuserService.update(companyuser)) {
			return getUserByCompanyID(companyID, session);
		} else {
			return "Error";
		}
	}
	
	
	/*
	 * 公司对员工的查询
	 */
	@RequestMapping(value="/userselectAll") 
	public String userSelectAll(Model model) { 
	  List<Companyuser> userAlllist=companyuserService.getAll();
//	  if(userAlllist==null) return "CompanyEmployee";
	  for(Companyuser companyuser:userAlllist) {
	  model.addAttribute("companyuserAll",userAlllist);
	  }	 
	  return "CompanyEmployee";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST) 
		public String login(@RequestParam("companyID") int companyid,
				@RequestParam("username") String username,
				@RequestParam("password") String password,
				@RequestParam("type") int type,
				HttpSession session){
			Map<String,Object> tempmap=companyuserService.validate(companyid,username,password,type);
//			Map<String,String> map2=tempmap
			log.error(tempmap.get("status"));
//			System.out.println(((String)tempmap.get("status")).equals("1"));
//			System.out.println(tempmap.get("status").toString().equals("1"));
			if(tempmap!=null&&tempmap.get("status").toString().equals("1")) 
			{
				System.out.println("进入到if中");
//				HttpSession session=request.getSession();
				Map<String,String> map2=(Map<String, String>) tempmap.get("loginMap");
//				session.setAttribute("ID", map2.get("ID"));
//				System.out.println();
				log.debug("*************************************");
				log.debug(map2.get("ID"));
				log.debug(map2.get("Userid"));
				session.setAttribute("CompanyID",map2.get("companyID"));
				session.setAttribute("username",map2.get("username"));
				session.setAttribute("type",map2.get("type"));
//				session.setAttribute("CompanyTel",map2.get("tel"));
//				session.setAttribute("CompanyID",companyid);
				return "CompanyBase";
			}
			return "CompanyLogin";
		}

	/*
	 * @RequestMapping(value="/updateComplete",method=RequestMethod.POST) public
	 * String userUpdateComplete(@RequestParam("ID") int id,
	 * 
	 * @RequestParam("CompanyID") int companyID,
	 * 
	 * @RequestParam("companyUserid") String companyUserid,
	 * 
	 * @RequestParam("Description") String description) { Work work=new
	 * Work(companyID, companyUserid, description); if(workService.update(work)) {
	 * return "CompanyService"; }else { return "Error"; } }
	 * 
	 * @RequestMapping(value="/companyselectAll/{CompanyID}",method=RequestMethod.
	 * GET) //公司对业务的查询，只显示自家公司的业务 public String getWorkByCompanyID(@PathVariable int
	 * CompanyID,Model model) { System.out.println("进入到公司业务中");
	 * System.out.println(CompanyID); List<Work> getWorklist = null;
	 * getWorklist=workService.getWork(CompanyID); if(getWorklist!=null) {
	 * System.out.println("取到值了");} else { System.out.println("getWorklist为null");}
	 * model.addAttribute("CompanyWork", getWorklist); return "CompanyService"; }
	 * 
	 * 
	 * // @RequestMapping(value="/userselectAll") //用户对业务的查询 // public ModelAndView
	 * workSelectAll(ModelAndView model) { // List<Work>
	 * workAlllist=workService.getAll(); //
	 * model.addObject("workAlllist",workAlllist); // model.setViewName("service");
	 * // return model; // }
	 * 
	 * @RequestMapping(value="/userselectAll") //用户对业务的查询 public String
	 * workSelectAll(Model model) { List<Work> workAlllist=workService.getAll();
	 * 
	 * System.out.println("********************"+workAlllist.get(0).getCompanyID());
	 * for(Work work:workAlllist) {
	 * log.debug(work.getID()+" "+work.getCompanyID()+" "+work.getCompanyUserid()
	 * +" "+work.getDescription()); } model.addAttribute("workAlllist",workAlllist);
	 * // model.setViewName("service"); return "service"; }
	 */

}
