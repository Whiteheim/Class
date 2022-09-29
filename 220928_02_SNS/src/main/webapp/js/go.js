function go() {
	location.href = "JoinController";
}

function home() {
	location.href = "HomeController";
}

function logout() {
	let check = confirm("로그아웃 하시겠습니까?");
	if (check) {
	location.href = "LoginController";
		
	}



}
