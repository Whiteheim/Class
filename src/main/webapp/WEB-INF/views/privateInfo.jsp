<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이름 :${sessionScope.loginMember.s_name } <br>
	닉네임 :${sessionScope.loginMember.s_nickName } <br>
	생일 :${sessionScope.loginMember.s_birth } <br>
	아이디 :${sessionScope.loginMember.s_id } <br> 
	이메일 :${sessionScope.loginMember.s_mail } <br>
	휴대폰번호 :${sessionScope.loginMember.s_phoneNumber } <br>
	
	<form action="/oct24/correctInfo.page">
		<button>정보변경</button>
	</form>
	<form action="/oct24/quit.page">
		<button>회원탈퇴</button>
	</form>
</body>
</html>