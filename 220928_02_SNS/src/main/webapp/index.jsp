<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index.css">
<script type="text/javascript" src="js/VaildChecker.js"></script>
<script type="text/javascript" src="js/JoinVaildChecker.js"></script>
<script type="text/javascript" src="js/go.js"></script>
</head>
<body>
	<div id="title" onclick="home();">보노보노야</div>
	<div id="center">
	 	<jsp:include page="${cp }"/>
	</div>
	<div>${r }</div>
		<jsp:include page="${login }"/>
	<div id="TTMenu">
	<div class="menu" id="menu1">메뉴1</div>
	<div class="menu" id="menu2">메뉴2</div>
	<div class="menu" id="menu3">메뉴3</div>
	<div class="menu" id="menu4">메뉴4</div>
	</div>
</body>
</html>
























