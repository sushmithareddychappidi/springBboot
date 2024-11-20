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
  <form action="radiodisplayurl">
  <input type="radio" name="desig"  value="tester">Tester<br>
  <input type="radio" name="desig" value="developer">developer<br>
  </form>
  <%
     String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
     String select="select * from employeetask1 ";
     
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection  connection=DriverManager.getConnection(url);
     Statement stm= connection.createStatement();
     ResultSet rs=stm.executeQuery(select);
     if(rs.isBeforeFirst())
     {%>
    	 <table>
    	 <tr>
    	 <th>Employee Name</th>
    	 <th>Employee Ph</th>
    	  <th>Employee Mail</th>
    	  <th>Employee Designation</th>
    	 <th>Employee Location</th>
    	  <th>Employee Gender</th>
    	 <th>Employee Password</th> 
    	 </tr>
    	 <%
    	 while(rs.next())
    	 {%>
    	 <tr>
    	<td><input value="<%= rs.getString(2) %>" name="name"></td>
    	<td> <input value="<%= rs.getString(3) %>" name="ph"></td>
    	<td><input value="<%= rs.getString(4) %>" name="mail"></td>
    	<td><input value="<%= rs.getString(5) %>" name="desi"></td>
    	<td><input value="<%= rs.getString(6) %>" name="loc"></td>
    	<td><input value="<%= rs.getString(7) %>" name="gen"></td>
    	<td><input value="<%= rs.getString(8) %>" name="pw"></td>
    	</tr>
    	</table>
    		 
    	 <%}
    	  %>
     <% }
  
       
       %>
   </center>
</body>
</html>