<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Sign In</title>
</head>
<body>
	<h1>Sign In</h1>
	<c:forEach var="error" items="${errorMessages}">
		<span style='color: red; font-weight: bold'><c:out
				value="${error}" /></span>
		<br />
	</c:forEach>
	<form method="POST"
		action="${pageContext.request.contextPath}/api/login">
		<label for="login">Login</label><br /> <input type="text" id="login"
			name="login" /> <br /> <label for="password">Password</label> <br />
		<input type="password" name="password" /> <br /> <input
			type="submit" value="submit">
	</form>

	<br>

	<a href="${pageContext.request.contextPath}/api/user">Sign Up</a>
	<br>
</body>
</html>