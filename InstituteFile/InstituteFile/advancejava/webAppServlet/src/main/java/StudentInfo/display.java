package StudentInfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/displayStudentInformationurl")
public class display extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String display="select * from student1";
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url);
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery(display);
			if(rs.isBeforeFirst())
			{
				writer.println("<center><table><tr>");
				writer.println("<th>StudentId</th>");
				writer.println("<th>StudentName</th>");
				writer.println("<th>StudentLocation</th>");
				writer.println("<th>StudentYOP</th>");
				writer.println("</tr>");
				while(rs.next())
				{
					writer.println("<tr>");
					writer.println("<td>"+rs.getInt(1)+"</td>");
					writer.println("<td>"+rs.getString(2)+"</td>");
					writer.println("<td>"+rs.getString(3)+"</td>");
					writer.println("<td>"+rs.getString(4)+"</td>");
					writer.println("</tr>");
				}
				writer.println("</table></center>");
					
			}
			else
			{
				writer.println("Data Not Found");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
