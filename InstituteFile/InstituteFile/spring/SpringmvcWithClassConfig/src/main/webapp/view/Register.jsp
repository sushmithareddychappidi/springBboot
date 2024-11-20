<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
    <center>
    <form action="./admission">
        <input type="text" placeholder="Enter Student id" name="sid"><br>
        <input type="text" placeholder="Enter Student " name="sname"><br>
        <input type="text" placeholder="Enter Student id" name="sbranch"><br>
        <input type="text" placeholder="Enter Student id" name="smail"><br>
        <input type="text" placeholder="Enter Student id" name="sper"><br>
        <input type="text" placeholder="Enter Student id" name="smobile"><br>
       Student Joining Date: <input type="Date"  name="sjDate"><br>
       <input type="submit" value="Register">
    </form>
    </center><br>
    <%  String temp=(String)request.getAttribute("status");
    if(temp!=null)
    {
    boolean status=Boolean.parseBoolean(temp);
    		if(status==false)
    %>
    <h2 style="color:red">${msg}</h2>
   <%}%>
</body>
</html>