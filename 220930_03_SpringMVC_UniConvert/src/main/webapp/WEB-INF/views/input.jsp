<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>단위변환</h1>
	<form action="unit.convert" method="get">
		<input name="n1" placeholder="숫자입력" > <p>
		<select name="what"placeholder="단위 설정">
			<option value="l">cm -> inch</option>
			<option value="v">m² -> 평</option>
			<option value="t">℃ -> ℉</option>
			<option value="s">mi/h -> km/h</option>
		</select>
		<hr>
		<button>입력</button>
	</form>
</body>
</html>