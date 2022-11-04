<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div> 
		<span>번호</span>
		<span>제목</span>
		<span>작성자</span>
		<span>날짜</span>
		<span>추천수</span>
	</div>
			
		<c:forEach var="board" items="${boards }">
		<div>
			<a href="/oct24/viewPost.page?b_num=<c:out value="${board.b_num}"/>">
				<span>${board.b_num }</span>
				<span>${board.b_title }</span>
		 		<span>${board.b_author }</span>
				<span>${board.b_date }</span>
				<span>${board.b_thumb }</span>
			</a>
		</div>
		</c:forEach>
	<form action="/oct24/write.page" method="get">
	<button>게시글 작성</button>
	</form>
	
</body>
</html>