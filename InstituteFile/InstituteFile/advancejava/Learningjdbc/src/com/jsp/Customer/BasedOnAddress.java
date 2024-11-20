package com.jsp.Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BasedOnAddress 
{
	public static void main(String[] args) 
	{
		String select="select * from customer_info where C_Address='jntu'";
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/teca57?user=root&password=12345");
			Statement st=con.createStatement();
			ResultSet res=st.executeQuery(select);
			if(res.isBeforeFirst())
			{
				while(res.next())
				{
					System.out.println("Customer Id: "+res.getInt("C_Id"));
					System.out.println("Customer Name: "+res.getString("C_Name"));
					System.out.println("Customer phno: "+res.getString("C_Mn"));
					System.out.println("Customer Email Id: "+res.getString("C_Email_Id"));
					System.out.println("Customer Password: "+res.getString("C_pwd"));
					System.out.println("Customer Address: "+res.getString("C_Address"));
					System.out.println("Customer Gender: "+res.getString("C_Gender"));
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
