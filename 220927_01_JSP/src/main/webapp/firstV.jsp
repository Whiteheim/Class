<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function gogogo() {
		location.href = "SecondC?a=20&b=200";
	}
</script>
</head>
<body>
	<%
		// �����(Client)�� action�� ������ �� �̵� �ϴ� �� : ��û
		//			- <a> �±� ��� : Ŭ���ϸ� GET���
		//			- JS ��� : �̺�Ʈ�� �߰� ���� �� (�Լ� �ҷ����� ��) GET���
		//				(JS�� HTML�� ����°� ���� -> <form>�� ����� POST��ĵ� ������
		//			- <form> + <button> : ��ư�� Ŭ������ �� GET/POST ��� ����
	%>
	<h1>First</h1>
	d : ${sessionScope.d } <br>
	e : ${cookie.e.value } <br>
	<a href="SecondC?a=10&b=100">Second�� ����</a>
	<hr>
	<div onclick="gogogo();">Second�� ����</div>
	<hr>
	<form action="SecondC">
		<input name="a"> <br>
		<input name="b"> <br>
		<button>Second�� ����</button>
	</form>
</body>
</html>




































