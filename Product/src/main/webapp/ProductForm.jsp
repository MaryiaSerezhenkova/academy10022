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
 
        <p class="select">
            <!--declaring classes to group properties-->
            Список продуктов <br>
        <table>
            <tr>
                <th>id</th>
                <th>Название</th>
                <th>Цена, руб</th>
                <th>Скидка, %</th>
                <th>Описание</th>
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
        <form method="get" name="add">
            action="${pageContext.request.contextPath}/ProductServlet">
           <p> <button type='submit'>Отправить</button></p>
        </form>
</body>
</html>