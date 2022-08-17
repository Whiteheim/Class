package com.sh.aug175.main;

import com.sh.aug175.avengers.Avenger;
import com.sh.aug175.avengers.Ironman;

public class Aug_17_Main7 {
	// Avengers class
	// 이름, 나이 속성
	// 공격 기능
	public static void main(String[] args) {
		
		// Avenger로 부터 상속받은 
		// 클래스명은 알수없음
		// 내부에 만들어 놓은 클래스
		
		// 익명 내부 클래스 (anonymous inner class) 라고 명명 
		
		Avenger a = new Avenger() { // 중괄호 안쪽 부분 = 클래스 부분
			
			@Override
			public void attack() {
				System.out.println("거미줄 스윙");
			}
		};
		
		a.printInfo();
		a.attack();
		System.out.println("----------------");
		// 아이언맨은 어벤져스
		// 재산 속성
		// 공격은 리펄서 빔
		// 흡연 o
		// 운전 o
		Ironman i = new Ironman("또니", 52, 1000000000);
		i.printInfo();
		i.attack();
		i.drive();
		i.smoke();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
