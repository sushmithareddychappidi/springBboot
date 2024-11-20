<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
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
<form>
<input placeholder="Enter the Mail" name="mail"><br>
<input placeholder="Enter the Id" name="id"><br>
<input type="submit">

<%
String mail=request.getParameter("mail");
String id=request.getParameter("id");

if(id!=null)
{
	String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
	String update="update emp set mail=? where id=?";

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url);
	PreparedStatement ps=con.prepareStatement(update);
	ps.setString(1,mail);
	ps.setString(2,id);
	int updatedrows=ps.executeUpdate();
	if(updatedrows!=0)
	{%>
	  <center>Updated Successfully...</center>
	<%}
	else
	{%>
		<center>Data not updated</center>
	<%}
}
%>
</form></center>
</body>
</html>