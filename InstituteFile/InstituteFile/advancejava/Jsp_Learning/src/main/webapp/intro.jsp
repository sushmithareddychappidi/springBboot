<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int i=13 ;
public String EvenRodd()
{
	  if(i%2==0)
	  {
		  return "even number";
	  }
	  else
	  {
		  return "Odd Number";
	  }
}%>
<center><h1>
<%=i %>
<%=EvenRodd() %>
</h1></center>


</body>
</html>