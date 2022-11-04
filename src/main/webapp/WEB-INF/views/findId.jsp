<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/jQuery.js"></script>
<script type="text/javascript">
	$(function() {
		$('#findIdBtn').click(function() {
			let mailVal = $("#mailInput").val();
		
			$.ajax({
				url : "siteMember.getIdXml",
				data : {s_mail : mailVal},
				success : function(a) {
					let id = $(a).find("s_id").text();
					if (id != null) {
						if (!mailVal) {
							alert('메일을 입력해 주세요');
						} else {
							alert("ID는 " + id + " 입니다.");
						}
					}
				}
				});
			});
		});
</script>
</head>
<body>
	이메일 :
	<input type="email" id="mailInput">
	<br>
	<input type="submit" value="찾기" id="findIdBtn">
</body>
</html>