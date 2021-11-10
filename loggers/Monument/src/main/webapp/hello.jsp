<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>${msg}</h2>
	<h2>after data save</h2>
	<p>${data.name}</p>
	<table>
	<c:forEach var="item" items="${list}">
	<tr>
	<td>${item.name}</td>
	<td>${item.area}</td>
	<td>${item.style}</td>
	<td>${item.year}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>