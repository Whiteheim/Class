<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div class="loginWindow">
		<p>반갑습니다</p>
		<p>${sessionScope.loginMember.m_id }님</p>
		<p>
		<p>
	<form action="InfoController">
	<button>정보</button>
	</form>
	<button onclick="logout();">로그아웃</button>
	</div>
</body>
</html>