<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <form action="./loginCheck">
			<input type="text" placeholder="Student ID : " name="sid"><br><br>
			<input type="text" placeholder="Student NAME : " name="s"><br><br>
			<input type="submit" value="Login"><br><br>	
			<a href="./register">New Student?</a>		
		</form>
		<br><br>
		<h2 style="color: red;">${msg}</h2>
</body>
</html>