function goAppleDetail(loc) {
	location.href = "AppleDetailController?a_location=" + loc; // ���� ������ �̵� // GET��� ��û
}

function deleteApple(loc) {
	let t = confirm("���� �����Ͻðڽ��ϱ�?");
	if (t) {
	location.href = "AppleDeleteController?a_location=" + loc;	
	}
}
