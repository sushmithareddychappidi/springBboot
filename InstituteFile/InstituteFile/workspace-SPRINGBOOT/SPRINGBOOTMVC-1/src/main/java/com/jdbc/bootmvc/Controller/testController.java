package com.jdbc.bootmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController 
{

	@GetMapping("/showHome")
	public String display()
	{
		return "home";
	}
}
