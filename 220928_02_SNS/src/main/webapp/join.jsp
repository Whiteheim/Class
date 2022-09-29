<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="JoinController" method="post" enctype="multipart/form-data" name="signupForm">
		ID <input name="m_id"> <br>
		PW <input type="password" name="m_pw"> <br>
		PW확인 <input type="password" name="m_pwCheck"> <br>
		PhoneNumber <input name="m_phoneNum"> <br>
		BirthDay 
		<select name="m_y">
			<c:forEach var="y" begin="${cy - 100 }" end="${cy }">
				<option>${y }</option>
			</c:forEach>
		</select>년 
		<select name="m_m">
			<c:forEach var="m" begin="1" end="12">
				<option>${m }</option>
			</c:forEach>
		</select>월 
		<select name="m_d">
			<c:forEach var="d" begin="1" end="31">
				<option>${d }</option>
			</c:forEach>
		</select>일 
		<br>
		image <input type="file" name="m_picture"> <br>
		<button>enter</button>
	</form>
</body>
</html>