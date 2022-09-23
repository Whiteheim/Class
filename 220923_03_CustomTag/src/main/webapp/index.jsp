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
	<h1>네이버</h1>
		<table class="menu">
			<tr>
				<td align="center">
				<a href="HomeController">
						<button id="home">홈</button>
			</a> </td>
				<td align="center"><a href="WeatherController">
				<button id="weather">날씨</button>
			</a>
				</td>
				<td align="center">
				<a href="PNController">
				<button id="news">뉴스</button>
				</a>
				</td>
				<td align="center">
				<a href="JSTLFController">
				<button id="blog">블로그</button>
				</a>
				</td>
				<td align="center"><button id="cafe">카페</button></td>
				<td align="center"><button id="e-mail">메일</button></td>
			</tr>
			<tr>
				<td colspan="5"><jsp:include page="${contentPage }"/></td>
			</tr>
		</table>
	<!-- jsp태그로 불러온 페이지는 현재 페이지의 css에 영향을 받음 -->
</body>
</html>