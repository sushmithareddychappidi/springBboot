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
@WebServlet("/updatedinfourlofCustomer")
public class updateCustometinfo extends GenericServlet
{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		String mail=request.getParameter("mailId");
		String psw=request.getParameter("password");
		//String name=request.getParameter("cname");
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String update="update customer_info set C_Email_Id=?,C_pwd=? where C_Name='venky'";
	    try
	    {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	Connection con=DriverManager.getConnection(url);
	    	PreparedStatement ps=con.prepareStatement(update);
	    	ps.setString(1,mail);
	    	ps.setString(2,psw);
	    	int res=ps.executeUpdate();
			if(res>0)
			{
				System.out.println("Data Updated Successfully");
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
