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
		// JSP Model 2 (V/C/M으로 나눠 사용)
		// V(.jsp)
		//		값 받기 : EL			${XXX }
	
		// 페이지 이동
		//		redirect, forward, include
		
		// 조건문, 반복문
		// 출력 형식 (소수점, 날짜 형식, ... )
		
		// CustomTag
		//		생김새는 HTML DOM객체와 유사
		//		.jsp -> servlet으로 바뀔 때 java로 변환
		//			=> .jsp에서만 사용 가능
		//		<접두어:태그명>
		//			<xxx:tabel></xxx:table>			=> 열고 닫기 한 쌍
		//			<xxx:tabel />					=> 한 쌍의 사이에 내용이 없다면 축약 가능
		
		// JSP표준 Action Tag 
		//		JSP환경에서 기본적으로 사용 가능한 태그
		//		그 접두어가 jsp
		//		forward, include, ...
		// Custom Tag
		//		외부 .jar를 넣고 사용을 함 (jstl)
		//		접두어를 자유롭게 지정 가능
		//		반복문, 조건문, 출력형식, ...
		
		// 다른 페이지에 있는 내용을 한 곳에 모아둘 때 사용, 위치 자유롭게 이용 가능	
		// 웹 사이트에서 상하단 고정이미지를 두고 중간 내용만(게시판 등) 변화할 때 사용
	%>
	<h1>First</h1>
	<!-- second.jsp 의 소스를 가져옴 -->
	<!-- 원하는 위치에 표현할 수 있는 장점 -->
	<jsp:include page="second.jsp"></jsp:include>
	
	<h2>Third</h2>
</body>
</html>






















































