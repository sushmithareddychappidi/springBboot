package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updateEmployeeSalary 
{
	public static void main(String[] args) 
	{
		String update="update employee set e_salary=120000 where e_id=3";
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/teca57?user=root&password=12345");
			Statement stm=con.createStatement();
			int result=stm.executeUpdate(update);
			System.out.println("connection Established Successfully");
			if(result!=0)
			{
				System.out.println("Inserted Rows :"+result);
				System.out.println("Employee Salary Updated Successfully....!");
			}
			else
			{
				System.out.println(result);
				System.out.println("Employee Not Found");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
