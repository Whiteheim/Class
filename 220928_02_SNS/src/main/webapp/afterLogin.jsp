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
		<p>��ȭ��ȣ : ${sessionScope.loginMember.m_phoneNum }</p>
		<p>������� : ${sessionScope.loginMember.m_bd }</p>
		<p>ȸ������ : <img id="picture" width="30px" height="40px" src="img/${sessionScope.loginMember.m_picture }"></p>
		<form action="CollectInfoController">
		<button>ȸ�� ���� ����</button>
		</form>
		<form action="InfoController" method="post">
		<button value="${sessionScope.loginMember.m_id }" name="c_id" type="submit">ȸ�� Ż��</button>
		</form>
		
	</div>
</body>
</html>