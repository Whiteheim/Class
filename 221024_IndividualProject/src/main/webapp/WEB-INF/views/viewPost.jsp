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
	<img src="resources/img/${contentsDetail.b_img }">
	<div>${contentsDetail.b_content }</div>
	<hr>
		<jsp:include page="${commentBox }"></jsp:include>
	
	<form action="/oct24/comment.jsp" target="commentss">
		<iframe name="commentss">
		</iframe>
		<textarea rows="3" name="r_comment"></textarea>
		<input type="hidden" name="r_writer" value="${sessionScope.loginMember.s_nickName }">
		<button>댓글 입력</button>
	</form>
	
	${r }
</body>
</html>