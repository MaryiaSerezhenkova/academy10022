<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Список продуктов</title>
</head>
<body>

	<div>
		<table>
		<thead>
			<tr>
				<th>id</th>
				<th>title</th>
				<th>price</th>
				<th>discount, %</th>
				<th>description</th>
			</tr>
			</thead>
			<c:forEach items="${products}" var="product">
				<tr>
					<td>< value="${product.id}" /></td>
					<td>< value="${product.title}" /></td>
					<td>< value="${product.price()}" /></td>
					<td>< value="${product.discount()}" /></td>
					<td>< value="${product.description()}" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<form method="POST" action="${pageContext.request.contextPath}/api/product">
	<div>
		<label> title</label> <input type="text" name="title" />
	</div>
	<div>
		<label> price</label> <input type="text" name="price" />
	</div>
	<div>
		<label> discount</label> <input type="text" name="discount" />
	</div>
	<div>
		<label> description</label> <input type="text" name="description" />
	</div>

	<p>
		<input type="submit" name="submit_btn" value="Add">
	</p>
	</form>
</body>
</html>