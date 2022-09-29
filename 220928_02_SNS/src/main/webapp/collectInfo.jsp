<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt1" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="CollectInfoController" method="post" enctype="multipart/form-data" name="signupForm">
		ID : ${sessionScope.loginMember.m_id } <br>
		PW <input type="password" name="c_pw"> <br>
		PW확인 <input type="password" name="c_pwCheck"> <br>
		PhoneNumber <input name="c_phoneNum"> <br>
		BirthDay 
		<select name="c_y">
			<c1:forEach var="y" begin="${cy - 100 }" end="${cy }">
				<option>${y }</option>
			</c1:forEach>
		</select>년 
		<select name="c_m">
			<c1:forEach var="m" begin="1" end="12">
				<option>${m }</option>
			</c1:forEach>
		</select>월 
		<select name="c_d">
			<c1:forEach var="d" begin="1" end="31">
				<option>${d }</option>
			</c1:forEach>
		</select>일 
		<br>
		image <input type="file" name="c_picture"> <br>
		<button>enter</button>
	</form>
</body>
</html>