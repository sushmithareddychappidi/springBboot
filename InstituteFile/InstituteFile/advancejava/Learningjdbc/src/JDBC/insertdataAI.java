package JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class insertdataAI 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/teca57";
		String insert="insert into student1(s_name, loc, yop) values('jasmi','banglore','22-05-25'),('sai','banglore','24-05-06'),('siri','banglore','21-05-25')";
		try
		{
			
			Connection con=DriverManager.getConnection(url, "root", "12345");
			Statement stm=con.createStatement();
			int insertedrows=stm.executeUpdate(insert);
			System.out.println(insertedrows);
			System.out.println("Connection established Successfully");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
