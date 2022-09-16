// 논리연산자, 비교연산자, 일치연산자의 결과값 true, false
// 6. 조건문
//	어떤 조건에 따라서 이후에 실행이 달라지게 함

// if문 (Java와 같다)
//	if절 괄호안에 조건을 따져서 true라면 실행
// if - else if - else

// switch-case
// 	case가 다양할 때, if문 보다 간결하게 표현 가능

// 사과 : 100원
// 바나나 : 200원
// 키위 : 300원
// 멜론 : 500원
// 수박 : 500원
// 사고 싶은 과일을 입력해서 그 가격을 출력 (alert)

let fruit = prompt("과일 하나 골라보시게");
switch (fruit) {
	case "사과" : 
		alert(`${fruit}는 100원`)
		break;

	case "바나나" :	
		alert(`${fruit}는 200원`)
		break;

	case "키위" : 
		alert(`${fruit}는 300원`)
		break;

	case "멜론" :
	case "수박" :
		alert(`${fruit}은 500원`)
		break;
	
	default : 
		alert(`${fruit}는 없다`)
		break;
}



































































