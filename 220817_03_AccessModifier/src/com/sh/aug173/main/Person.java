package com.sh.aug173.main;

//캡슐화(Encapsulation)
//		멤버변수에 접근할 수 있는 통로를 만들고 그 통로에 안전장치를 만드는 개념
//		외부에 노출 할 필요가 없는 정보들은 캡슐화 하여 은닉시키는 기능
//		캡슐화 / 은닉화
public class Person {
	private String name;		// 변수들의 외부 노출을 제한하기 위해 private
	private int age;
	private double weight;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) { //변경 하는 내용 (set)
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	// setXXX : 외부의 접근이 제한된 XXX를 가공할 수 있음
	// set을 이용해 조건변경 가능
	public void setAge(int age) {
		if (age < 0) {
			age *= -1;
		}
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
