package employeeInfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/updateemployeeurl")
public class updateEmployeeinfo extends GenericServlet
{
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		String deptno=request.getParameter("deptno");
		String sal=request.getParameter("salary");
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String update="update employee set e_deptno=?,e_salary=? where e_name='jasmi'";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url);
			PreparedStatement ps=con.prepareStatement(update);
			ps.setString(1, deptno);
			ps.setString(2, sal);
			int result=ps.executeUpdate();
			if(result!=0)
			{
				writer.println("<center><h1 style='color:green'>Employee Data Updated Successfully</h1></center>");
			}
			else
			{
				writer.println("<center><h1 style='color:red'>Invalid Data</h1></center>");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
