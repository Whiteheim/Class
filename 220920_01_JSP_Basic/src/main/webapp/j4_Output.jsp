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
		// ��û���
		// GET / POST ���
		// ���� : ��û �Ķ���� -> �ѱ� ó�� (request.setCharacterEncoding)
		// 		GET - ����
		//		POST - �ؾ���
		// ���⼭�� �ϴ°� �´�
		request.setCharacterEncoding("EUC-KR");
		// �ܺο��� ��û ���� �����͸� ���ڵ� ����
		
		// ���� : ���� �Ķ���� �ѱ� ó�� (pageEncoding���� ���ְ� �־ ���� ����)
		//									(1 / 2 / 6 �� ��)
		//response.setCharacterEncoding("EUC-KR");
		// �ܺη� ������ �� ������ �����͸� ���ڵ� ����
		
		String name = request.getParameter("name"); // input�� ������ name ��
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		int z = x + y;
	%>
	
	�̸� : <%=name %> <p>
	<h1> <%=x %> + <%=y %> = <%=z %> </h1>
</body>
</html>









































