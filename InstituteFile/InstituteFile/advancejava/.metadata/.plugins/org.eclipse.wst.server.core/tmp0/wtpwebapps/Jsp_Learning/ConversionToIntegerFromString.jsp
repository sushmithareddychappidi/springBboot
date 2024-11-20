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
<h1>Welcome to Java Server Page</h1>
<form>
<input placeholder="Enter the Number" name="num"><br>
<input type="submit">
</form>
</center>
<%String number=request.getParameter("num");
if(number!=null)
{
	int num=Integer.parseInt(number);
	if(num%2==0)
	{%>
	  <center><h1>Even Number</h1></center>		
	<%}
	else
	{%>
		<center><h1>Odd Number</h1></center>
	<%}
}
%>
</body>
</html>