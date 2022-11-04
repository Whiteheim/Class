
// a 태그 클릭 시 post방식으로 전송

function goPost() {
	let f = document.createElement('form'); // 페이지에 form 기능 만들기
	f.setAttribute('method','post'); // form 에 post방식 적용하기
	f.setAttribute('action', '/oct24/login.page'); // 클릭 시 넘어갈 페이지 설정
	document.body.appendChild(f); // 페이지 -> body -> f를 상속
	f.submit();
}

function reload() {
	location.reload();
};
