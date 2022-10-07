<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/jQuery.js"></script>
<script type="text/javascript">
	$(function () {
		
		/* $.ajax({
			url: "error.getJSON",
			success: function(a) {
				// alert(a);
				// Object object => JavaScript객체 -> 문자열 그대로 변환 과능
				alert(JSON.stringify(a));
			}

		}); */
		
		// JSON -> AJAX simpler ver.
		// $.getJSON("요청주소?파라미터=값&...", 값을 받아오는데 성공하면 실행되는 콜백함수)
		$.getJSON("error.getJSON", function(a) {
			//alert(JSON.stringify(a));
			//let ar = a.error;  		// a.테이블명
			//alert(ar[0].e_where);
			
			//jQuery의 반복문
			$.each(a.error, function (i, e) {
				let td1 = $("<td></td>").text(e.e_what);
				let td2 = $("<td></td>").text(e.e_where);
				
				let tr = $("<tr></tr>").append(td1, td2);
				$("table").append(tr);
			});
		});
		
		// 버튼 클릭 -> input에 e_what에 대한 내용이 error테이블에 있으면
		// 		-> 그 데이터를 테이블의 형태로 출력
		
		$("button").click(function () {
			let eVal = $("input").val();
			$.getJSON("error.getSearchJSON?e_what=" + eVal, 
				function(zxc) {
					$("table").empty();
					$.each(zxc.error, 
						function(i, e) {
							let td1 = $("<td></td>").text(e.e_what);
							let td2 = $("<td></td>").text(e.e_where);
						
							let tr = $("<tr></tr>").append(td1, td2);
							$("table").append(tr);
					});
			});
		});
		
		$("input").keyup(function() {
			$("button").trigger("click");
		});
	});
</script>
</head>
<body>
	<input>
	<button>button</button>
	<hr>
	<table border=""></table>
</body>
</html>





















































