<%@page import="com.sh.sep26.manager.DBManager"%>
<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="java.sql.Connection"%>
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
		// 톰캣이 튜브 대여소 역할 가능
		// 튜브 = Connection 객체
		
		// 기존 = DriverManager.getConnection()을 실행하는 순간
		//		관련된 모든 작업을 해서 Connection 객체를 만들어 줌 => 느림
		
		// Connection Pool : 미리 Connection 객체를 만들어 두고
		//	클라이언트가 요청하면 만들어 놓은 객체 제공 => 빠름
		
		// 설정 - context.xml(설계도, 사업계획서 느낌의 기능)
		// Servers - context.xml 를 건들면 Workspace안의 모든 프로젝트에 영향을 줌
		// 		종류가 다른 프로젝트 -> DB서버가 다르기 때문에 context.xml을 복사하여 한 프로젝트에서만 사용하게 만들어 둠
		
		// 우리가 만든 context.xml을 각 프로젝트의 META-INF폴더에 넣어 사용
		
		String result = "실패";
		
		Connection con = null;
		try{
			con = DBManager.connect("myPool");
			result = "성공";
		} catch (Exception e) {
			e.printStackTrace();
		}
		DBManager.close(con, null, null);
	%>
		<h1 class="menuText">DB연결</h1>
		<h1 class="menuText"><%=result %></h1>
		
		
</body>
</html>
































































