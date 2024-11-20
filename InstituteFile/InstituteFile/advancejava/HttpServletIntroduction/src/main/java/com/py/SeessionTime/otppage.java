package com.py.SeessionTime;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/otppageurllink")
public class otppage extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int otp=Integer.parseInt(request.getParameter("otp"));
		HttpSession session = request.getSession();
		String email_id = (String) session.getAttribute("gmailId");
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		
		
		if(email_id!=null)
		{
			RequestDispatcher rd = request.getRequestDispatcher("otpForm.html");
			rd.include(request,response);
			writer.println("<center><h1 style='color:green'>Successful.....</h1></center>");
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("otpForm.html");
			rd.include(request,response);
			writer.println("<center><h1 style='color:red'>Session Time Out.....</h1></center>");
		}
	}
}
