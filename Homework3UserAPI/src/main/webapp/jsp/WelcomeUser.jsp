<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>WelcomeUser</title>
</head>
p>Приветствуем тебя
<c:choose>
	<c:when
		test="${pageContext.session != null && sessionScope.user != null}">
                  	    ${sessionScope.user.fio}
                  	</c:when>
	<c:otherwise>
                  		Странник
                  	</c:otherwise>
</c:choose>
</p>
<p>Ты можешь:</p>
<c:if
	test="${sessionScope.user != null && 'ADMIN'.equals(sessionScope.user.role.name()) }">
	<p>
		<input type="button"
			onclick="location.href='${pageContext.request.contextPath}/ui/admin/statistics';"
			value="Просмотреть статистику сервера" />
	</p>
</c:if>
<c:choose>
	<c:when test="${sessionScope.user == null}">
		<p>
			<input type="button"
				onclick="location.href='${pageContext.request.contextPath}/ui/signUp';"
				value="Зарегистрироваться" />
		</p>
		<p>
			<input type="button"
				onclick="location.href='${pageContext.request.contextPath}/ui/signIn';"
				value="Войти" />
		</p>
	</c:when>
	<c:otherwise>
		<p>
			<input type="button"
				onclick="location.href='${pageContext.request.contextPath}/ui/user/chats';"
				value="Просмотреть свои сообщения" />
		</p>
		<p>
			<input type="button"
				onclick="location.href='${pageContext.request.contextPath}/ui/user/message';"
				value="Отправить сообщения" />
		</p>
		<p>
			<input type="button"
				onclick="location.href='${pageContext.request.contextPath}/ui/logout';"
				value="Выйти" />
		</p>
	</c:otherwise>
</c:choose>
</body>
</html>