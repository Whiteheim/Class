package com.sh.aug176.someone;

public class Someone {
	private String name;
	private int age;
	private String nickname;
	
	private static final Someone SOMEone =  new Someone("È«±æµ¿", 30, "È«µ¿±æ");
	
	public Someone() {
		// TODO Auto-generated constructor stub
	}

	public Someone(String name, int age, String nickname) {
		super();
		this.name = name;
		this.age = age;
		this.nickname = nickname;
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
		if (age < 0) {
			age *= - 1;
		}
		this.age = age;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public static Someone getSomeone() {
		return SOMEone;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(nickname);
	}

	
	
}
