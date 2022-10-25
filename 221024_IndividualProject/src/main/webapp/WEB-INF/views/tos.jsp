<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/oct24/signUp.page" method="POST">
		<ul>
			<li>
			<textarea>약관내용</textarea>
				<ul>
					<li>위의 이용 약관에 동의합니다.</li>
					<li><input type="checkbox"></li>
				</ul>
			</li>
			<li>
			<textarea>개인정보이용내용</textarea>
				<ul>
					<li>위의 개인정보 이용 약관에 동의합니다.</li>
					<li><input type="checkbox"></li>
				</ul>
			</li>
			<li>
				<ul>
					<li>위의 모든 약관에 동의합니다.</li>
					<li><input type="checkbox"></li>
				</ul>
			</li>
		</ul>
	<button>동의 완료</button>
	</form>
</body>
</html>