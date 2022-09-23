<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- core가 있어야 fmt(formating)을 쓸 수 있는 것은 아님 -->
<!-- core / fmt 둘 다 자주 사용하는 기능이라 함께 불러옴 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- fmt : 문자열 / 날짜 형태 formating -->
	<fmt:formatNumber value="${a }" type="number"/> <!-- 숫자 -->
	<hr>
	<fmt:formatNumber value="${a }" type="currency" currencySymbol="$"/> <!-- 통화 / 기본값은 원화-->
	<hr>
	<fmt:formatNumber value="${b }" type="percent"/> <!-- 퍼센트 (소수점 반올림)-->
	<hr>
	<fmt:formatNumber value="${c }" pattern="#.00"/> <!-- 패턴 지정 (소수점 둘째자리 까지 반올림) -->
	<hr>
	<!-- 
		Date 속성
		: type = "date / time / both"
			1. date
				dateStyle = "short / long"
			2. time
				timeStyle = "short / long"
			3. both
				dateStyle = "short / long"
				timeStyle = "short / long"
				
	 -->
	<fmt:formatDate value="${d }" type="both" dateStyle="long" timeStyle="short"/> <br>	
	<!-- 패턴 -->
	<fmt:formatDate value="${d }" pattern="yyyy-MM-dd E a hh"/> <br>
	
	
	
</body>
</html>














