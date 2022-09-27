<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="apple.js"></script>
<link rel="stylesheet" href="css/main.css">
<style type="text/css">
body, html{
	height: 100%;
	width: 100%;
	margin: 0px;
	display: flex;
}
</style>
</head>
<body>
	<div id="mainBorder">
		<h1 id="title">너무 잠이 온다</h1>
		
		<p id="contentSpace">
		<jsp:include page="${contentPage }"/>
		<p>
		
		<p id="menues" align="center">
			<a href="HomeController"><span class="menuText">메뉴 1</span></a>
			<a href="Menu2Controller"><span class="menuText">메뉴 2</span></a>
			<span class="menuText">메뉴 3</span>
			<a href="DBCController"><span class="menuText">메뉴 4</span></a>
		</p>
	</div>
</body>
</html>