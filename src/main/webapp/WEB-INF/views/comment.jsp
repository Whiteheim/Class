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
	<c:if test="${comment } = null">
		<h3>댓글이 없습니다.</h3>
	</c:if>
	<c:if test="${comment } != null">
		<c:forEach var="c" items="comment">
		${comment.r_comment }
		</c:forEach>
	</c:if>
</body>
</html>