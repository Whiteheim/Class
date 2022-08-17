package com.sh.aug175.animal;

import com.sh.aug175.bite.Bite;

// Class���� ���� ��� �Ұ� (������ 1:1�θ�) Cat/ Animal �߰����� extends �̿� �Ұ�
// Class + Interface�� ���߻�� ���� Cat / Bite
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
		System.out.println("��");
	}
	
	@Override
	public void bite() {
		System.out.println("�ӳɳ�");
	}

}
