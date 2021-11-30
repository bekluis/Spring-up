<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>userListResult.jsp</title>
</head>
<body>

<h3>멤버리스트</h3>

<table border='2'>
	<tr>
		<td>이름</td><td>아이디</td><td>나이</td>
	</tr>
	
	
	<c:forEach var='vo' items='${memberVOList.list}'>
		<c:if test="${vo.state }">
			<tr>
				<td>${vo.name }</td>
				<td>${vo.id }</td>
				<td>${vo.age }</td>
				<td></td>
			</tr>
		</c:if>
	</c:forEach>

</table>
</body>
</html>