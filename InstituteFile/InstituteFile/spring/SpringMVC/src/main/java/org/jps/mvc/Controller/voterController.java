package org.jps.mvc.Controller;

import org.jps.mvc.model.Usertable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class voterController 
{
	@RequestMapping("display")
	//@ResponseBody
	public String display(Usertable u,Model model)
	{
		model.addAttribute("user", u);
		//return "welcome";
		//return "<center><h1>Hi Hello!</h1></br>"+u.toString()+"</br><a href='./login'>login</a></center>";
		return "display";
	}
	@RequestMapping("info")
	public String getInfo()
	{
		return "info";
	}
	@RequestMapping("login")
	public String getLoginPage()
	{
		return "login";
	}
	@RequestMapping("logininfo")
	@ResponseBody
	public String getLoginInfo(String username,String password)
	{
		return "<center><h3 style='color: green'>"+username+" " +password+"</h3></center>";
	}
}
