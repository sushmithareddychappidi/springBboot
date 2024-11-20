package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.DAO.UserDaoHelper;
import com.jsp.DAO.userInterface;
import com.jsp.model.BankStatement;
import com.jsp.model.BankUserInfo;

@WebServlet("/debiturl")
public class debitController extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int acc_num=Integer.parseInt(request.getParameter("accnum"));
		int password=Integer.parseInt(request.getParameter("password"));
		double amount=Double.parseDouble(request.getParameter("amount"));
		HttpSession session=request.getSession();
		BankUserInfo userinfo=(BankUserInfo) session.getAttribute("user");
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		
		userInterface Userdao = UserDaoHelper.userdao();
	
		if(userinfo.getUseraccountnum()==acc_num)
		{
			if(userinfo.getUserpassword()==password)
			{
				if(userinfo.getUseraccountbalance()>amount)
				{
					double databaseamount=userinfo.getUseraccountbalance()-amount;
					BankStatement bankStatement=new BankStatement();
					bankStatement.setBalanceamount(databaseamount);
					bankStatement.setDateoftransaction(Date.valueOf(LocalDate.now()));
					bankStatement.setTimeoftransaction(Time.valueOf(LocalTime.now()));
					bankStatement.setTransactionamount(amount);
					bankStatement.setUseraccpountnum(acc_num);
					bankStatement.setUsername(userinfo.getUsername());
					if(Userdao.debit(password, bankStatement))
					{
						RequestDispatcher rs=request.getRequestDispatcher("debit.jsp");
						rs.include(request, response);
						writer.println("<center><h1 style='colr:green'>Transaction Successfully</h1></center>");
					}
					else
					{
						RequestDispatcher rs=request.getRequestDispatcher("debit.jsp");
						rs.include(request, response);
						writer.println("<center><h1 style='colr:red'>Transaction Failed..</h1></center>");
					}
				}
				else
				{
					RequestDispatcher rs=request.getRequestDispatcher("debit.jsp");
					rs.include(request, response);
					writer.println("<center><h1 style='colr:red'>Insufficient Balane.. Please Provide Valid Amount</h1></center>");
				}
			}
			else
			{
				RequestDispatcher rs=request.getRequestDispatcher("debit.jsp");
				rs.include(request, response);
				writer.println("<center><h1 style='colr:red'>Invalid Password.. Please Provide Valid Password</h1></center>");
			}
			
		}
		else
		{
			RequestDispatcher rs=request.getRequestDispatcher("debit.jsp");
			rs.include(request, response);
			writer.println("<center><h1 style='colr:red'>Invalid AccountNumber.. Please Provide Valid AccountNum</h1></center>");
		}
		
	}
}
