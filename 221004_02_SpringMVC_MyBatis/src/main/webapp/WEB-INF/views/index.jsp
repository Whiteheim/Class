<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/student.reg">
	이름 : <input name="s_name"> <br>
	별명 : <input name="s_nickname"> <br>
	<button>등록</button>
	</form>
	<hr>
	<c:forEach var="s" items="${student }">
		${s.s_name } - ${s.s_nickname } <p>
	</c:forEach>
	<hr>
	${r }
	<hr>
	<!-- 시험과목명 / 시험날짜 (연 월 일 select 옵션) -> 등록 -> 과목명 / 날짜 (fmt기능)-->
	<h2>시험일 등록</h2>
	<form action="test.reg">
		과목 명 : <input name="t_name"> <br>
		날짜 : 
		<select name="t_y">
		<c:forEach var="y" begin="2022" end="2030">
			<option>${y }</option> 
		</c:forEach> 
		</select>
		년
		<select name="t_m"> 
			<c:forEach var="m" begin="1" end="12">
			<option>${m }</option>
			</c:forEach>
		</select>
		월
		<select name="t_d"> 
			<c:forEach var="dd" begin="1" end="31">
			<option>${dd }</option>
			</c:forEach>
		</select>
		일
		<br>
		<button>등록</button>
	</form>	
	<hr>
	${testr }
	<hr>
	<c:forEach var="t" items="${tests }">
		${t.t_name } : ${t.t_date }
		<fmt:formatDate value="${t.t_date }" type="date" dateStyle="long"/> <p>
	</c:forEach>
	
</body>
</html>





















































