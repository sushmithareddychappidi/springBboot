package com.py.Httpsession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/registFormurllink")
public class registController extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name=request.getParameter("name");
		String location=request.getParameter("loc");
		String gender=request.getParameter("gen");
		String salary=request.getParameter("sal");
		HttpSession session = request.getSession();
		session.setAttribute("Sname", name);
		session.setAttribute("Slocation", location);
		session.setAttribute("SGender", gender);
		session.setAttribute("SSalary", salary);
		RequestDispatcher rd = request.getRequestDispatcher("loginForm.html");
		rd.forward(request, response);
	}
}
