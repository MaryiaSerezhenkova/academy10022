<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>SignUp</title>
</head>
<body>
	<h1>SignUp</h1>
	<c:choose>
		<c:when test="${errorMessage is null}">
  </c:when>
		<c:otherwise>
	 <c:out value = "${errorMessage}"/>		
		</c:otherwise>
	</c:choose>
	<form method="POST"
			action="${pageContext.request.contextPath}/api/user">

			Login:<br> <label> <input type="text" name="login"></input>
			</label> <br> <br> <br> Password:<br> <label> <input
				type="password" name="password"></input>
			</label> <br> <br> <br> First name:<br> <label> <input
				type="text" name="firstName"></input>
			</label> <br> <br> <br> Last name:<br> <label> <input
				type="text" name="lastName"></input>
			</label> <br> <br> <br> Date of birth:<br> <label>
				<input type="date" name="birthDate">
			</label> <br> <br> <br> <input type="submit" value="submit">
		</form>

		<br>

		<a href="${pageContext.request.contextPath}${signInLink}">Sign in</a>
		<br>
</body>
</html>
