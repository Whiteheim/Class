<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function gogogo() {
		location.href = "SecondC?a=20&b=200";
	}
</script>
</head>
<body>
	<%
		// 사용자(Client)가 action을 취했을 때 이동 하는 것 : 요청
		//			- <a> 태그 사용 : 클릭하면 GET방식
		//			- JS 사용 : 이벤트를 추가 했을 때 (함수 불러오기 등) GET방식
		//				(JS로 HTML를 만드는게 가능 -> <form>을 만들면 POST방식도 가능함
		//			- <form> + <button> : 버튼을 클릭했을 때 GET/POST 방식 지정
	%>
	<h1>First</h1>
	d : ${sessionScope.d } <br>
	e : ${cookie.e.value } <br>
	<a href="SecondC?a=10&b=100">Second로 간닷</a>
	<hr>
	<div onclick="gogogo();">Second로 간닷</div>
	<hr>
	<form action="SecondC">
		<input name="a"> <br>
		<input name="b"> <br>
		<button>Second로 간닷</button>
	</form>
</body>
</html>




































