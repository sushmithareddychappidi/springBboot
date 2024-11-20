package com.py.inserDataThroughWebpage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/deleteCustInfourl")
public class deleteCustomerinfo extends GenericServlet
{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		int Id=Integer.parseInt(request.getParameter("id"));
		
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String delete="delete from customer_info where C_Id=?";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url);
			PreparedStatement ps=con.prepareStatement(delete);
			ps.setInt(1,Id);
			int res=ps.executeUpdate();
			if(res>0)
			{
				System.out.println("Customer Data Inserted Successfully");
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
