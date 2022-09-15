// 3. 대화상자 (DialogBox)
// alert, prompt, confirm

// alert : 알림 (일방적인 경고창)
alert("장비가 정지되었습니다");

// prompt : 값을 입력받을 수 있음
let name = prompt("너의 이름은?");
alert(`안녕하세요, ${name}님. 반갑습니다.`)
// prompt에 값을 넣지 않고 확인 => 공백
// prompt에 값을 넣지 않고 취소 => null

// prompt값에는 default 값도 넣을 수 있음
// 값을 입력할 때, 안내하거나 힌트를 주는 역할도 가능
// 2개의 파라미터를 가질 수 있음 (출력용 메세지, 입력용 default값)
let reservation = prompt("예약일을 입력해주세요.","2022-09-16");

// confirm : 확인 받을 때 사용
// 값 : 확인 -> true / 취소 -> false
let isAdult = confirm("당신은 성인입니까?")
alert(isAdult);

// 정리
	alert("와!"); 		// 메시지 출력 기능
	prompt("저메추"); 	// 메시지 출력, 입력 기능
	confirm("귀소본능?")// 사용자에게 확인받는 기능
	
// 단점
//	1. 실행시 창이 떠 있는 동안은 스크립트가 일시적으로 정지
//	2. DialogBox는 스타일링 불가 (위치, 모양 등 수정 불가)
//	3. 브라우저마다 모양이 제각각 다름

// 장점
//	빠르고 간단하게 적용가능 -> 광범위하게 많이 사용
































