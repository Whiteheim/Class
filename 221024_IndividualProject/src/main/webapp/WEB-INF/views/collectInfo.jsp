<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/oct24/login.page" method="POST">
		이름 <input> <br>
		닉네임 <input> <br>
		생년월일 <input> <br>
		아이디 <input> <br>
		비밀번호 <input type="password"> <br>
		비밀번호 확인 <input type="password"> <br>
		휴대폰 번호 <input maxlength="3"> - <input maxlength="4"> - <input maxlength="4"> <br>
		이메일 <input type="email"> <br>
		<button>정보변경</button> 
		</form>
		<a>취소</a>
</body>
</html>