package com.sh.aug177.academy;

public class Student {
	private int num;
	private String name;
	private int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.printf("%d번째 학생\n", num);
		System.out.printf("이름	: %s\n", name);
		System.out.printf("나이	: %d\n", age);
	}
		
	
}
