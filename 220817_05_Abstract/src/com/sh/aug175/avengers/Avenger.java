package com.sh.aug175.avengers;

public abstract class Avenger {
	private String name;
	private int age;
	
	public Avenger() {
		// TODO Auto-generated constructor stub
	}

	public Avenger(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}

	public abstract void attack();
}
