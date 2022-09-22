// 잘못되었을 때 true값 return 
// (코드상 입력이 문제가 생기면 true, 정상적이면 false)

// <input>
// 공백이면 true, 값이 있으면 false
function isEmpty(input) {
	return (!input.value);
}

// <input>
// 한글 / 특수문자 존재시 true, 없다면 false
function containsAnother(input) {
	let pass = "1234567890abcdefghijklmnopqretuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ@_.";
	let iv = input.value; // 입력한 값
	for (let i = 0; i < iv.length; i ++) {
		if(pass.indexOf(iv[i]) == -1){ // pass에 있는 내용 중 입력받은 값이 없으면 true
			return true;
		}
	}
	return false;
}

// Parameter에 <input>, 글자수 입력 시
// 그 글자 수 보다 적으면 true, 그 글자수 이상이면 false
function atLeastLetter(input, len){
	return (input.value.length < len);
}

// <input>값을 두개 입력시 (pw , pw확인)
// 내용이 다르면 true, 같으면 false
function notEqualPw(input1, input2){
	return (input1.value1 != input2.value);
}

// <input>에 문자열세트를 입력했을 때
// 없으면 true, 있으면 false (입력한 pw에 지정한 문자열이 없는 경우)
function notContain(input, passSet) {
	let iv = input.value;
	for (let i = 0; i < passSet.length; i++) {
		if (iv.indexOF(passSet[i]) != -1) {
			return false;
		}
	}
	return true;
}

// <input> 입력 시
// 숫자가 아니면 true, 숫자만 존재하면 false
function inNotNumber(input) {
	return isNaN(input.value);
}

// <input>, 확장자 입력시
// 입력한 확장자명이 아니면 true, 입력한 확장자명이면 false
function isNotType(input, type) {
	// .gif , .png , ...
	type = "." + type; // type 입력 시 자동으로 "." 입력
	return (input.value.indexOf(type) == -1);
}




























































