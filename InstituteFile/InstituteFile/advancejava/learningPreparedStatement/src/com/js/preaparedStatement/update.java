package com.js.preaparedStatement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class update 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String update="update student1 set loc=?,s_id=? where s_name=?";
		Scanner sc=new Scanner(System.in);
		try
		{
			Connection con=DriverManager.getConnection(url);
			java.sql.PreparedStatement ps=con.prepareStatement(update);
			
			System.out.println("Enter the Student Location");
			String loc=sc.next();
			System.out.println("Enter the Student Id");
			int id=sc.nextInt();
			System.out.println("Enter the Student Name");
			String name=sc.next();
			ps.setString(1,loc);
			ps.setInt(2,id );
			ps.setString(3, name);
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
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
}
