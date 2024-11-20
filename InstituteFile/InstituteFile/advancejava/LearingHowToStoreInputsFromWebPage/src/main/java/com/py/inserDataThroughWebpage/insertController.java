package com.py.inserDataThroughWebpage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/customerinfourl")
public class insertController extends GenericServlet
{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
	{
		String name=request.getParameter("name");
		String phoneno=request.getParameter("ph");
		String mailId=request.getParameter("mail");
		String password=request.getParameter("pw");
		String address=request.getParameter("address");
		String gen=request.getParameter("genders");
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String insert="insert into customer_info (C_Name, C_Mn, C_Email_Id, C_pwd, C_Address, C_Gender) values(?,?,?,?,?,?)";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url);
			java.sql.PreparedStatement ps=con.prepareStatement(insert);

			ps.setString(1, name);
			ps.setString(2, phoneno);
			ps.setString(3, mailId);
			ps.setString(4, password);
			ps.setString(5, address);
			ps.setString(6,gen );
			int res=ps.executeUpdate();
			if(res>0)
			{
				writer.println("<center><h1 style='color:blue'>Customer Data Inserted Successfully</h1></center>");
			}
			else
			{
				System.out.println("Invalid Data");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	
	}

}
