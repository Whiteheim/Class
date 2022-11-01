<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>${contentsDetail.b_title}</h3>
	<img width="30px" height="40px" src="resources/img/'${contentDetail.b_img }'">
	<div>${contentsDetail.b_content }</div>
	<hr>
	<div>댓글 자리</div>
	<textarea rows="3"></textarea>
	댓글달기<input type="button">
	<hr>
	이전글<input type="button">
	다음글<input type="button">
</body>
</html>