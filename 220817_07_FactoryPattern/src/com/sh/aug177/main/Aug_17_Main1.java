package com.sh.aug177.main;

import com.sh.aug177.academy.Academy;
import com.sh.aug177.academy.Student;

// 학원에서 학생을 상담한 후 해당 커리큐럼 대기자로 등록하려고 함
// 학생의 정보는 이름 / 나이
// 등록순서대로 번호 부여

// 객체가 필요 없는 경우 : static 메소드 기반
// 객체가 필요한 경우
// 		하나 필요한 경우 : Singleton 패턴 (static final)
//		여러개 : 
//				대량생간, 자동화된 : Factory 패턴
//		나머지 : 평소 하던 방식

public class Aug_17_Main1 {
	public static void main(String[] args) {
		Academy ac = new Academy();
		
		Student s1 = ac.consult("김", 15);
		s1.printInfo();
		System.out.println("==============");
		Student s2 = ac.consult("나", 15);
		s2.printInfo();
		System.out.println("==============");
		Student s3 = ac.consult("박", 15);
		s3.printInfo();
		System.out.println("==============");
		Student s4 = ac.consult("이", 15);
		s4.printInfo();
		
	}
}
