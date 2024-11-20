<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1>Welcome to java server page</h1>
<form>
<input placeholder="Enter Number" name="num"><br>
<input type="submit">
</center>
</form>

<% String num=request.getParameter("num");
if(num!=null)
{%>
 <center><h1><%= num %></h1></center>
<% }
%>
</body>
</html>