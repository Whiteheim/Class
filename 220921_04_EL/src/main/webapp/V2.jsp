<%@page import="java.util.ArrayList"%>
<%@page import="com.sh.sep21.main.Example"%>
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
		// EL (Expression Language) : 표현언어
		//		값을 받을 때 Java대신 사용 가능
		//		.jsp에서만 사용 가능(.jsp를 Servlet으로 바꿀 때 Tomcat이 EL을 Java코드로 바꿔줌)
		//		문법 : ${xxx }
		// 				연산자 사용 가능
		//				형 변환 자동
		//				값이 없으면 에러 안나오고 그냥 넘어감
		//				import가 없어도 가능
		
		//		파라미터의 값 읽기 : ${param.파라미터명 }
		
		//		어트리뷰트값 읽기 (int, double, String, ... 포함)
		//				: ${어트리뷰트명 }
		
		//		어트리뷰트값 읽기(객체)
		//				주소값 - ${어트리뷰터명 }
		//				속성값 - ${어트리뷰터명.객체의 멤버변수명 }
		
		//		어트리뷰트값 읽기(List, [])
		//				ArrayList / [] 자체 - ${어트리뷰트명 }
		//				인덱스 위치의 객체	- ${어트리뷰트명[인덱스 번호] }
		//				인덱스 위치의 객체 속성 - ${어트리뷰트명[인덱스].멤버변수명 }
	
		// 		반복문, 조건문은 표현 불가
		//			=> CustomTag를 이용해 표현
	%>
	
<%-- 	<%
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		int z = (Integer) request.getAttribute("z");
		
		Example e = (Example) request.getAttribute("e");
		
		ArrayList<Example> exam = (ArrayList<Example>) request.getAttribute("exam"); 
		
	%>
	<h1>결과</h1>
	 <%=x %> x <%=y %> = <%=z %> <p>
	 <%=e.getName() %> : <%=e.getAge() %> : <%=e.getHeight() %> : <%=e.getWeight() %> <p>
	 <%=e %> <p>
	 
	 <%=exam %> <p>
	 <%=exam.get(1) %> <p>
	 <%=exam.get(2).getName() %> ,<%=exam.get(3).getAge() %> <p>
	 
	 <%
	 	for (int i = 0; i < exam.size(); i++) {
	 %>
	 	<%=exam.get(i).getName() %> : <%=exam.get(i).getAge() %>살 <br>
	 <%
	 	}
	 %> --%>
	 <hr>
	 ${param.x } <p>
	 ${param.y } <p>
	 ${param.x * param.y } <p>
	 ${z }<p>
	 <hr>
	 ${e.name } : ${e.age } : ${e.height } : ${e.weight }
	 <hr>
	 ${param.dadasdswwqzz } <!-- 값이 없을 때 무시하고 넘어감 -->
	 <hr>
	 ${exam } <p>
	 ${exam[1] } <p>
	 ${exam[2].name },${exam[3].age } <p>
	 
</body>
</html>






































