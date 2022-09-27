<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<div class="content">
			<a href="InsertController" >등록</a> 
			<br>
			<c:forEach var="apple" items="${apples }">
				<p onclick="goAppleDetail('${apple.a_location }')"> <!-- 클릭하면 함수를 통해 이동 -->
					${apple.a_location }</p>
					<p><fmt:formatNumber value="${apple.a_price }"	type="number"/></p>
			</c:forEach>
				<br>
			<p align="center">  
				<c:forEach var="p" begin="1" end="${pageCount }">
					<a href="ApplePageController?p=${p }">${p }</a>
				</c:forEach>
			</p>
		</div>
					
</body>
</html>