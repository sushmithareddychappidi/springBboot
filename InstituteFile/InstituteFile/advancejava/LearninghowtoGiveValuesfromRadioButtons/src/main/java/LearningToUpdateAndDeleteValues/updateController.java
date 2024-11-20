package LearningToUpdateAndDeleteValues;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateandeleteurl")
public class updateController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String loc = request.getParameter("loc");
		String yop = request.getParameter("yop");
		Date yopassing=Date.valueOf(yop);
		int id =Integer.parseInt(request.getParameter("id"));
		//System.out.println(id);
		
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String update="update student1 set  s_name=?, loc=?, yop=? where s_id=? ";
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(update);
			ps.setString(1,name);
			ps.setString(2, loc);
			ps.setDate(3, yopassing);
			ps.setInt(4, id);
			int updatedrows=ps.executeUpdate();
			if(updatedrows!=0)
			{
				RequestDispatcher rsd = request.getRequestDispatcher("update.jsp");
				rsd.include(request, response);
				writer.println("<center><h1>Updated Successfully....</h1></center>");
			}
			else
			{
				RequestDispatcher rsd = request.getRequestDispatcher("update.jsp");
				rsd.include(request, response);
				writer.println("<center><h1>Updatation Failed....</h1></center>");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
