package com.sh.aug175.animal;

public abstract class Animal {
	private String species;
	private int age;
	//������ ��, ����
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
	
	// abstract Method : �̿ϼ� �޼ҵ�(������ ����)
	//					 � ������ �����ϴ��� �𸣴� ���
	// 	����Ŭ�������� �ݵ�� �������̵� �ؾ���
	
	// abstract �޼ҵ尡 Ŭ������ �ϳ��� �ִٸ�
	//	abstract Ŭ���� or interface ���� ��
	public abstract void roar();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
