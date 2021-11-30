<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>paramForm.jsp</title>
</head>
<body>

뷰페이지성공
${memberVO.id } : ${memberVO.name } : ${memberVO.age }
<hr/><hr/>

<!-- 컨트롤러에서 login이라는 이름을 가진 session값을 찾기 -->
${sessionScope.login} 님 로그인  성공
${sessionScope.hello}하세요


</body>
</html>