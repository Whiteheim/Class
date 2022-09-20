<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%> <!-- 지시자 (언어는 자바, 타입은 html, 인코딩은 EUC-KR) -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<marquee><%=1230 * 877%></marquee>




	HTML : 웹사이트 제작 가능
		=> 디자인 / 이벤트 부족 : 투박하고 정적인 이벤트만 존재
			=> HTML(뼈대) / CSS(디자인) / JavaScript(이벤트 처리(유효성검사 등))
				=> 파라미터 읽기, 계산, 조건문, 반복문등의 프로그래밍 언어의 기능 부재
					=> 대안으로 나온 Servlet : 클라이언트 요청 => 
													HTML + CSS + JavaScript를 만들어 응답하는 자바 프로그램
						=> 하지만 여럽고 작업이 불편함		
							=> JSP 개발
	
	JSP (Java Servlet/Server Page)
		작업형태 : HTML + CSS + JavaScript에 필요한 부분마다 Java의 코드를 추가
		Tomcat이 프로그램 실행시에 Servlet으로 변환하여 실행
		
	Servlet : 자바코드 안에서 HTML 구현
	JSP: HTML 안에서 자바코드 추가
	
	<%-- 
		JSP의 문법
		
		1. 스크립트릿 (Scriptlet)
		JSP에서 Java코드를 실행할 때 사용하는 블록
		모양 : <% Java code %>
		
		2. 지시자
		특별한 지시를 내릴 수 있도록 하는 블록
		모양 : <%@ page / include / taglib / ... %> (맨 위에 있음)
		
		3. 표현식
		어떤 값을 (웹페이지에) 출력 결과로 포함하고 싶을 때 사용하는 영역
		모양 : <%= 값 / 변수 / ... %>	
		숫자, 문자열, 변수 등 값 사용 가능
		Servlet에서의 out.print();의 기능
		
		4. 선언문
		표현식에서 사용 가능한 Java의 method를 작성할 때 사용하는 블록
		모양 : <%! 멤버변수 / method %>
		Java의 method 제작과 동일 한 방법으로 제작 (이름 규칙도 동일)
		
		5. 주석
		현재 설명들을 감싼 형태가 주석
		모양 : <%-- --%>
		
		
		
		
		
		
		
		
	--%>
</body>
</html>	



























































