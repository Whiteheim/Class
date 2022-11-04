<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function reload() {
	location.reload();
};
</script>
</head>
<body>
	<iframe name="iframe" style="display: none;"></iframe>
	<form action="/oct24/search.post" method="post" target="iframe" onclick="location.reload()">
		<input id="searchTitle" name="b_title">
		<button id="searchBtn">검색</button>
	</form>
	<hr>
	<c:forEach var="p" items="${searchPost }">
		<div>
			<a href="/oct24/viewPost.page?b_title=<c:out value="${p.b_title}"/>">
				<span>${p.b_num }</span>
				<span>${p.b_title }</span>
				<span>${p.b_author }</span>
				<span>${p.b_date }</span>
				<span>${p.b_thumb }</span>
			</a>
			</div>
	</c:forEach>
</body>
</html>