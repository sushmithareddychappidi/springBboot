package com.py.LoginPage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/submiturl")
public class LoginController extends GenericServlet
{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		String mailPh = request.getParameter("value");
		String pw = request.getParameter("pw");
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String display="select * from customer_info where (C_Email_Id=? or C_Mn=?) and C_pwd=? ";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url);
			PreparedStatement ps=con.prepareStatement(display);
			ps.setString(1,mailPh);
			ps.setString(2,mailPh);
			ps.setString(3, pw);
			ResultSet res=ps.executeQuery();
			if(res.isBeforeFirst())
			{
				while(res.next())
				{
					RequestDispatcher rd = request.getRequestDispatcher("loginPage.html");
					rd.include(request, response);
					writer.println("<center><h1 style='color:green'>Login Successful</h1></center>");
				}
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("loginPage.html");
				rd.include(request, response);
				writer.println("<center><h1 style='color:red'>Login Failed</h1></center>");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
