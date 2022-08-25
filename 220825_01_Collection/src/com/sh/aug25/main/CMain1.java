package com.sh.aug25.main;

// 언어
//		조건문(if, switch)
//		반복문(for, while, do-while)
//		Java는 Collection (다른언어는 배열)
/////	
// 		객체지향
//		외부 라이브러리 활용
//		HTTP통신 - Parsing
/////
//	배열 : 하나의 변수에 데이터를 여러개 사용 가능
//		[	]
//		생성시 사이즈 고정
//		사이즈를 모르면 []을 만들지 못함
//		사이즈는 변경 불가능

// 컬렉션 (Collection) : Java에서 자료구조를 표현한 클래스를 지칭하는 용어
//						자료구조 (data structure) : 자료를 저장하기 위한 

// List 계열
//		사이즈 조절 가능 (가변 사이즈)
//		순서가 있는 구조, 중복요소 가능

// Set 계열 (잘 쓰이지 않음)
//		사이즈 조절 가능 (가변 사이즈)
//		중복요소는 자동삭제
//		순서가 무작위

// Map 계열
//		가변 사이즈
//		Key값, Value값이 한쌍
//			Key값을 불렀을 때 Value 값이 함께 불려옴
//		순서가 무작위


public class CMain1 {
	public static void main(String[] args) {
		int[][] score = { { 100, 50, 90 }, { 10, 90, 50 }, { 1, 2, 3 } };
		System.out.println(score[0][2]);
	}
}
