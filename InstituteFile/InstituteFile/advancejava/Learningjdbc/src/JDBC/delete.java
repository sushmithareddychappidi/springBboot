package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class delete 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/teca57";
		String delete="delete from student1  where s_name='jasmi'" ;
		try
		{
			
			Connection con=DriverManager.getConnection(url, "root", "12345");
			Statement stm=con.createStatement();
			int insertedrows=stm.executeUpdate(delete);
			System.out.println(insertedrows);
			System.out.println("Connection established Successfully");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
