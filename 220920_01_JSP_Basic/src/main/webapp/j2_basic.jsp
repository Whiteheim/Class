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
		������ ���ڸ� �־��� ��, ¦���� Ȧ���� �˷��ִ� ���
		���� ���ڿ� Ȧ¦���θ� ���������� ���
	 --%>
	
	<%-- <%! 
	public static int randomN() {
		Random r = new Random();
		return r.nextInt(100) + 1;
	} 
	%>
	
	<%  
		int rN = randomN();	
		String result = "Ȧ";
		if (rN % 2 == 0) {
			result = "¦";
		}	
	%>
	<%= rN %>
	<%= result %> --%>
	<p>
	
	<%!
		public String getOE(int x) {
		return (x % 2 == 0) ? "¦��" : "Ȧ��";
	}
	%>
	<% 
		Random r = new Random();
		int x = r.nextInt(100) + 1;
	%>
	
	<h1>���� ���� : <%=x %></h1>
	<h1>Ȧ¦ ���� : <%=getOE(x) %></h1>
		 
</body>
</html>


































