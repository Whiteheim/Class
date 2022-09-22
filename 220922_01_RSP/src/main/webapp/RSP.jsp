<%@page import="org.eclipse.jdt.internal.compiler.batch.Main"%>
<%@page import="java.util.function.Function"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	let scissor = (a) => a;	
	let rock = (b) => b;
	function papper(c) {
		return c;
	}
	
</script>
</head>
<body>
	<form action="HomeController" method="post">
	<h1>가위 바위 보!</h1>
	<table border="1">
		<tr>
			<td>
				<button name="rsp" value= "1" >가위</button>
			</td>
			<td>
				<button name="rsp" value= "2">바위</button>
			</td>
			<td>
				<button name="rsp" value= "3">보</button>
			</td>
		</tr>
	</table>
	</form>
	${m.result }
	<h1>결과</h1>
	${m.win }승 <p> 
	${m.lose }패 <p>
	${m.draw }무 <hr>
</body>
</html>



































