package task2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/task2loginurl")
public class taskeloginpage extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mailorph=request.getParameter("mailorpass");
		int pass=Integer.parseInt(request.getParameter("pass"));
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		
	
		
		
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String select="select * from userinfoproduct where (usermail=? or userphnum=?) and userpass=?";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(select);
			ps.setString(1,mailorph);
			ps.setString(2,mailorph);
			ps.setInt(3, pass);
			ResultSet rs = ps.executeQuery();
			if(rs.isBeforeFirst())
			{
				while(rs.next())
				{
					RequestDispatcher rsd = request.getRequestDispatcher("displaytask2page.jsp");
					rsd.forward(request, response);	
					writer.println("<center><h1 style='color:green'>Login success....</center></h1>");
				}
			}
			else
			{
				RequestDispatcher rsd = request.getRequestDispatcher("logintask2.html");
				rsd.include(request, response);	
				writer.println("<center><h1 style='color:red'>Login Failed</center></h1>");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
