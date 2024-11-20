package com.py.Httpsession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sampleurl")
public class sample extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String loc = request.getParameter("loc");
		HttpSession session = request.getSession();
		session.setAttribute("studentname", name);
		session.setAttribute("studentlocation", loc);
		RequestDispatcher rd = request.getRequestDispatcher("second.html");
		rd.forward(request, response);
	}
}
