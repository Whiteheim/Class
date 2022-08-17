package com.sh.aug175.animal;

import com.sh.aug175.bite.Bite;

// Class끼리 다중 상속 불가 (무조건 1:1로만) Cat/ Animal 추가적인 extends 이용 불가
// Class + Interface는 다중상속 가능 Cat / Bite
//								implements	Bite, color, ear, ...etc
public class Cat extends Animal implements Bite {
	private int leg;

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String species, int age, int leg) {
		super(species, age);
		this.leg = leg;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(leg);
	}
	
	@Override
	public void roar() {
		System.out.println("냥");
	}
	
	@Override
	public void bite() {
		System.out.println("앙냥냥");
	}

}
