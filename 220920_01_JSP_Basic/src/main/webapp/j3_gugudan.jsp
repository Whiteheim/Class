<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	table {
		float: left;
	}
</style>
</head>
<body>
	<% 
	for(int i = 2; i <= 9; i++){
	%>
		<table border="1">
			<tr>
				<th><%=i %>��</th>
			</tr>
		<% 
		for(int j = 1; j <= 9; j++){
		%>
			<tr>
				<td><%=i %> x <%=j %> = <%=i * j%><td>	
			</tr>
		<% 
			}
		%>	
		</table>
	<% 
	}
	%>
	<!-- Ʋ�� ���ְ� ��ü������ �׸��� �׷����� -->

</body>
</html>



























