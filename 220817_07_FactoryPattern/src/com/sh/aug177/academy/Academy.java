package com.sh.aug177.academy;

// ���� ������ ���ִ� class
public class Academy {
	private int studentCount;
	
	public Student consult(String name, int age) {
		studentCount++;
		Student s = new Student(studentCount, name, age);
		return s;
	}
}
