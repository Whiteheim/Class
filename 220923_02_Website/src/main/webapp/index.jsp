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
	<h1>네이버</h1>
	<table class="menu">
		<tr>
			<td><button id="home">홈</button> </td>
			<td><a href="WeatherController">
			<button id="weather">날씨</button>
			</a>
			</td>
			<td><button id="news">뉴스</button></td>
			<td><button id="blog">블로그</button></td>
			<td><button id="cafe">카페</button></td>
			<td><button id="e-mail">메일</button></td>
		</tr>
		<tr>
			<td colspan="5"><jsp:include page="${contentPage }"/></td>
		</tr>
	</table>
	<!-- jsp태그로 불러온 페이지는 현재 페이지의 css에 영향을 받음 -->
</body>
</html>