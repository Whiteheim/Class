<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/index.css">
<script type="text/javascript" src="resources/js/index.js"></script>
</head>
<body>
	View (V) -
		JSP 		: .html or .jsp 혼용
		Spring 		: .jsp
		Spring Boot	: .html 
		
		Spring 내에서 사용하는 자원파일들 (css, js, 그림파일, ... etc)
			=> webapp/resources / ...(경로) 에 저장
		<hr>
		input 3개 -> 이름, x, y
		button 하나
		
		<form action="calculate.do" method="post">
		이름 : <input name="n"> <br>
		x 	 : <input name="x"> <br>
		y	 : <input name="y"> <br>
		<button>보단</button>
		</form>
		<hr>
		<c:if test="${r != null }">계산결과 : ${r }</c:if>
</body>
</html>























































