<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/oct24/compliteCorrectInfo.page" method="POST">
		이름 <input readonly="readonly" value="${sessionScope.loginMember.s_name }"> <br>
		닉네임 <input name="s_nickName"> <br>
		생년월일 <input readonly="readonly" value="${sessionScope.loginMember.s_birth }"> <br>
		아이디 <input readonly="readonly" name ="s_id" value="${sessionScope.loginMember.s_id }"> <br>
		비밀번호 <input type="password" name="s_pw"> <br>
		비밀번호 확인 <input type="password"> <br>
		이메일 <input type="email" name="s_mail" placeholder="${sessionScope.loginMember.s_mail }"> <br>
		휴대폰 번호 <input maxlength="12" name="s_phoneNumber" placeholder="'-'없이 입력해주세요"> <br>
		<button>정보변경</button> 
		</form>
		<a>취소</a>
</body>
</html>