<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>NAVER</title>
<script type="text/javascript" src="js/VaildChecker.js"></script>
<script type="text/javascript" src="js/CalculateVaildCheck.js"></script>
<link rel="stylesheet" href="css/naver.css">
</head>
<body>
	<h1>���̹�</h1>
		<table class="menu">
			<tr>
				<td align="center">
				<a href="HomeController">
						<button id="home">Ȩ</button>
			</a> </td>
				<td align="center"><a href="WeatherController">
				<button id="weather">����</button>
			</a>
				</td>
				<td align="center">
				<a href="PNController">
				<button id="news">����</button>
				</a>
				</td>
				<td align="center">
				<a href="JSTLFController">
				<button id="blog">��α�</button>
				</a>
				</td>
				<td align="center"><button id="cafe">ī��</button></td>
				<td align="center"><button id="e-mail">����</button></td>
			</tr>
			<tr>
				<td colspan="5"><jsp:include page="${contentPage }"/></td>
			</tr>
		</table>
	<!-- jsp�±׷� �ҷ��� �������� ���� �������� css�� ������ ���� -->
</body>
</html>