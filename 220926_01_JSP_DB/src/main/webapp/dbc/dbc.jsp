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
		// ��Ĺ�� Ʃ�� �뿩�� ���� ����
		// Ʃ�� = Connection ��ü
		
		// ���� = DriverManager.getConnection()�� �����ϴ� ����
		//		���õ� ��� �۾��� �ؼ� Connection ��ü�� ����� �� => ����
		
		// Connection Pool : �̸� Connection ��ü�� ����� �ΰ�
		//	Ŭ���̾�Ʈ�� ��û�ϸ� ����� ���� ��ü ���� => ����
		
		// ���� - context.xml(���赵, �����ȹ�� ������ ���)
		// Servers - context.xml �� �ǵ�� Workspace���� ��� ������Ʈ�� ������ ��
		// 		������ �ٸ� ������Ʈ -> DB������ �ٸ��� ������ context.xml�� �����Ͽ� �� ������Ʈ������ ����ϰ� ����� ��
		
		// �츮�� ���� context.xml�� �� ������Ʈ�� META-INF������ �־� ���
		
		String result = "����";
		
		Connection con = null;
		try{
			con = DBManager.connect("myPool");
			result = "����";
		} catch (Exception e) {
			e.printStackTrace();
		}
		DBManager.close(con, null, null);
	%>
		<h1 class="menuText">DB����</h1>
		<h1 class="menuText"><%=result %></h1>
		
		
</body>
</html>
































































