// 4. 형 변환

// String()		-> 문자형으로 변환
// Number()		-> 숫자형으로 변환
// Boolean()	-> 논리형으로 변환

// 형 변화의 존재 이유
//	자료형이 다른 두 변수를 계산 했을 때, 원하는 결과가 나오지 않을 가능성이 있음

// 수학, 영어점수를 입력 받아 평균 점수를 출력해주는 프로그램
// 출력은 document.write();

let math = prompt("수학점수");
let eng = prompt("영어점수");
let avg = (math + eng) / 2;
document.write("평균점수 : " + avg + "<br>"); // 덧셈이 안됨

let math2 = 80;
let eng2 = 90;
let avg2 = (math2 + eng2) / 2;
document.write("평균점수 : " + avg2 + "<br>"); 

// prompt로 받은 값은 무조건 문자형 (String)
// "80" + "90" = 170 (x)/ "80""90" (0)
// "80""90" / 2 = 4045 로 나뉘어짐
// "80""90" 은 문자열인데 계산이 됨
//		숫자형이 아니더라도 표현식 (+ - * /)을 활용하여 데이터를 숫자형으로 변환할 수 있다면 
//		자동으로 숫자형태로 형 변환이 되어 계산이 됨
// 		"자동 형 변환"

// 자동 형 변환
// 편해 보이지만 원인을 찾기 힘든 에러 발생 가능성 높음
//		=> 의도적으로 원하는 타입(자료형)으로 변환시켜 사용하는것이 좋음
//			'명시적 형 변환'

// String() : S는 대문자 사용 / 괄호안의 값을 문자형으로 변환
document.write("String() <br>");
document.write(
	String(3) + "<br>",
	String(true) + "<br>",
	String(false) + "<br>",
	String(null) + "<br>",
	String(undefined) + "<br>",
	);
document.write("-----------------<br>");

// Number() : N은 대문자 사용 / 괄호안의 값을 숫자형으로 변환
document.write("Number() <br>");
document.write(
	Number("1234") + "<br>",	// 1234
	Number("asdf") + "<br>",	// NaN (Not a Number)
	Number(true) + "<br>",		// 1
	Number(false) + "<br>",		// 0
	);
document.write("-----------------<br>");

// Boolean() : B는 대문자 사용 / 괄호안의 값을 논리형으로 변환

// false가 되는 값 숙지
//	- 숫자 0
//	- 빈 문자열("") / 띄어쓰기 x
//	- null
//	- undefined
//	- NaN
//	이 외에는 모두 true

// 주의 사항
Number(null);		// 0
Number(undefined);	// NaN

let a = Number(prompt("asdf"));
document.write(a + "<br>"); // prompt에 값을 넣지 않았다면?
							// => 값을 넣지 않아 null 값 출력
							// => Number(null); => 0
























