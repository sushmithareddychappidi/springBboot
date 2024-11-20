package com.py.LoginPage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/registrationurl")
public class RegistrationController extends GenericServlet
{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String ph = request.getParameter("ph");
		String mailId = request.getParameter("mail");
		String password = request.getParameter("pw");
		String add = request.getParameter("address");
		String gen = request.getParameter("gender");
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String insert="insert into customer_info(C_Name, C_Mn, C_Email_Id, C_pwd, C_Address, C_Gender) values(?,?,?,?,?,?)";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url);
			PreparedStatement ps=con.prepareStatement(insert);
			ps.setString(1,name );
			ps.setString(2, ph);
			ps.setString(3,mailId );
			ps.setString(4,password );
			ps.setString(5, add);
			ps.setString(6,gen );
			int insertedRows=ps.executeUpdate();
			if(insertedRows!=0)
			{
//				RequestDispatcher rd = request.getRequestDispatcher("registrationpage.html");
//				rd.include(request, response);
				RequestDispatcher rd = request.getRequestDispatcher("loginPage.html");
				rd.forward(request, response);

				writer.println("<h1>Registration Succesfull</h1>");				
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("registrationpage.html");
				rd.include(request, response);
				writer.println("<h1>Registration Failed</h1>");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
