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
			alert("빈칸을 채워주시오.");
			return false;
	}
	
	if (notEqualPw(pw, pwCheck)) {
		alert("비밀번호가 일치하지 않습니다.");
		pw.value="";
		pwCheck.value="";
		pw.focus;
		return false;
	}
	
	if (isNotType(image, jpg) || 
		isNotType(image, gif) ||
		isNotType(image, png)) {
		alert("그림파일만 가능합니다.");
		return false;
	}
	
}