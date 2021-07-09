<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="score" value="69"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
	<c:when test="${score >= 90 }">
		Grade A
	</c:when>
	<c:when test="${score >= 80 }">
		Grade B
	</c:when>
	<c:when test="${score >= 70 }">
		Grade c
	</c:when>  
	<c:otherwise>
		Grade D
	</c:otherwise>
</c:choose>
</body>
</html>