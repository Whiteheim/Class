<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- prefix = 접두어 지정 // c : core -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	조건문 
	-->
	<h1>숫자 여기 있어 ${param.num }</h1>
	<c:if test="${param.num % 2 == 0 }">
	짝수
	</c:if>
	
	<hr>
	
	<!-- if-else + switch-case 느낌 -->
	<c:choose>
		<c:when test="${param.num > 10 }">
			10 보다 크다
		</c:when>
		<c:when test="${param.num > 5 }">
			5 ~ 10 사이
		</c:when>
		<c:otherwise>
			나머지
		</c:otherwise>
	</c:choose>
		
		
	<%
	/* 	for (int i = 1; i <= 5; i += 2) {
			System.out.println(i);
	}*/	
	%>	
	<!-- 반복문 -->
	<c:forEach var="v" begin="1" end="${param.num }" step="2"> 
	<!-- 변수선언은 var, 변수명은 v , 1부터 num크기만큼 2씩 커짐-->
		<marquee>${v }</marquee>
	</c:forEach>
	
	<!-- 자바의 for-each -->	
	<c:forEach var="i" items="${ar }">
	<!-- items : 배열 가져올 때 사용 -->
		<marquee>${i }</marquee>
	</c:forEach>	
	
	<hr>
	<c:forEach var="sth" items="${al }">
		${sth.name } - ${sth.age } <br>
	</c:forEach>	
		
	<hr>
	<!-- try/catch -->
	<c:catch var="myExcept">
		<% int result = 100 / 2;%>
		계산결과 : <%= result %>
	</c:catch>
		<br>
	<c:catch var="myExcept">
		<% int result = 100 / 0;%>
		계산결과 : <%= result %>
	</c:catch>
	
	<c:if test="${myExcept != null }">
		에러 발생 : ${myExcept.message }
	</c:if>
	
	
	
		
</body>
</html>




























































































