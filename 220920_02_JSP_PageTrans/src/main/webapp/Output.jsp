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
		// ���� rgb���� 0 ~ 255
		// Math.round(Math.random() * 255) 	-> 0 ~ 255
		// Math.round(); �ݿø� �Լ�
		let r = Math.round(Math.random() * 255);
		let g = Math.round(Math.random() * 255);
		let b = Math.round(Math.random() * 255);
		
		return "rgb(" + r + "," + g + "," + b + ")";
	} 
	// rgb���� �������� �������� �Լ�
	
	function init() {
		let cv = document.getElementById("cv"); // body���� canvas�� ȣ��
		let pen = cv.getContext("2d");			// 2d���·� �׸� �� �ִ� ��
		let x = null;
		let y = null; 	// ��ǥ (�⺻��)
		
		setInterval(() => {
			pen.save();							// ����� �� pen�� ���¸� ����
			pen.fillStyle = "rgba(0, 0, 0, 0.2)"	// rgb(0,0,0) �� ����
													// a : ���� , 0 ~ 1������ ��
			pen.fillRect(0, 0, 500, 500);		// (0,0)���� (500,500) ������ ����
			pen.shadowOffsetX = 0;
			pen.shadowOffsetY = 0;	// �׸��� ȿ�� ����
			pen.shadowBlur = 5;
			pen.shadowColor = "white";	// �׸��� ��
			
			x = Math.random() * 500;
			y = Math.random() * 500;
			pen.fillStyle = getRandomColor();
			pen.fillRect(x, y, 20, 20)
			
			pen.restore();	// ���� ��������
		}, 200);
	}
</script>
</head>
<body onload="init();">
	<canvas id="cv" width="500px" height="500px"></canvas> <!-- ��ȭ�� -->
	<hr>
</body>
</html>







































































