package com.example.course;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class courseController 
{
	@RequestMapping("/course")
	public String dispaly()
	{
		return "course.jsp";
	}

}
