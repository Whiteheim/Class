<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div>
		<p>ID : ${sessionScope.loginMember.m_id }</p>
		<p>전화번호 : ${sessionScope.loginMember.m_phoneNum }</p>
		<p>생년월일 : ${sessionScope.loginMember.m_bd }</p>
		<p>회원사진 : <img id="picture" width="30px" height="40px" src="img/${sessionScope.loginMember.m_picture }"></p>
		<form action="CollectInfoController">
		<button>회원 정보 변경</button>
		</form>
		<form action="InfoController" method="post">
		<button value="${sessionScope.loginMember.m_id }" name="c_id" type="submit">회원 탈퇴</button>
		</form>
		
	</div>
</body>
</html>