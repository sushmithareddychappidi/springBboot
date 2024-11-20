package mailController;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/mailidurl")
public class mailCon extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String mailid = request.getParameter("mail");

		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");

		//HttpSession session = request.getSession();
		//session.setAttribute("employeemail", mailid);
		//session.setMaxInactiveInterval(20);
		
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String display="select * from employeetask1 where Empemailid=?";
	
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url);
			PreparedStatement stm=con.prepareStatement(display);
			stm.setString(1, mailid);
			ResultSet rs=stm.executeQuery();
			if(rs.isBeforeFirst())
			{
				while(rs.next())
				{
					RequestDispatcher rsd = request.getRequestDispatcher("password.html");
				    rsd.forward(request, response);
				}
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("password.html");
				rd.include(request,response);
			    writer.println("<center><h1 style='color:green'> mail not found  ....</h1></center>");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
//		if(mailid!=null)
//		{
//			RequestDispatcher rd = request.getRequestDispatcher("password.html");
//			rd.include(request,response);
//			writer.println("<center><h1 style='color:green'> Login Successful.....</h1></center>");
//		}
//		else
//		{
//			RequestDispatcher rd = request.getRequestDispatcher("password.html");
//			rd.include(request,response);
//			writer.println("<center><h1 style='color:red'>Session Time Out.....</h1></center>");
//		}
	}
}



