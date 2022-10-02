<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Products</title>
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
					<td>${product.id}</td>
					<td>${product.title}</td>
					<td>${product.price}</td>
					<td>${product.discount}</td>
					<td>${product.description}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
<body>
	<form method="POST"
		action="${pageContext.request.contextPath}/api/product">
		<table>
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
		</table>

		<p>
			<input type="submit" name="submit_btn" value="Add">
		</p>
	</form>
</body>
</html>