<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- prefix = ���ξ� ���� // c : core -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	���ǹ� 
	-->
	<h1>���� ���� �־� ${param.num }</h1>
	<c:if test="${param.num % 2 == 0 }">
	¦��
	</c:if>
	
	<hr>
	
	<!-- if-else + switch-case ���� -->
	<c:choose>
		<c:when test="${param.num > 10 }">
			10 ���� ũ��
		</c:when>
		<c:when test="${param.num > 5 }">
			5 ~ 10 ����
		</c:when>
		<c:otherwise>
			������
		</c:otherwise>
	</c:choose>
		
		
	<%
	/* 	for (int i = 1; i <= 5; i += 2) {
			System.out.println(i);
	}*/	
	%>	
	<!-- �ݺ��� -->
	<c:forEach var="v" begin="1" end="${param.num }" step="2"> 
	<!-- ���������� var, �������� v , 1���� numũ�⸸ŭ 2�� Ŀ��-->
		<marquee>${v }</marquee>
	</c:forEach>
	
	<!-- �ڹ��� for-each -->	
	<c:forEach var="i" items="${ar }">
	<!-- items : �迭 ������ �� ��� -->
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
		����� : <%= result %>
	</c:catch>
		<br>
	<c:catch var="myExcept">
		<% int result = 100 / 0;%>
		����� : <%= result %>
	</c:catch>
	
	<c:if test="${myExcept != null }">
		���� �߻� : ${myExcept.message }
	</c:if>
	
	
	
		
</body>
</html>




























































































