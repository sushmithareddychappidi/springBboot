package com.js.preaparedStatement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatement 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String insert="insert into student1 (s_name, loc, yop) values(?,?,?)";
		Scanner sc=new Scanner(System.in);
		try
		{
			Connection con=DriverManager.getConnection(url);
			PreparedStatement ps=con.prepareStatement(insert);
			System.out.println("Enter the Student Name");
			String name=sc.next();
			
			System.out.println("Enter the Student Location");
			String loc=sc.next();
			System.out.println("Enter the Student Yop");
			String yop=sc.next();
			Date yop1=Date.valueOf(yop);
			ps.setString(1,name );
			ps.setString(2, loc);
			ps.setDate(3, yop1);
			int res=ps.executeUpdate();
			if(res>0)
			{
				System.out.println("Data Inserted Successfully");
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
