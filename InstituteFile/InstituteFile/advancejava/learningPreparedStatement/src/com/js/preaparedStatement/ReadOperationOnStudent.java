package com.js.preaparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ReadOperationOnStudent 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String select="select * from student1 where loc=?";
		try
		{
			Connection con=DriverManager.getConnection(url);
			PreparedStatement ps=con.prepareStatement(select);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Student Location");
			String loc=sc.next();
			ps.setString(1, loc);
			ResultSet rs=ps.executeQuery();
			if(rs.isBeforeFirst())
			{
				System.out.print("s_id ");
				System.out.print("s_name ");
				System.out.print("loc ");
				System.out.print("yop ");
				System.out.println();
				while(rs.next())
				{
//					System.out.print(rs.getInt("s_id"));
//					System.out.print(rs.getString("s_name"));
//					System.out.print(rs.getString("loc"));
//					System.out.print(rs.getString("yop"));
					System.out.print(rs.getInt(1));
					System.out.print(rs.getString(2));
					System.out.print(rs.getString(3));
					System.out.print(rs.getString(4));
					System.out.println();					
				}
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
