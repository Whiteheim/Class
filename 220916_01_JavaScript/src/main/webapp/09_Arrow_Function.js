// 9. 화살표 함수 (Arrow Function)

// 8번 파일에서 다룬 함수를 '함수 선언문' 이라고 함
/*
function sayHello() {
	console.log("Hello");
}
sayHello();
*/

// '함수 표현식' 이라고 함
/*
let sayHello = function() {
	console.log("Hello");
}
sayHello();
*/

// '함수 선언문' vs '함수 표현식'
// - 함수 호출 타이밍이 다름
// 함수 선언문은 스크립트 파일 내 어디서든지 호출해서 사용가능

sayHello();
function sayHello() {
	console.log("Hello");
}

// JS는 프로그램 실행 전, 모든 '함수선언문'을 찾아 한 곳에 모아둠
// 메모리에 모아둔 '함수선언문'을 저장하고 있다가 필요시에 
// 내부적으로 끌어올려 사용
// 저장 되어있는 상태 -> 함수가 먼저 호출이 되어도 오류없이 작동 가능
// 실제적으로 코드가 끌어올리지는 않고, 실제 메모리 상에도 변화는 없음
// 이런 형태를 '호이스팅(Hoisting)'*** 이라고 함

// '함수표현식'은 코드에 도달하면 생성
// 둘 중 하나를 골라 사용하기 보다 편한거 사용
// 

// 화살표 함수
// 여지껏 봤던 함수들 보다 더 간결하게 작성할 수 있는 함수

// 1.
/*
let add = function(num1, num2) {
	return num1 + num2;
}
*/

// 2.
/*
let add = (num1, num2) => {
	return num1 + num2;
}
*/

// 3. return 생략
/*
let add = (num1, num2) => {
	num1 + num2;
}
*/

// 4. 반환할 코드가 한 줄 일때, 중괄호 생략 가능
let add = (num1, num2) => num1 + num2;

// 5. 파라미터가 하나 일 때, 파라미터가 들어갈 소괄호 생략 가능
let sayHello2 = name => `Hello, ${name}`;

// 6. 파라미터가 없는 함수라면, 괄호 생략 불가

// Function vs Method

// Method : 객체 프로퍼티(속성)로 할당 된 함수
let human = {
	name : "홍길동",
	walk : function() {
		console.log("샤샤샥");
	}
}























































































