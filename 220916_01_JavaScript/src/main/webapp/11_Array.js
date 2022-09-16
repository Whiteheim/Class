// 11. 배열
// 순서가 있는 리스트
let students = ["곽두팔", "이춘식", "김춘삼"];
console.log(students[1]); 
// 인덱스는 0부터 시작

// 배열은 문자뿐만 아니라 숫자, 객체, 함수 등 모든것을 포함 가능
let arr = [
	"비버",
	3,
	false,
	{
		name : "뜨또",
		age : 7,
	},
	function() {
		console.log("Test");
	}
]
console.log(arr);

// length : 배열의 길이
console.log(students.length);

let days = ["월", "화", "수"];
console.log(days);

// push() : 배열 끝 요소 추가
days.push("목");
console.log(days);

// pop() : 배열 끝 요소 제거
days.pop();
console.log(days);

// shift(), unshift() : 배열의 제일 앞에 있는 요소 제거 / 추가
days.unshift("일");
console.log(days);

days.shift();
console.log(days);

// unshift() / push() 는 여러개의 요소들을 추가 가능
days.unshift("목", "금", "토")
console.log(days);

// 배열을 쓰는 가장 큰 이유 => 반복문을 사용하기 위해
for (let i = 0; i < days.length; i++) {
	console.log(days[i]);
}
console.log("------------------");

// for .. of (Java의 for-each)
for (let day of days) {
	console.log(day);
}






























































































