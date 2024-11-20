package com.py.HTMLInputs;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Htmlformurl")
public class htmlInputs extends GenericServlet
{

	@Override
	public void service(ServletRequest Request, ServletResponse Response) throws ServletException, IOException
	{
		String name=Request.getParameter("name");
		String skill=Request.getParameter("skills");
		int salary=Integer.parseInt(Request.getParameter("sal"));
		System.out.println(name);
		System.out.println(skill);
		System.out.println(salary);
	}

}
