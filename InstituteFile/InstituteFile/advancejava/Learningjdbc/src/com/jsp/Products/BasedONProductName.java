package com.jsp.Products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BasedONProductName 
{
	public static void main(String[] args) 
	{
		//String select="select * from products where P_Name like 'd%'";
		//String select="select * from products where P_Price>35000";
		String select="select * from products where P_Quantity<5";
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/teca57?user=root&password=12345");
			Statement st=con.createStatement();
			ResultSet res=st.executeQuery(select);
			if(res.isBeforeFirst())
			{
				while(res.next())
				{
					System.out.println("Product Id: "+res.getInt("P_Id"));
					System.out.println("Product Name: "+res.getString("P_Name"));
					System.out.println("Product price: "+res.getString("P_Price"));
					System.out.println("Product quantity: "+res.getString("P_Quantity"));
					System.out.println("Product Brand: "+res.getString("P_Brand"));
					System.out.println("Product Review: "+res.getString("P_Review"));
					System.out.println("Product category: "+res.getString("P_Category"));
					System.out.println("__________________________");
				}
			}
			else
			{
				System.out.println("data not found");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
