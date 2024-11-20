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
@WebServlet("/deleteemployeeurl")
public class deleteEmployeeinfo extends GenericServlet
{
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String delete="delete from employee where e_id=?";
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url);
			PreparedStatement ps=con.prepareStatement(delete);
			
			ps.setInt(1, id);
			int res=ps.executeUpdate();
			if(res>0)
			{
				writer.println("<center><h1 style='color:red'>Employee Data Deleted Successfully</h1></center>");
			}
			else
			{
				writer.println("Invalid Data");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
