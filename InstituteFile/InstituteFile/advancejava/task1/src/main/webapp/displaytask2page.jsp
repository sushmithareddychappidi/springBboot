<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <center>
     <%
     String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
     String select="select * from products";
     
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection  connection=DriverManager.getConnection(url);
     Statement stm= connection.createStatement();
     ResultSet rs=stm.executeQuery(select);
     if(rs.isBeforeFirst())
     {%>
     <label>E-Commerce</label>
     <label>cart</label>
     <label>name:
    	 <table>
    	 <tr>
    	 <th>Product Name</th>
    	 <th>Product Price </th>
    	 <th>Product Brand</th>
    	 <th>Product Review</th>
    	 <th>Product Category</th>
    	 </tr>
    	 <%
    	 while(rs.next())
    	 {%>
    	 <tr>
    	 <form action="cartandbuyurl">
    	<td><input value="<%= rs.getString(2) %>" name="name"></td>
    	<td> <input value="<%= rs.getDouble(3) %>" name="price"></td>
    	<td><input value="<%= rs.getString(4) %>" name="brand"></td>
    	<td><input value="<%= rs.getString(5) %>" name="review"></td>
    	<td><input value="<%= rs.getString(6) %>" name="cate"></td>
    	<td><input value="<%= rs.getInt(1) %>" name="id" hidden="true"><button>cart</button></td>
    	<td><button>buy</button></td>
    	</form>
    	</tr>
    	</table>
    		 
    	 <%}
    	  %>
     <% }
  
       
       %>
</center>
</body>
</html>