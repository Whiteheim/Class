<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/oct24/writeComplite.page" method="post" enctype="multipart/form-data">
	<table>
		<tr>
			<td>작성자 <input type="text" name="b_author" readonly="readonly" value="${sessionScope.loginMember.s_nickName}"></td>
		</tr>
		<tr>
			<td>제목<input type="text" name="b_title"></td>
		</tr>
		<tr>
			<td><input type="file" value="이미지 첨부" name="b_img"></td>
		</tr>
		<tr>
			<td><textarea rows="3" name="b_content"></textarea></td>
		</tr>
	</table>
	<input type="hidden" name="b_date">
	<input type="hidden" name="b_thumb">
	<button>작성</button>
	</form>

</body>
</html>