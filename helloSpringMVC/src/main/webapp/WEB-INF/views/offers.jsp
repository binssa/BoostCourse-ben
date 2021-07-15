<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This is offers Page</h1>
<br>
	<c:forEach var="offer" items="${offers}">
		<p> <c:out value="${offer }"/></p>
	</c:forEach>
</body>
</html>