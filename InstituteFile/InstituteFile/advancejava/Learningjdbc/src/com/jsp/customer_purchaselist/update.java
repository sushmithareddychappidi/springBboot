package com.jsp.customer_purchaselist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class update 
{
	public static void main(String[] args) 
	{
		String update ="update customer_purchase_list set P_quantity=5 where PId=2";
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/teca57?user=root&password=12345");
			Statement stm=con.createStatement();
			int res=stm.executeUpdate(update);
			if(res!=0)
			{
				System.out.println(res);
				System.out.println("Customer Details Updated Successfully");
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
