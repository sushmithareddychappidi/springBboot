package task2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cartandbuyurl")
public class cartcontroller extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String pri=request.getParameter("price");
		String brand = request.getParameter("brand");
		String review = request.getParameter("review");
		String category=request.getParameter("cate");
		
		
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String insert="insert into cart ";
		
	}
}
