package timesession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginEmplourllink")
public class EmployeeLoginController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mailId=request.getParameter("mail");
		int password=Integer.parseInt(request.getParameter("pw"));
		
		HttpSession session = request.getSession();
		session.setAttribute("employeemail", mailId);
		session.setAttribute("employeepassword", password);
		session.setMaxInactiveInterval(20);
		
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String insert="insert into employee1 (empmailid, emppassword) values(?,?)";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url);
			PreparedStatement ps=con.prepareStatement(insert);
			ps.setString(1, mailId);
			ps.setInt(2, password);
			int insertedrows=ps.executeUpdate();
			if(insertedrows!=0)
			{
				RequestDispatcher rd = request.getRequestDispatcher("register.html");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("loginpage.html");
				rd.include(request, response);				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
