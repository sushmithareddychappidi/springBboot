<%@ page import ="org.jps.mvc.model.Usertable" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%-- <%@ page isELIgnored="false" %>  --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Page</title>
</head>
<body>
    <h1 style='color:orange'>Hi Hello...!11</h1></br>
   <%
       Usertable u=(Usertable)request.getAttribute("user");
    %>  
    <h2 style="color:orange">{u}</h2></br> --%>
    <a href="./login">Login</a>
</body>
</html>