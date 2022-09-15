// 2. 자료형
// ▶ 문자형 String

let name1 = "Heim";
let name2 = 'Heim';
let name3 = `Heim`; // 억음 부호, tab키 위에 있는 키 ``(backtick)

let message1 = "I'm a boy.";
let message2 = 'I\'m a boy.'; // 작은 따옴표 사용 시 \ 역 슬래시를 넣어
							  // '를 특수문자로 인식하도록 해야함
							  
// 문자열 내부에 변수를 표현할 때 사용하는 Backtick
//	${변수명}
let message3 = `my name is ${name1}`;
document.write(message3 + '<br>');
let message4 = "my name is ${name2}"
document.write(message4 + '<br>'); // ${name2}라는 문자열이 그대로 노출

// 계산 (표현식) 사용 가능
let message5 = `I have ${100+1000}won.`;
document.write(message5 + '<br>');
document.write("-----------------<br>")

// ▶ 숫자형 Number (정수 / 실수)
let age = 100;			
let height = 180.4;

// 사칙연산 가능
document.write(1 + 2 + "<br>"); // 더하기			 
document.write(1 - 2 + "<br>");	// 빼기
document.write(1 * 2 + "<br>");	// 곱하기 
document.write(1 / 2 + "<br>");	// 나누기		 
document.write(6 % 4 + "<br>");	// 나눈 나머지		 

let a = 1 / 0;
document.write(a + "<br>"); // Infinity (무한대)

let b = name1 / 2;
document.write(b + "<br>"); // NaN (Not a Number) : 노 숫자
document.write("-----------------<br>")

// + 연산을 통해 글자끼리 이어주기도 가능
let aa = "나는";
let bb = "  입니다.";
document.write(aa + name1 + bb + "<br>");
document.write(aa + age + "살" + bb + "<br>");
document.write("-----------------<br>")

// ▶ 논리형 Boolean
let c = true;	// 참
let d = false;	// 거짓

document.write((name1 == "Heim") + "<br>");
document.write((age < 20) + "<br>");
document.write("-----------------<br>")

// ▶ null, undefined
let e;
document.write(e + "<br>"); // undefined : 값이 할당되지 않은 상태

let f = null;
document.write(f + "<br>"); // null : 존재하지 않는 값
document.write("-----------------<br>")

// ▶ typeof 연산자 : 변수의 자료형을 알아낼 때 사용
// 직접 코드를 짰을 때는 필요 없는 연산자
// 다른 개발자가 만든 코드의 변수에 대한 데이터 타입 (자료형)을 알아야 할 때 사용
// or API를 통해 받아온 데이터의 자료형을 아라내서 다른 방식으로 처리해야 할 때 사용
document.write(typeof name1 + "<br>");
document.write(typeof age + "<br>");
document.write(typeof c + "<br>");
document.write(typeof e + "<br>");
document.write(typeof f + "<br>");		// Object -> JS의 첫 버그 
document.write("-----------------<br>")






















































