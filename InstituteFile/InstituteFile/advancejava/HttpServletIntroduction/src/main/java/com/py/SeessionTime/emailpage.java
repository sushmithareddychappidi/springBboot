package com.py.SeessionTime;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/emailpageurllink")
public class emailpage extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mail=request.getParameter("mailID");		
		HttpSession session = request.getSession();
		session.setAttribute("gmailId",mail);
		session.setMaxInactiveInterval(10);
		RequestDispatcher rd = request.getRequestDispatcher("otpForm.html");
		rd.forward(request,response);
	}
}
