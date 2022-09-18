<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Корзина продуктов</title>
    </head>
    <body>
    <form method="POST">

	<p class="select">
		<!--declaring classes to group properties-->
		Product list <br> <br> <br> Data foreach product
	<table>
		<tr>
			<th>Product id,#</th>
			<th>Product title</th>
			<th>Product price,$</th>
			<th>Product discount,$</th>
			<th>Product description</th>
		</tr>
		<c:forEach items="${productData}" var="product">
			<tr>
				<td><c:out value="${product.getId()}" /></td>
				<td><c:out value="${product.getTitle()}" /></td>
				<td><c:out value="${product.getPrice()}" /></td>
				<td><c:out value="${product.getDiscount()}" /></td>
				<td><c:out value="${product.getDescription()}" /></td>
			</tr>
		</c:forEach>
	</table>
		 </form>
</body>
</html>