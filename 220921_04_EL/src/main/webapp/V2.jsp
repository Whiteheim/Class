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
		// EL (Expression Language) : ǥ�����
		//		���� ���� �� Java��� ��� ����
		//		.jsp������ ��� ����(.jsp�� Servlet���� �ٲ� �� Tomcat�� EL�� Java�ڵ�� �ٲ���)
		//		���� : ${xxx }
		// 				������ ��� ����
		//				�� ��ȯ �ڵ�
		//				���� ������ ���� �ȳ����� �׳� �Ѿ
		//				import�� ��� ����
		
		//		�Ķ������ �� �б� : ${param.�Ķ���͸� }
		
		//		��Ʈ����Ʈ�� �б� (int, double, String, ... ����)
		//				: ${��Ʈ����Ʈ�� }
		
		//		��Ʈ����Ʈ�� �б�(��ü)
		//				�ּҰ� - ${��Ʈ�����͸� }
		//				�Ӽ��� - ${��Ʈ�����͸�.��ü�� ��������� }
		
		//		��Ʈ����Ʈ�� �б�(List, [])
		//				ArrayList / [] ��ü - ${��Ʈ����Ʈ�� }
		//				�ε��� ��ġ�� ��ü	- ${��Ʈ����Ʈ��[�ε��� ��ȣ] }
		//				�ε��� ��ġ�� ��ü �Ӽ� - ${��Ʈ����Ʈ��[�ε���].��������� }
	
		// 		�ݺ���, ���ǹ��� ǥ�� �Ұ�
		//			=> CustomTag�� �̿��� ǥ��
	%>
	
<%-- 	<%
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		int z = (Integer) request.getAttribute("z");
		
		Example e = (Example) request.getAttribute("e");
		
		ArrayList<Example> exam = (ArrayList<Example>) request.getAttribute("exam"); 
		
	%>
	<h1>���</h1>
	 <%=x %> x <%=y %> = <%=z %> <p>
	 <%=e.getName() %> : <%=e.getAge() %> : <%=e.getHeight() %> : <%=e.getWeight() %> <p>
	 <%=e %> <p>
	 
	 <%=exam %> <p>
	 <%=exam.get(1) %> <p>
	 <%=exam.get(2).getName() %> ,<%=exam.get(3).getAge() %> <p>
	 
	 <%
	 	for (int i = 0; i < exam.size(); i++) {
	 %>
	 	<%=exam.get(i).getName() %> : <%=exam.get(i).getAge() %>�� <br>
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
	 ${param.dadasdswwqzz } <!-- ���� ���� �� �����ϰ� �Ѿ -->
	 <hr>
	 ${exam } <p>
	 ${exam[1] } <p>
	 ${exam[2].name },${exam[3].age } <p>
	 
</body>
</html>






































