<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.l {
		color: red;
	}
	
	.v {
		color: green;
	}
	
	.t {
		color: blue;
	}
	
	.s {
		color: pink;
	}
</style>
</head>
<body>
	<h1 class="${param.what }">변환 결과</h1>
	${cr.n1 } ${cr.u1 } : ${cr.n2 } ${cr.u2 }
</body>
</html>