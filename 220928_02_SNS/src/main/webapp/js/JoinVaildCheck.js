function joinCheck() {
	let id = document.signupForm.m_id;
	let pw = document.signupForm.m_pw;
	let pwCheck = document.signupForm.m_pwCheck;
	let pN = document.signupForm.m_phoneNum;
	let birthDay = document.signupForm.m_bd;
	let image = document.signupForm.m_picture;
	
	if (isEmpty(id) || containsAnother(id) || 
		isEmpty(pw) || containsAnother(pw) ||
		isEmpty(pwCheck) || containsAnother(pwCheck) ||
		isEmpty(pN) || containsAnother(pN) ||
		isEmpty(birthDay) || containsAnother(birthDay) ||
		isEmpty(image) || containsAnother(image)
		) {
			alert("��ĭ�� ä���ֽÿ�.");
			return false;
	}
	
	if (notEqualPw(pw, pwCheck)) {
		alert("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		pw.value="";
		pwCheck.value="";
		pw.focus;
		return false;
	}
	
	if (isNotType(image, jpg) || 
		isNotType(image, gif) ||
		isNotType(image, png)) {
		alert("�׸����ϸ� �����մϴ�.");
		return false;
	}
	
}