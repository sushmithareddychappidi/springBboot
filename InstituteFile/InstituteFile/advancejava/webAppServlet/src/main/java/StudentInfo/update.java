package StudentInfo;

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
@WebServlet("/updateurl")
public class update extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String loc=request.getParameter("loc");
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String update="update student1 set s_name=?,loc=? where s_id=4";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url);
			PreparedStatement ps=con.prepareStatement(update);
			ps.setString(1, name);
			ps.setString(2, loc);
			int result=ps.executeUpdate();
			if(result!=0)
			{
				writer.println("<center><h1 style='color:green'>Student Data Updated Successfully</h1></center>");
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
