<%@page import="org.apache.catalina.startup.SetNextNamingRule"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%-- 
		랜덤한 숫자를 넣었을 때, 짝인지 홀인지 알려주는 기능
		뽑은 숫자와 홀짝여부를 웹페이지에 출력
	 --%>
	
	<%-- <%! 
	public static int randomN() {
		Random r = new Random();
		return r.nextInt(100) + 1;
	} 
	%>
	
	<%  
		int rN = randomN();	
		String result = "홀";
		if (rN % 2 == 0) {
			result = "짝";
		}	
	%>
	<%= rN %>
	<%= result %> --%>
	<p>
	
	<%!
		public String getOE(int x) {
		return (x % 2 == 0) ? "짝수" : "홀수";
	}
	%>
	<% 
		Random r = new Random();
		int x = r.nextInt(100) + 1;
	%>
	
	<h1>뽑은 숫자 : <%=x %></h1>
	<h1>홀짝 여부 : <%=getOE(x) %></h1>
		 
</body>
</html>


































