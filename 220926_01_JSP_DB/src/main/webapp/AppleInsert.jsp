<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div class="content">
	<form action="InsertController" method="post" name="applelist">
		����<input name="location"> <br>
		ǰ��<input name="name"> <br>
		��<input name="color"> <br>
		����<input name="price"> <br>
		��<input name="flavor"> <br>
		
		<button>���</button>
	</form>
	</div>
	
			
</body>
</html>