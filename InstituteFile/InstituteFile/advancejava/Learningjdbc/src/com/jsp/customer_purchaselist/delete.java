package com.jsp.customer_purchaselist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class delete 
{
	public static void main(String[] args)
	{
		String delete ="delete from customer_purchase_list  where c_id=103";
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/teca57?user=root&password=12345");
			Statement stm=con.createStatement();
			int res=stm.executeUpdate(delete);
			if(res!=0)
			{
				System.out.println(res);
				System.out.println(" purchased data Deleted Successfully");
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
