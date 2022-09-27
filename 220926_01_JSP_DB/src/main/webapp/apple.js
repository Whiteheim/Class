function goAppleDetail(loc) {
	location.href = "AppleDetailController?a_location=" + loc; // 값을 가지고 이동 // GET방식 요청
}

function deleteApple(loc) {
	let t = confirm("정말 삭제하시겠습니까?");
	if (t) {
	location.href = "AppleDeleteController?a_location=" + loc;	
	}
}
