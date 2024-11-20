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

	<%
String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
String display="select * from customer_info";
Connection con=DriverManager.getConnection(url);
Statement stm=con.createStatement();
ResultSet rs=stm.executeQuery(display);
if(rs.isBeforeFirst())
{%>

	<center>
		<table>
			<tr>
				<th>CustId</th>
				<th>CustName</th>
				<th>CustMobileNo</th>
				<th>CustMailId</th>
				<th>CustPassword</th>
				<th>CustAddress</th>
				<th>CustGender</th>
			</tr>

		 
<% 		while(rs.next()) 
		{%>
	
			<tr> 
				<td><%=rs.getInt(1)%></td>
				<td><%=rs.getString(2)%></td>
				<td><%=rs.getString(3)%></td>
				<td><%=rs.getString(4)%></td>
				<td><%=rs.getString(5)%></td>
				<td><%=rs.getString(6)%></td>
				<td><%=rs.getString(7)%></td>
			</tr>
		
	<% } %>
	</table>
	</center>
	<%}
	
	else
	{%>
	<center>No data found</center>
	<%}
	%>
</body>
</html>