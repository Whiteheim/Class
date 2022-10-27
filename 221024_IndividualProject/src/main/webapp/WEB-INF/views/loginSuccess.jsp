<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${r } <br>
	${sessionScope.loginMember.s_nickName } 님 <br>반갑습니다.
	<form action="/oct24/Info.page">
		<button>정보확인</button>
	</form>
	<form action="/oct24/logOut.page">
		<button>로그아웃</button>
	</form>
	
</body>
</html>