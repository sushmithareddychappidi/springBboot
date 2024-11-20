package JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class EmployeeRegistration 
{
	public static void main(String[] args) 
	{
		String insert="insert into employee(e_name,e_salary,e_deptno) values('jasmi',100000,20)"	;
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/teca57?user=root&password=12345");
			Statement stm=con.createStatement();
			int result=stm.executeUpdate(insert);
			System.out.println("connection Established Successfully");
			if(result!=0)
			{
				System.out.println("Inserted Rows :"+result);
				System.out.println("Employee registration Successful....!");
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
