package com.jdbc.bootmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController 
{
	@GetMapping("/showHome")
	public String getDisplay()
	{
		return "homes";
	}
}
