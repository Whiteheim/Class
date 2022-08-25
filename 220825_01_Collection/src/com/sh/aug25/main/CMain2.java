package com.sh.aug25.main;

import java.util.ArrayList;
import java.util.Scanner;

public class CMain2 {
	public static void main(String[] args) {
		// 학생 객체 - 이름, 국어점수, 영어점수, 수학점수 + 출력기능
	
		// 학생의 번호를 입력하면 그 학생의 정보를 출력
		Scanner k = new Scanner(System.in);
		System.out.print("학생번호(1~4)");
		int no = k.nextInt();
		// 사용해야할 Collection은? -> map? List!
		
		// 학생 4명 생성
		ArrayList<Student> school = new ArrayList<Student>();
		school.add(new Student("학생1", 100, 90 , 80));
		school.add(new Student("학생2", 80, 90 , 70));
		school.add(new Student("학생3", 100, 90 , 100));
		school.add(new Student("학생4", 700, 90 , 100));
		
		// 해당 번호 학생의 전체정보가 출력
		school.get(no - 1).printInfo();
		System.out.println("-----------------");
		
		// 해당 번호 학생의 영어점수만 출력
		System.out.println("영어점수 : " + school.get(no - 1).getEng() + "점");
		System.out.println("-----------------");
		// 전체 학생의 정보
		for (int i = 0; i < school.size(); i++) {
			//번지값
			System.out.println(school.get(i));
			//전체정보
			school.get(i).printInfo();
			System.out.println("-----------------");
		}
	}
}
