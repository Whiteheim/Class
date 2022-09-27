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
	<h2>Apple Information</h2>
	<form action="AppleDetailController" method="post"> <!-- 수정하기 버튼 누르면 이동 -->
		지역 : <input readonly="readonly" autocomplete="off" autofocus="autofocus"
				name="a_location" class="inputt" value="${apple.a_location }"> <p>
		이름 : <input autocomplete="off" name="a_name" class="inputt" value="${apple.a_name }"> 
		<p>
		가격 : <input autocomplete="off" name="a_price" class="inputt" value="${apple.a_price }"> 
		<p>
		색 : <input autocomplete="off" name="a_color" class="inputt" value="${apple.a_color }"> 
		<p>
		맛 : <textarea autocomplete="off" name="a_flavor" class="inputt" > ${apple.a_flavor }
		</textarea> <p>
		<button id="btn">수정</button>
	</form>
		<button id="btn" onclick="deleteApple('${apple.a_location}')">삭제</button> 
			<!-- form 안에 넣으면 form 이벤트를 먼저 적용시킴 -->
	</div>
</body>
</html>