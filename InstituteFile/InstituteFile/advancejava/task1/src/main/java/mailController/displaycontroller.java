package mailController;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/radiodisplayurl")
public class displaycontroller extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String designation =request.getParameter("desig");
	    System.out.println(designation);
		
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String select="select * from employeetask1 where Empdesignation=? ";
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(select);
			ps.setString(1, designation);
			ResultSet rs=ps.executeQuery();
			if(rs.isBeforeFirst())
			{
				writer.println("<center><table><tr>");
				writer.println("<th>Nmae</th>");
				writer.println("<th>Phno</th>");
				writer.println("<th>Mail</th>");
				writer.println("<th>Designation</th>");
				writer.println("<th>location</th>");
				writer.println("<th>gender</th>");
				writer.println("<th>password</th>");
				writer.println("</tr>");
				while(rs.next())
				{
					writer.println("<tr>");
					writer.println("<td>"+rs.getString(2)+"</td>");
					writer.println("<td>"+rs.getString(3)+"</td>");
					writer.println("<td>"+rs.getString(4)+"</td>");
					writer.println("<td>"+rs.getString(5)+"</td>");
					writer.println("<td>"+rs.getString(6)+"</td>");
					writer.println("<td>"+rs.getString(7)+"</td>");
					writer.println("<td>"+rs.getInt(8)+"</td>");
					writer.println("</tr>");
				}
			}
			else
			{
				RequestDispatcher rsd = request.getRequestDispatcher("dispalypage.jsp");
				rsd.include(request, response);
				writer.println("<center><h1>Display Failed....</h1></center>");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
