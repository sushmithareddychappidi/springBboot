<%@page import="java.sql.PreparedStatement"%>
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
<form>
<input placeholder="Enter the name" name="name"><br>
<input placeholder="Enter the Location" name="loc"><br>
<input placeholder="Enter the Email" name="mail"><br>
<input placeholder="Enter the Password" name="pw"><br>
<input type="submit">
</form></center>

<%
String name=request.getParameter("name");
String loc=request.getParameter("loc");
String mailId=request.getParameter("mail");
String password=request.getParameter("pw");



	if(name!=null)
	{
		String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
		String insert="insert into emp( name, loc, mail, password) values (?,?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url);
		PreparedStatement ps=con.prepareStatement(insert);
		ps.setString(1,name);
		ps.setString(2,loc);
		ps.setString(3,mailId);
		ps.setString(4,password);
		int insertedrows=ps.executeUpdate();
		if(insertedrows!=0)
		{%>
			<center>Registration Successfull.......</center>
		<%}
		else
		{%>
			<center>Registration Failed</center>
		<%}
	}

	%>


</body>
</html>