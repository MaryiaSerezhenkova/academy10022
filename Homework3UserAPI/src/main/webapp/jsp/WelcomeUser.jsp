<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>WelcomeUser</title>
</head>
<body>
	<%
	String info = request.getParameter("firstName");
	out.println("Hello from MainPage" );
	%>
</body>
</html>