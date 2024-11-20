package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.DAO.UserDaoHelper;
import com.jsp.DAO.userDaoImple;
import com.jsp.DAO.userInterface;
import com.jsp.model.BankUserInfo;

@WebServlet("/registerControllerlink")
public class RegistrationController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      String name = request.getParameter("name");
	      String phno = request.getParameter("phno");
	      String mailId = request.getParameter("email");
	      String address = request.getParameter("add");
	      String gender = request.getParameter("gen");
	      String dateOfbirth = request.getParameter("dob");
	      Date date=Date.valueOf(dateOfbirth);
	      
	      String typeofacc = request.getParameter("toa");
	      
	      PrintWriter writer=response.getWriter();
	      response.setContentType("text/html");
	      
	      BankUserInfo userinfo=new BankUserInfo();
	      userinfo.setUsername(name);
	      userinfo.setUserMobileNo(phno);
	      userinfo.setUserMailId(mailId);
	      userinfo.setUserAddress(address);
	      userinfo.setUserGender(gender);
	      userinfo.setUserDateOfBirth(date);	      
	      userinfo.setTypeofaccount(typeofacc);
	      userInterface userinterface=UserDaoHelper.userdao();
	      
	      
//	      HttpSession session=request.getSession();
//	      session.setAttribute("username", name);
//	      session.setAttribute("accnum", session);
//	      session.setAttribute("balance", session);
	      
	      if(userinterface.registration(userinfo))
	      {
	    	  RequestDispatcher rsd = request.getRequestDispatcher("Login.jsp");
	    	  rsd.forward(request, response);
	      }
	      else
	      {
	    	  RequestDispatcher rsd = request.getRequestDispatcher("Registration.jsp");
	    	  rsd.include(request, response);
	    	  writer.println("Registration Failed");
	      }
	}
}
