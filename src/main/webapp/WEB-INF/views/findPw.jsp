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
		$("#findPwBtn").click(function() {
				let idVal = $("#idInput").val();
				let mailVal = $("#mailInput").val();
				$.ajax({
					url: "siteMember.getPwXml",
					data: {s_id: idVal, s_mail: mailVal},
					success: function(a) {
						let pw = $(a).find("s_pw").text();
						if (pw != null) {
							if (!idVal || !mailVal) {
								alert('정보를 입력해 주세요');
							} else {
								alert("비밀번호는 " + pw + " 입니다.");
							}
						} 
					}
				});
		});
		});
</script>
</head>
<body>
	아이디<input id="idInput"> <br> 
	이메일<input id="mailInput"> <br>
	<input type="submit" value="찾기" id="findPwBtn">
</body>
</html>