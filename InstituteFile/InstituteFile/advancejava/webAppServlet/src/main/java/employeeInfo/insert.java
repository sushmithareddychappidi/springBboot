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
@WebServlet("/insertemployeeurl")
public class insert extends GenericServlet
{
public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		int Id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String sal=request.getParameter("salary");
		String deptno=request.getParameter("deptno");
		
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String insert="insert into employee(e_id, e_name, e_salary, e_deptno) values(?,?,?,?)";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url);
			PreparedStatement ps=con.prepareStatement(insert);
			ps.setInt(1, Id);
			ps.setString(2, name);
			ps.setString(3, sal);
			ps.setString(4, deptno);
			
			int res=ps.executeUpdate();
			if(res>0)
			{
				writer.println("<center><h1 style='color:green'>Employee Data Inserted Successfully</h1></center>");
			}
			else
			{
				writer.println("Data not inserted");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
