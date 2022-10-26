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
	<form action="/oct24/signUpComplite.page" method="POST">
		이름 <input name="s_name"> <br>
		닉네임 <input name="s_nickName"> <br>
		생년월일 
		<select name="s_y">
			<c:forEach var="y" begin="${cy - 50 }" end="${cy }">
				<option>${y }</option>
			</c:forEach>
		</select> 년 
		<select name="s_m">
			<c:forEach var="m" begin="1" end="12">
				<option>${m }</option>
			</c:forEach>
		</select> 월 
		<select name="s_d">
			<c:forEach var="d" begin="1" end="31">
				<option>${d }</option>
			</c:forEach>
		</select> 일 <br>
		아이디 <input name="s_id"> <br>
		비밀번호 <input name="s_pw" type="password"> <br>
		비밀번호 확인 <input type="password"> <br>
		이메일 <input type="email" name="s_mail"> <br>
		휴대폰 번호 <input maxlength="12" name="s_phoneNumber" placeholder="'-'없이 입력해주세요"> <br>
		<button>가입</button>
	</form>
</body>
</html>