<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
     String select="select * from student1";
     
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection  connection=DriverManager.getConnection(url);
     Statement stm= connection.createStatement();
     ResultSet rs=stm.executeQuery(select);
     if(rs.isBeforeFirst())
     {%>
    	 <table>
    	 <tr>
    	 <th>Student Name</th>
    	 <th>Student Location</th>
    	 <th>Student Year Of Passing</th>
    	 </tr>
    	 <%
    	 while(rs.next())
    	 {%>
    	 <tr>
    	 <form action="updateandeleteurl">
    	<td><input value="<%= rs.getString(2) %>" name="name"></td>
    	<td> <input value="<%= rs.getString(3) %>" name="loc"></td>
    	<td><input value="<%= rs.getString(4) %>" name="yop"></td>
    	<td><input value="<%= rs.getInt(1) %>" name="id" hidden="false"><button>update</button></td>
    	<td><button>delete</button></td>
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