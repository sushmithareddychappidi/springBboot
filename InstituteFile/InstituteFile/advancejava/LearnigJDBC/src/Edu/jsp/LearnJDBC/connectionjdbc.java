package Edu.jsp.LearnJDBC;

import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionjdbc 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306";
		try
		{
			DriverManager.getConnection(url, "root", "12345");
			System.out.println("connected Successfully");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
