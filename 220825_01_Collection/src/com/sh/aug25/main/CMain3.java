package com.sh.aug25.main;

import java.util.HashMap;
import java.util.Scanner;

public class CMain3 {
	public static void main(String[] args) {
		
		// 학생의 이름을 입력했을 때
		Scanner k = new Scanner(System.in);
		System.out.print("학생 이름 : ");
		String name = k.next();
		// 그 학생의 전체 정보 출력
		HashMap<String, Student> student = new HashMap<String, Student>();
		student.put("학생1", new Student("학생1", 100, 90 , 80));
		student.put("학생2", new Student("학생2", 80, 90 , 70));
		student.put("학생3", new Student("학생3", 100, 90 , 100));
		student.put("학생4", new Student("학생4", 700, 90 , 100));
		
		//입력한 학생 이름의 전체 정보
		student.get(name).printInfo();
		
	}
}
