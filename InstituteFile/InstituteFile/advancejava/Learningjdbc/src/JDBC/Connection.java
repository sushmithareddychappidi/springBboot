package JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306";
		try
		{
			DriverManager.getConnection(url, "root", "12345");
			System.out.println("connection established successfully");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}