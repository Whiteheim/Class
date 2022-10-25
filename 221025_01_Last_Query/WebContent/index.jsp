<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript" src="jQuery.js"></script>
<script type="text/javascript" src="test.js"></script>
</head>
<body>
	<!-- 
		회원가입
		id / pw / pw확인 / 이름 / 주소 (input 3개로 나누어서 우편번호, 주소, 상세주소) / 버튼 
	 -->
	 <table>
	 	<tr>
	 		<td>id</td>
	 		<td><input></td>
	 	</tr>
	 	<tr>
	 		<td>pw</td>
	 		<td><input type="password"></td>
	 	</tr>
	 	<tr>
	 		<td>pw 확인</td>
	 		<td><input type="password"></td>
	 	</tr>
	 	<tr>
	 		<td>이름</td>
	 		<td><input ></td>
	 	</tr>
	 	<tr>
	 		<td>주소</td> 
	 		<td><input id="addr1" style="width: 40px;" readonly="readonly"> <br> 
	 		<input id="addr2" readonly="readonly"> <br>
	 		<input></td>
	 	</tr>
	 	<tr>
	 		<td><button>입력</button></td>
	 	</tr>
	 </table>
	 
</body>
</html>