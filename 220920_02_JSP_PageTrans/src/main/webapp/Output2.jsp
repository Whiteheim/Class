<%@page import="org.apache.jasper.tagplugins.jstl.core.Catch"%>
<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.StringTokenizer"%>
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
		response.sendRedirect("test.jsp");		// �ӽ����� ������ ���� ����Ʈ ������ ���� �� ���
		request.setCharacterEncoding("EUC-KR");
		String number = request.getParameter("number");

		// split
		String[] numData = number.split(",");
		int sum1 = 0;
		for (String n : numData) { 	// ���ڿ��� �������� �����Ƿ� try-catch ���
								 	// ��������
			try{
				sum1 += Integer.parseInt(n);
			} catch (Exception e) {
			}
		}
		// StringTokenizer
		StringTokenizer st = new StringTokenizer(number, ",");
		int sum2 = 0;
		while (st.hasMoreTokens()){
			try{
				sum2 += Integer.parseInt(st.nextToken());
			} catch (Exception e) {
			}
		}
	%>
	��(Split) : <%=sum1 %> <br>
	��(StringTokenizer) : <%=sum2 %>
	
</body>
</html>


























