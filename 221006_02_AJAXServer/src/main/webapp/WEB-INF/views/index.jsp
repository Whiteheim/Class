<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		MyBatis 활용
		전체 과일 데이터를
		이름 - 가격 형태로 출력
	 -->
	 <c:forEach var="f" items="${fruits }">
	 	${f.f_name } - 
	 	<fmt:formatNumber type="currency" value="${f.f_price }"></fmt:formatNumber> <br>
	 </c:forEach>
	 
	 
	 <!-- 
	 	DB 테이블 입력 -> jsp 데이터 입력 -> xml에 query문 작성(mapper) -> java와 연결 (interface)
	 	DAO에서 request에 등록 -> Controller에서 흐름 조절 -> 출력
	  -->
	 
	 
</body>
</html>