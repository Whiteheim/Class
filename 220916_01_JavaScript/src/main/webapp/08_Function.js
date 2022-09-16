// 8. 함수(Function)
//	서비스를 만들다 보면 기능이 같거나, 비슷한 기능이 생김
//		ex) 팝업창, 결제 등등
//	매번 새롭게 기능을 만들 수 없으니 자주 사용하는 기능들을 하나로 묶어 사용하기 위해 만듬

//function 함수명(파라미터){
//		내용	
//}
// 의 형태이고, 함수명(파라미터); 로 호출 가능

// 파라미터 없는 함수
function showError(){
	alert("Error");
}
showError();
// 이 메시지를 하나의 서비스 중 여러곳에서 사용 한다면
// ex) 로그인 실패, 결제 실패 등
// 위의 showError(); 를 불러다 쓰면 가능

// 파라미터 있는 함수
/*
function sayHello(name){
	let msg = `Hello, ${name}`;
	alert(msg);
}
sayHello("김김김");

// 파라미터를 입력하지 않은경우
sayHello(); // undefined
*/

/*
function sayHello(name){
	let msg = "Hello";
	if (name) {
		msg += `,${name}`;
	}
	alert(msg);
}
sayHello();
sayHello("ddd");*/

let msg = "Hello"; // 어디서나 접근 가능한 변수 : 전역변수
console.log("함수 호출 전"); 
console.log(msg); 

function sayHello(name){
	let msg = "Hello";
	if (name) {
		msg += `,${name}`;
	}
	console.log("함수 내부");
	// 함수 내부에서 접근 가능한 변수 : 지역변수
	console.log(msg); 
}

sayHello("이김박");
console.log("함수 호출 후");
console.log(msg); 
// 지역변수는 함수 내에서 전역변수와 같은 이름 작명 가능
// 지역변수와 전역변수는 서로 간섭 받지 않음

// 전역변수가 많아진다면 관리하기 까다로워짐
//		=> 가능한 함수에 특화된 지역변수 사용

// OR을 활용하여 기본값 넣기
function sayHello2(name){
	let newName = name || 'Friend';
	let msg = `Hello, ${newName}`;
	console.log(msg);
}
sayHello2();			// 값 미입력
sayHello2("홍길동");	// 값 입력

// 기본값을 설정해서 (default value)
function sayHello3(name = 'Friend') {
	let msg = `Hello, ${name}`
	console.log(msg);
}
sayHello3();
sayHello3("홍길동");

// return 으로 값 반환하기
function add(num1, num2) {
	return num1 + num2;
}

let result = add(2, 3);
console.log(result);
// return은 값의 반환과 동시에 함수를 종료하는 기능을 가짐

// 정리 
//	- 함수는 한번에 하나의 작업만 진행하는것을 추천
//		-> 하나의 함수가 여러 작업을 진행한다면
//			여러 함수로 구현하기
//	- 함수명은 읽기 쉽고, 어떤 기능인지 알 수 있게 작명













































































