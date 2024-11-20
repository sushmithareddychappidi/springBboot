package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeReadOpe 
{
	public static void main(String[] args)
	{
		String select ="select * from employee where e_deptno=1000";
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/teca57?user=root&password=12345");
			Statement st=con.createStatement();
			ResultSet res=st.executeQuery(select);
			if(res.isBeforeFirst())
			{
				while(res.next())
				{
					System.out.println("Employee Id: "+res.getInt("e_id"));
					System.out.println("Employee Name: "+res.getString("e_name"));
					System.out.println("Employee Salary: "+res.getDouble("e_salary"));
					System.out.println("Employee Deptno: "+res.getInt("e_deptno"));
				}
			}
			else
			{
				System.out.println("data not present");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
