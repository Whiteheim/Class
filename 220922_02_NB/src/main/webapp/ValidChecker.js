// �߸��Ǿ��� �� true�� return 
// (�ڵ�� �Է��� ������ ����� true, �������̸� false)

// <input>
// �����̸� true, ���� ������ false
function isEmpty(input) {
	return (!input.value);
}

// <input>
// �ѱ� / Ư������ ����� true, ���ٸ� false
function containsAnother(input) {
	let pass = "1234567890abcdefghijklmnopqretuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ@_.";
	let iv = input.value; // �Է��� ��
	for (let i = 0; i < iv.length; i ++) {
		if(pass.indexOf(iv[i]) == -1){ // pass�� �ִ� ���� �� �Է¹��� ���� ������ true
			return true;
		}
	}
	return false;
}

// Parameter�� <input>, ���ڼ� �Է� ��
// �� ���� �� ���� ������ true, �� ���ڼ� �̻��̸� false
function atLeastLetter(input, len){
	return (input.value.length < len);
}

// <input>���� �ΰ� �Է½� (pw , pwȮ��)
// ������ �ٸ��� true, ������ false
function notEqualPw(input1, input2){
	return (input1.value1 != input2.value);
}

// <input>�� ���ڿ���Ʈ�� �Է����� ��
// ������ true, ������ false (�Է��� pw�� ������ ���ڿ��� ���� ���)
function notContain(input, passSet) {
	let iv = input.value;
	for (let i = 0; i < passSet.length; i++) {
		if (iv.indexOF(passSet[i]) != -1) {
			return false;
		}
	}
	return true;
}

// <input> �Է� ��
// ���ڰ� �ƴϸ� true, ���ڸ� �����ϸ� false
function inNotNumber(input) {
	return isNaN(input.value);
}

// <input>, Ȯ���� �Է½�
// �Է��� Ȯ���ڸ��� �ƴϸ� true, �Է��� Ȯ���ڸ��̸� false
function isNotType(input, type) {
	// .gif , .png , ...
	type = "." + type; // type �Է� �� �ڵ����� "." �Է�
	return (input.value.indexOf(type) == -1);
}




























































