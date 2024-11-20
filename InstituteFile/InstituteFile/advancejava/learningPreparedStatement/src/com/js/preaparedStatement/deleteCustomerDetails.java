package com.js.preaparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class deleteCustomerDetails 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String delete="delete from customer_info where (C_Email_Id=? or C_Mn=?) and C_pwd=?";
		try
		{
			Connection con=DriverManager.getConnection(url);
			PreparedStatement ps=con.prepareStatement(delete);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Customer Email Address: ");
			String email=sc.next();
			System.out.println("Entyer Customer Mobile no: ");
			String ph=sc.next();
			System.out.println("Entyer Customer Password: ");
			String pw=sc.next();
			ps.setString(1, email);
			ps.setString(2, ph);
			ps.setString(3, pw);
			int res=ps.executeUpdate();
			if(res>0)
			{
				System.out.println("Customer Details Deleted Successfully");
			}
			else
			{
				System.out.println("Details Not deleted");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
