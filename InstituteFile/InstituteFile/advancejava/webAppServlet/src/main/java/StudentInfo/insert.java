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
@WebServlet("/inserturl")
public class insert extends GenericServlet
{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		int Id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String loc=request.getParameter("loc");
		String yop=request.getParameter("yop");
		
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String insert="insert into student1(s_id, s_name, loc, yop) values(?,?,?,?)";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url);
			PreparedStatement ps=con.prepareStatement(insert);
			ps.setInt(1, Id);
			ps.setString(2, name);
			ps.setString(3, loc);
			ps.setString(4, yop);
			
			int res=ps.executeUpdate();
			if(res>0)
			{
				writer.println("<center><h1 style='color:green'>Student Data Inserted Successfully</h1></center>");
			}
			else
			{
				System.out.println("Invalid Data");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
