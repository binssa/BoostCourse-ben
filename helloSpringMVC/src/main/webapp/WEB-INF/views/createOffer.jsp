<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet"/> 
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
This is Create Offer Page

	<form method="get" action="${pageContext.request.contextPath}/doCreate">
		<table class="formtable">
			<tr><td class="label">Name:</td><td><input name="name" type="text"></td></tr>
			<tr><td class="label">Email:</td><td><input name="email" type="text"></td></tr>
			<tr><td class="label">text:</td><td><textarea name="text" rows="5" cols="16"></textarea></td></tr>
			<tr><td></td><td><input name="Create Offer" type="submit"></td></tr>
		</table>
	</form>
</body>
</html>