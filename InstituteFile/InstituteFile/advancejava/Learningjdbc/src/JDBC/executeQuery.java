package JDBC;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class executeQuery 
{
	public static void main(String[] args) 
	{
		String select="select * from employee where e_deptno=10";
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/teca57?user=root&password=12345");
			Statement stm=con.createStatement();
		     ResultSet res=stm.executeQuery(select);
		     while(res.next())
		     {
		    	 //System.out.println("Employee Record Found");
		    	 System.out.println("Employee Id: "+res.getInt("e_id"));
		    	 System.out.println("Employee Name: "+res.getString("e_name"));
		    	 System.out.println("Employee Salary: "+res.getDouble("e_salary"));
		    	 System.out.println("Employee Deptno: "+res.getInt("e_deptno"));
		     }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
