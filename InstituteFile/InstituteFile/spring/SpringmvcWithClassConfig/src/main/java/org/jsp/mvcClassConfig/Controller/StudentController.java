package org.jsp.mvcClassConfig.Controller;

import java.sql.Date;

import org.jsp.mvcClassConfig.Model.student1;
import org.jsp.mvcClassConfig.Service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController 
{
	@Autowired
	private IStudentService service;
	@RequestMapping("login")
	public String showLogin()
	{
		return "Login";
	}
	@RequestMapping("loginCheck")
	public String checkLogin(Integer sid,Model model)
	{
		String msg = service.selectStudent(sid);
		model.addAttribute("msg", msg);
		return "Login";
	}
	@RequestMapping("admission")
	public String takeAdmission(student1 std,@RequestParam("sjDate")String date,Model model)
	{
		std.setSjDate(Date.valueOf(date));
		String msg=service.addStudent(std);
		if(msg!=null)
		{
			return "redirect:/login";
		}
		else
		{
			model.addAttribute("msg", msg);
			model.addAttribute("status", "false");
		}
		return "Register";
	}
	
}
