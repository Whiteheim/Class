// 5. 연산자
// 산술 연산자 : +, -, *, /, %

// 거듭제곱
// let num1 = 2 ** 3;
// alert(num1);

// 우선순위
//	(*, /) > (+, -)

// 연산자를 줄여서 사용 가능
let num1 = 10;
//num1 = num1 + 5;
// => num1 += 5;

// 증감 연산자
let num2 = 20;
// num2++;
// document.write(num2); // 21 

// let result = num2++;
// document.write(result);	// 20

// let result = ++num2;
// document.write(result);		// 21

// -> num2++; : 증가전의 값을 result에 담음
// 	  ++num2; : 증가후의 값을 result에 담음

// 비교 연산자 (Java와 같음)
// <, >, <=, >=, ==, !=
document.write("---------------<br>");
document.write((10 > 5) + "<br>");
document.write((10 == 5) + "<br>");
document.write((10 < 5) + "<br>");
document.write("---------------<br>");

// "10"과 10이 같은지 확인
document.write(("10" == 10) + "<br>"); // true
	// 자동 형변환 때문에 true , 원래는 자료형이 달라 false
	
document.write(("10" === 10) + "<br>");	// false
	// => ===, !== : 일치 연산자
	//				 JS내에서만 존재
	//				 자료형 까지 비교해줌
	
// 논리연산자
// || (OR)
// 여러개의 값들 중, 하나라도 true 이면 , true 반환
//		-> 모든 값이 false일 때, false 반환
//	=> 첫번째 true값을 발견하는 즉시 수식 종료

// && (AND)
// 모든 값이 true일 때, true 반환
//		-> 하나라도 false 이면, false 반환
// => 첫번째 false값을 발견하는 즉시 수식 종료

// ! (NOT)
// 반대의 값을 반환
// true -> false / false -> true












































































