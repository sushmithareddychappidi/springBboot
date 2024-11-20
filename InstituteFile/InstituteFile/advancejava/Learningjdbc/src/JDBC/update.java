package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class update 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/teca57";
		String update="update student1 set yop='2020-01-12' where s_name='ashwini'" ;
		try
		{
			
			Connection con=DriverManager.getConnection(url, "root", "12345");
			Statement stm=con.createStatement();
			int insertedrows=stm.executeUpdate(update);
			System.out.println(insertedrows);
			System.out.println("Connection established Successfully");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
