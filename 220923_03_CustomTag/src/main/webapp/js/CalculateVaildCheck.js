function calculate() {
	let a = document.calculate.num1;
	let b = document.calculate.num2;
	alert(a);
	alert(b);
	if (isEmpty(a) || inNotNumber(a) ||
		isEmpty(b) || inNotNumber(b)) {
		alert("���� �Է��� �ּ���");
		a.value = "";
		b.value = "";
		
		return false;
	}
	
	return true;
}