<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="n" scope="request" value="10"/>
<!-- 동일한 기능 --> 
<%-- <%
	request.setAttribute("n", 10);
%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${n == 0 }">
	n은 0입니다.
</c:if>
<c:if test="${n == 10 }">
	n은 10입니다.
</c:if>
</body>
</html>