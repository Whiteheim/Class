function go() {
	location.href = "JoinController";
}

function home() {
	location.href = "HomeController";
}

function logout() {
	let check = confirm("�α׾ƿ� �Ͻðڽ��ϱ�?");
	if (check) {
	location.href = "LoginController";
		
	}



}
