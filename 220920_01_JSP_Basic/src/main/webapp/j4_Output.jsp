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
		// 요청방식
		// GET / POST 방식
		// 기존 : 요청 파라미터 -> 한글 처리 (request.setCharacterEncoding)
		// 		GET - 안함
		//		POST - 해야함
		// 여기서는 하는게 맞다
		request.setCharacterEncoding("EUC-KR");
		// 외부에서 요청 들어온 데이터를 인코딩 해줌
		
		// 기존 : 응답 파라미터 한글 처리 (pageEncoding에서 해주고 있어서 생략 가능)
		//									(1 / 2 / 6 번 줄)
		//response.setCharacterEncoding("EUC-KR");
		// 외부로 응답할 때 보내는 데이터를 인코딩 해줌
		
		String name = request.getParameter("name"); // input에 지정한 name 값
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		int z = x + y;
	%>
	
	이름 : <%=name %> <p>
	<h1> <%=x %> + <%=y %> = <%=z %> </h1>
</body>
</html>









































