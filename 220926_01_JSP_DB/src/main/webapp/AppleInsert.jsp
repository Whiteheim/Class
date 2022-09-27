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
	<form action="InsertController" method="post" name="applelist">
		지역<input name="location"> <br>
		품명<input name="name"> <br>
		색<input name="color"> <br>
		가격<input name="price"> <br>
		맛<input name="flavor"> <br>
		
		<button>등록</button>
	</form>
	</div>
	
			
</body>
</html>