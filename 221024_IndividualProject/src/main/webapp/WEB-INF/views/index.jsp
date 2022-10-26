<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/jQuery.js"></script>
<script type="text/javascript" src="resources/request.js"></script>
<script type="text/javascript">
	$(function () {
		$("#loginBtn").click(function () {
			alert(${r });
		});
	});

</script>
</head>
<body>
	<header>
		<h1><a href="/oct24/">요걸로 모먹지</a></h1>
	</header>
	<div>
		<span><a href="/oct24/">HOME</a></span>
		<span><a href="/oct24/search.page">레시피검색</a></span>
		<span>나만의 레시피</span>
		<span><a href="/oct24/board.page">게시판</a></span>
		<span><jsp:include page="${login }"></jsp:include></span>
	</div>
	<div>
		<jsp:include page="${cp }"></jsp:include>
	</div>
	
</body>
</html>