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
		// JSP Model 2 (V/C/M���� ���� ���)
		// V(.jsp)
		//		�� �ޱ� : EL			${XXX }
	
		// ������ �̵�
		//		redirect, forward, include
		
		// ���ǹ�, �ݺ���
		// ��� ���� (�Ҽ���, ��¥ ����, ... )
		
		// CustomTag
		//		������� HTML DOM��ü�� ����
		//		.jsp -> servlet���� �ٲ� �� java�� ��ȯ
		//			=> .jsp������ ��� ����
		//		<���ξ�:�±׸�>
		//			<xxx:tabel></xxx:table>			=> ���� �ݱ� �� ��
		//			<xxx:tabel />					=> �� ���� ���̿� ������ ���ٸ� ��� ����
		
		// JSPǥ�� Action Tag 
		//		JSPȯ�濡�� �⺻������ ��� ������ �±�
		//		�� ���ξ jsp
		//		forward, include, ...
		// Custom Tag
		//		�ܺ� .jar�� �ְ� ����� �� (jstl)
		//		���ξ �����Ӱ� ���� ����
		//		�ݺ���, ���ǹ�, �������, ...
		
		// �ٸ� �������� �ִ� ������ �� ���� ��Ƶ� �� ���, ��ġ �����Ӱ� �̿� ����	
		// �� ����Ʈ���� ���ϴ� �����̹����� �ΰ� �߰� ���븸(�Խ��� ��) ��ȭ�� �� ���
	%>
	<h1>First</h1>
	<!-- second.jsp �� �ҽ��� ������ -->
	<!-- ���ϴ� ��ġ�� ǥ���� �� �ִ� ���� -->
	<jsp:include page="second.jsp"></jsp:include>
	
	<h2>Third</h2>
</body>
</html>






















































