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
		<p>�ݰ����ϴ�</p>
		<p>${sessionScope.loginMember.m_id }��</p>
		<p>
		<p>
	<form action="InfoController">
	<button>����</button>
	</form>
	<button onclick="logout();">�α׾ƿ�</button>
	</div>
</body>
</html>