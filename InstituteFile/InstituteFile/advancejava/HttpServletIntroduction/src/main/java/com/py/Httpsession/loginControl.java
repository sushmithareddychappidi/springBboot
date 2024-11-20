package com.py.Httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginformurllink")
public class loginControl extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String mailId=request.getParameter("mail");
		String pw=request.getParameter("pw");
		String name = (String) session.getAttribute("Sname");
		String loc = (String) session.getAttribute("Slocation");
		String gen = (String) session.getAttribute("SGender");
		String sal = (String) session.getAttribute("SSalary");
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		
		RequestDispatcher rd = request.getRequestDispatcher("loginForm.html");
		rd.include(request, response);
		writer.println("<center>");
		writer.println("<h1>Name :</h1>" +name);
		writer.println("<h1>Location :</h1>"+loc);
		writer.println("<h1>Gender :</h1>" +gen);
		writer.println("<h1>Salary :</h1>"+sal);
		writer.println("<h1>SEmail :</h1>"+mailId);
		writer.println("<h1>SPassword :</h1>"+pw);
		writer.println("</center>");
		
		
	}
}
