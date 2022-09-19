<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Список Продуктов</title>
</head>
<body>

	<p class="select">
		<!--declaring classes to group properties-->
	<form method="POST"
		action="${pageContext.request.contextPath}/ProductFormServlet">
		<p class="select">
			<!--declaring classes to group properties-->
			<br> Список продуктов <br>
		<table>
			<tr>
				<th>id</th>
				<th>Название</th>
				<th>Цена, руб</th>
				<th>Скидка, %</th>
				<th>Описание</th>
			</tr>
			<tr>
				<td><label> <textarea name="id"></textarea>
				</label></td>
				<td><label> <textarea name="Название"></textarea>
				</label></td>
				<td><label> <textarea name="Цена"></textarea>
				</label></td>
				<td><label> <textarea name="Скидка"></textarea>
				</label></td>
				<td><label> <textarea name="Описание"></textarea>
				</label></td>
			</tr>

		</table>

		<p>
			<input type="submit" name="submit_btn" value="Добавить">
		</p>
	</form>
</body>
</html>