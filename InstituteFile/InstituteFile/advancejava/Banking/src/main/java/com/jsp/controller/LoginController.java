package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.DAO.UserDaoHelper;
import com.jsp.DAO.userInterface;
import com.jsp.model.BankUserInfo;

@WebServlet("/LoginContollerlink")
public class LoginController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String emailorphno = request.getParameter("emailorphno");
	    int password = Integer.parseInt(request.getParameter("pw"));
	    userInterface userdao = UserDaoHelper.userdao();
	    BankUserInfo userinfo= userdao.login(emailorphno,password);
	    HttpSession session=request.getSession();
	    session.setAttribute("user", userinfo);
	    System.out.println(userinfo);
	    PrintWriter writer=response.getWriter();
	    response.setContentType("text/html");
	    if(userinfo!=null)
	    {
	    	//RequestDispatcher rsd=request.getRequestDispatcher("Login.jsp");
	    	//rsd.include(request, response);
	    	//writer.println("<center><h1 style=color:green>Login Successful...</h1></centyer>");
	    	RequestDispatcher rsd=request.getRequestDispatcher("operation.jsp");
	        rsd.forward(request, response);
	    }
	    else
	    {
	    	RequestDispatcher rsd=request.getRequestDispatcher("Login.jsp");
	    	rsd.include(request, response);
	    	writer.println(" <center><h1 style=color:green>Login Failed...</h1></centyer>");
	    }
	    
	}

}
