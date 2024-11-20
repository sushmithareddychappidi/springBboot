package com.py.Httpsession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/demourl")
public class demo extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session = request.getSession();
	String name = (String) session.getAttribute("studentname");
	String loc = (String) session.getAttribute("studentlocation");
	System.out.println(name);
	System.out.println(loc);
   }
}
