<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>re / request.jsp</title>
</head>
<body>

re/request.do 요청에 의한 뷰페이지입니다
<hr/>

<h3>파라메터로 데이타 받을 때</h3>
아이디 : ${param.id}<br/>
이름 : ${param.name}<br/>
나이 : ${param.age}<br/>

<hr/>


<!-- class명과 똑같고 첫글자 소문자 -->
<h3>VO 객체의 데이타 받을 때</h3>
아이디 : ${memberVO.id}<br/>
이름 : ${memberVO.name}<br/>
나이 : ${memberVO.age}<br/>



</body>
</html>