<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function getRandomColor() {
		// Math.random() 					-> 0.0 ~ 0.99999
		// Math.random() * 255				-> 0.0 ~ 254.99999
		// 색깔 rgb값은 0 ~ 255
		// Math.round(Math.random() * 255) 	-> 0 ~ 255
		// Math.round(); 반올림 함수
		let r = Math.round(Math.random() * 255);
		let g = Math.round(Math.random() * 255);
		let b = Math.round(Math.random() * 255);
		
		return "rgb(" + r + "," + g + "," + b + ")";
	} 
	// rgb값을 랜덤으로 가져오는 함수
	
	function init() {
		let cv = document.getElementById("cv"); // body쪽의 canvas를 호출
		let pen = cv.getContext("2d");			// 2d형태로 그릴 수 있는 펜
		let x = null;
		let y = null; 	// 좌표 (기본값)
		
		setInterval(() => {
			pen.save();							// 만들어 둔 pen의 상태를 저장
			pen.fillStyle = "rgba(0, 0, 0, 0.2)"	// rgb(0,0,0) 은 검정
													// a : 투명도 , 0 ~ 1사이의 값
			pen.fillRect(0, 0, 500, 500);		// (0,0)부터 (500,500) 까지의 범위
			pen.shadowOffsetX = 0;
			pen.shadowOffsetY = 0;	// 그림자 효과 삭제
			pen.shadowBlur = 5;
			pen.shadowColor = "white";	// 그림자 색
			
			x = Math.random() * 500;
			y = Math.random() * 500;
			pen.fillStyle = getRandomColor();
			pen.fillRect(x, y, 20, 20)
			
			pen.restore();	// 이전 설정으로
		}, 200);
	}
</script>
</head>
<body onload="init();">
	<canvas id="cv" width="500px" height="500px"></canvas> <!-- 도화지 -->
	<hr>
</body>
</html>







































































