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
				<th><%=i %>단</th>
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
	<!-- 틀을 없애고 전체적으로 그림을 그려야함 -->

</body>
</html>



























