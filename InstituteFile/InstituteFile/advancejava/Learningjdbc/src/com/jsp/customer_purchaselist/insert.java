package com.jsp.customer_purchaselist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insert 
{
	public static void main(String[] args) 
	{
		String insert="insert into customer_purchase_list(P_namel, P_price, P_quantity, P_date, P_time, c_id) values('santoor',56,2,'2021-01-21','1:50:45',103)";
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/teca57?user=root&password=12345");
			Statement stm=con.createStatement();
			int res=stm.executeUpdate(insert);
			if(res!=0)
			{
				System.out.println(res);
				System.out.println("Product info Inserted Successfully");
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
