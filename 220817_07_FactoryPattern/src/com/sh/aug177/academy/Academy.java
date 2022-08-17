package com.sh.aug177.academy;

// 공장 역할을 해주는 class
public class Academy {
	private int studentCount;
	
	public Student consult(String name, int age) {
		studentCount++;
		Student s = new Student(studentCount, name, age);
		return s;
	}
}
