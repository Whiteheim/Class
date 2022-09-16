// 10. 객체(Object)

// 강사님의 강아지 '마루', 3살
let dog = {
	name : "마루",
	age : 3,
}
// 객체는 중괄호 안에서 구성되며, key와 value값으로 구성된 프로퍼티(속성)가 들어감
// 각각 쉼표로 구분하고, 마지막엔 쉼표 생략 가능
// 추 후 수정할 것까지 생각하여 쉼표를 적어놓는것도 추천

// 접근
console.log(dog.name);
console.log(dog['age']);

// 추가
dog.gender = "Male";
dog["furColor"] = "White";

// 삭제
delete dog.furColor;
////////////////////////////////////////////////////////

// 단축 프로퍼티
let name = "Beaver";
let age = 5;

/*let person = {
	name : name,
	age : age,
	gender : "Male",
}*/ 
// 이렇게 표현 가능 => 더 축약 시키면

let person = {
	name,
	age,
	gender : "Male",
}
// 이렇게 표현 가능 (이 때, key와 value에서 받아올 변수의 이름이 같아야 함)

// 존재하지 않는 속성에 접근하면, 에러가 발생하지 않고 undefined값이 나옴

// 이 때, 'in' 연산자를 사용하면 내가 찾는 속성이 있는지 확인 가능
// in : 어떤 값이 있는지 확인하기 위해 사용
console.log('birthday' in person);	// false
console.log('age' in person);		// true	

for (let key in person) {
	console.log(key);			// key값
	console.log(person[key]);	// value값
}

// 함수로 객체 만들기 
function makeObject(name, age) {
	return {
		name,
		age,
		hobby : "Playing Game",
	}
}

let beaver = makeObject("Beaver", 5);
console.log(beaver);











































































