package com.sh.aug176.main;

import com.sh.aug176.someone.Someone;

// 원하는 객체 하나 생성
// 이름, 나이, 별명 속성
// 출력

// 패턴프로그래밍
// 			싱글톤패턴 *** 상수에 final 사용

public class Aug_17_Main1 {
	public static void main(String[] args) {
//		Someone s = new Someone("홍길동", 30, "홍동길");
//		s.printInfo();
//		System.out.println(s);
//		System.out.println("-------------------");
//		Someone s2 = new Someone("홍길동", 30, "홍동길");
//		s.printInfo();
//		System.out.println(s2);
		
		Someone s = Someone.getSomeone();
		s.printInfo();
		System.out.println(s);
		System.out.println("--------------------");
		Someone s2 = Someone.getSomeone();
		s.printInfo();
		System.out.println(s2);
		System.out.println("--------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
