<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(function () {
		$.getJSON("comment.getJSON", function(a) {
				/* alert(JSON.stringify(a));
				let ar = a.comment;
				alert(ar[0].r_writer); */
			$.each(a.comment, function (i, r) {
				let writer = $("<span></span>").text(r.r_writer);
				let comment = $("<p></p>").text(r.r_comment);
				let line = $("<hr>");
				let div = $("<div></div>").append(writer, comment, line);
				
				$("#commentBox").append(div);
			});
		});
		
	});
	
</script>
</head>
<body>
	<h3>${contentsDetail.b_title}</h3>
	<img class="image" src="resources/img/${contentsDetail.b_img }">
	<div>${contentsDetail.b_content }</div>
	<hr>
	<div id="commentBox"></div>
		<form action="/oct24/regComment.page" method="post" target="iframe" onsubmit="location.reload()">
		<iframe name="iframe" style="display: none;" ></iframe>		
		<textarea rows="3" name="r_comment" id="comment"></textarea>
		<input type="hidden" name="r_writer" id="writer" value="${sessionScope.loginMember.s_nickName }">
		<button id="replyBtn">댓글 입력</button>
	</form>
</body>
</html>























