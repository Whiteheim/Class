<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>NAVER</title>
<link rel="stylesheet" href="css/naver.css">
</head>
<body>
	<h1>���̹�</h1>
	<table class="menu">
		<tr>
			<td><button id="home">Ȩ</button> </td>
			<td><a href="WeatherController">
			<button id="weather">����</button>
			</a>
			</td>
			<td><button id="news">����</button></td>
			<td><button id="blog">��α�</button></td>
			<td><button id="cafe">ī��</button></td>
			<td><button id="e-mail">����</button></td>
		</tr>
		<tr>
			<td colspan="5"><jsp:include page="${contentPage }"/></td>
		</tr>
	</table>
	<!-- jsp�±׷� �ҷ��� �������� ���� �������� css�� ������ ���� -->
</body>
</html>