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
<h1>Armstrong Number</h1>
<form>
<input placeholder="Enter Number" name="num"><br>
<input type="submit">
<%String number=request.getParameter("num"); %>
<%
public int armstrongnum()
{%>
	<%! int n=Integer.parseInt(number);%>
	 <% int temp=n;%>
	<%int temp1=n;%>
	<% int count=0;%>
	<% int sum=0;%>
	<% while(n!=0)
	{
		count++;
		 n=n/10;%>
	}
		while(temp!=0)
		{%>
		int product=1;
		int digit=temp%10;
		for(int i=1;i<=count;i++)
		{
			product*=digit;
		}
		sum+=product;
		temp=temp/10;
		}
		if(sum==temp1)
			System.out.println(temp1+"is armstrong number");
		else
			System.out.println(temp1+"is not armstrong number");
}
%>
</form>
</center>
</body>
</html>