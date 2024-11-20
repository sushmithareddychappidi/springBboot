package timesession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/registerEmplourllink")
public class EmployeeRegistrationController extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name=request.getParameter("name");
		String location=request.getParameter("loc");
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");

		HttpSession session=request.getSession();
		String em=(String) session.getAttribute("employeemail");
		//int pass=(int) Integer.parseInt((String) session.getAttribute("employeepassword"));
		Integer pass=(Integer) session.getAttribute("employeepassword");

		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String delete="delete from employee1 where empname is null";

		if(em!=null && pass!=0)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url);
				PreparedStatement ps=con.prepareStatement("update employee1 set  empname=?, emploc=? where  empmailid=? and emppassword=?");
				ps.setString(1, name);
				ps.setString(2,location);
				ps.setString(3, em);
				ps.setInt(4, pass);
				int insertrows=ps.executeUpdate();
				if(insertrows!=0)
				{
					RequestDispatcher rd = request.getRequestDispatcher("register.html");
					rd.include(request,response);
					writer.println("<center><h1 style='color:green'>Registration Successful....</h1></center>");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
			else
			{
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection(url);
					Statement stm=con.createStatement();
					int deletedrows=stm.executeUpdate(delete);
					if(deletedrows!=0)
					{
						RequestDispatcher rd = request.getRequestDispatcher("register.html");
						rd.include(request,response);
						writer.println("<center><h1 style='color:red'>Session time out...</h1></center>");
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
