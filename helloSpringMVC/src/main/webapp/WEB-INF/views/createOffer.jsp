<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet"/> 
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.error {
	font-size:small;
	color:red;
	margin-left:10px;
}
</style>
</head>
<body>
This is Create Offer Page

	<form:form method="get" action="${pageContext.request.contextPath}/doCreate" modelAttribute="offer">
		<table class="formtable">
			<tr>
				<td class="label">Name:</td>
				<td>
					<form:input path="name" type="text"/><br/>
					<form:errors cssClass="error" path="name"></form:errors>
				</td>
			</tr>
			<tr>
				<td class="label">Email:</td>
				<td>
					<form:input path="email" type="text"/><br/>
					<form:errors cssClass="error" path="email"></form:errors>
				</td>
			</tr>
			<tr>
				<td class="label">text:</td>
				<td>
					<form:textarea path="text" rows="5" cols="16"></form:textarea><br/>
					<form:errors cssClass="error" path="text"></form:errors>
				</td>
			</tr>
			<tr><td></td><td><input name="Create Offer" type="submit"></td></tr>
		</table>
	</form:form>
</body>
</html>