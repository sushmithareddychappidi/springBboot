<%@page import="java.sql.PreparedStatement"%>
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
<form>
<input placeholder="Enter id " name="id"><br>
<input placeholder="Enter Mail" name="mail"><br>
<input placeholder="Enter password" name="pw"><br>
<input type="submit">


<%
   String id=request.getParameter("id");
   String mail=request.getParameter("mail");
   String pw=request.getParameter("pw");
   
  if(id!=null)
  {
	  String url="jdbc:mysql://localhost:3306/teca57?user=root&password=12345";
	   String delete="delete from emp where id=? and (mail=? or password=?)";
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection con=DriverManager.getConnection(url);
	   PreparedStatement ps=con.prepareStatement(delete);
	   ps.setString(1,id);
	   ps.setString(2,mail);
	   ps.setString(3,pw);
	   int deletedrows=ps.executeUpdate();
	   if(deletedrows!=0)
	   {%>
	     <center>Data Deleted Successfully....</center>	   
	   <%}
	   else
	   {%>
		   <center>Data Deletion Failed</center>
	   <%}
  }
  %>
  </form></center>
</body>
</html>