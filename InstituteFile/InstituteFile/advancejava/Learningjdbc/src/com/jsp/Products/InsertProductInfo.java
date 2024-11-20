package com.jsp.Products;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.Statement;

public class InsertProductInfo
{
	public static void main(String[] args) 
	{
		String insert="insert into products(P_Name, P_Price, P_Quantity, P_Brand, P_Review, P_Category) values('washing machine',40000,2,'washing','good','cleaning')";
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
