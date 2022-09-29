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
		<form action="LoginController" method="post">
		ID <input name="m_id"> <br>
		PW <input name="m_pw" type="password"> <br>
		<button>login</button> 
		</form>
		<button onclick="go();">join</button>
	</div>
</body>
</html>