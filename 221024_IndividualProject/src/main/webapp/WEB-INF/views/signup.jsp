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
		이름 <input id="s_name"> <br>
		닉네임 <input id="s_nickName"> <br>
		생년월일 <input id="s_birth"> <br>
		아이디 <input id="s_id"> <br>
		비밀번호 <input type="password" id="s_pw"> <br>
		비밀번호 확인 <input type="password"> <br>
		이메일 <input type="email" id="s_mail"> <br>
		휴대폰 번호 <input maxlength="12" id="s_phoneNumber"> <br>
		<button>가입하기</button>
	</form>
</body>
</html>