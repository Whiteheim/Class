<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div class="content">
	<h2>Apple Information</h2>
	<form action="AppleDetailController" method="post"> <!-- �����ϱ� ��ư ������ �̵� -->
		���� : <input readonly="readonly" autocomplete="off" autofocus="autofocus"
				name="a_location" class="inputt" value="${apple.a_location }"> <p>
		�̸� : <input autocomplete="off" name="a_name" class="inputt" value="${apple.a_name }"> 
		<p>
		���� : <input autocomplete="off" name="a_price" class="inputt" value="${apple.a_price }"> 
		<p>
		�� : <input autocomplete="off" name="a_color" class="inputt" value="${apple.a_color }"> 
		<p>
		�� : <textarea autocomplete="off" name="a_flavor" class="inputt" > ${apple.a_flavor }
		</textarea> <p>
		<button id="btn">����</button>
	</form>
		<button id="btn" onclick="deleteApple('${apple.a_location}')">����</button> 
			<!-- form �ȿ� ������ form �̺�Ʈ�� ���� �����Ŵ -->
	</div>
</body>
</html>