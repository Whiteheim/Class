<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<div>
		<form action="/oct24/loginComplite.page" method="POST">
		<p>아이디 <input name="s_id"></p>
		<p>비밀번호 <input name="s_pw" type="password"></p> 
		<button id="loginBtn">로그인</button>
		</form>
	</div>
	<form action="/oct24/TOS.page">
	<button>회원가입</button>
	</form>
	<input type="button" value="아이디 찾기">
	<input type="button" value="비밀번호 찾기">
	${r }
</body>
</html>