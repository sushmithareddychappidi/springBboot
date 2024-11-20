package com.jsp.Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDetailsOnPass 
{
	public static void main(String[] args)
	{
		String delete ="delete from customer_info  where C_pwd='111@'";
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/teca57?user=root&password=12345");
			Statement stm=con.createStatement();
			int res=stm.executeUpdate(delete);
			if(res!=0)
			{
				System.out.println(res);
				System.out.println("Customer Details Deleted Successfully");
			}
			else
			{
				System.out.println(res);
				System.out.println("Invalid Data");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
