package JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class executeUPdate
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String insert="insert into teca57.student1 values(7,'sushmitha','gurugaon','2023-04-21')";
		try
		{
			Connection connection=DriverManager.getConnection(url);
			Statement statement=connection.createStatement();
			int insertedrows=statement.executeUpdate(insert);
			System.out.println(insertedrows);
			System.out.println("Connection established Successfully");
			statement.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}