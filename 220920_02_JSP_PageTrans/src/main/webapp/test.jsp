<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		// 사용자 요청상태
		// 입력페이지 (Input.html) -> 출력페이지 (Output.jsp)
		//						점검중(test.jsp)
		//						중간에 응답을 가로챔
		
		// 페이지 이동 방법
		//		수동 (사용자가 action을 취하면 페이지 이동) - 요청하는 형태
		//				- <a></a> : 클릭하면 이동
		//				- <form> + <button> : 버튼 조작 or input에서 enter 입력
		//				- JavaScript(location.href) : event 지정 가능
		
		//		자동 (사용자의 action과 상관없이 페이지 이동)
		//				- redirect
		//					Output.jsp <body>부분 최상단 (Java 코드 내부)
		//					response.sendRedirect("test.jsp");
		%>
	임시점검 (예상 소요시간 : 2시간)
</body>
</html>


































