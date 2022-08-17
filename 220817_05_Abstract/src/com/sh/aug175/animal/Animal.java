package com.sh.aug175.animal;

public abstract class Animal {
	private String species;
	private int age;
	//동물의 종, 나이
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String species, int age) {
		super();
		this.species = species;
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println(species);
		System.out.println(age);
	}
	
	// abstract Method : 미완성 메소드(내용이 없음)
	//					 어떤 내용이 들어가야하는지 모르는 경우
	// 	하위클래스에서 반드시 오버라이딩 해야함
	
	// abstract 메소드가 클래스에 하나라도 있다면
	//	abstract 클래스 or interface 여야 함
	public abstract void roar();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
