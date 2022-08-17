package com.sh.aug173.main;

//ĸ��ȭ(Encapsulation)
//		��������� ������ �� �ִ� ��θ� ����� �� ��ο� ������ġ�� ����� ����
//		�ܺο� ���� �� �ʿ䰡 ���� �������� ĸ��ȭ �Ͽ� ���н�Ű�� ���
//		ĸ��ȭ / ����ȭ
public class Person {
	private String name;		// �������� �ܺ� ������ �����ϱ� ���� private
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

	public void setName(String name) { //���� �ϴ� ���� (set)
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	// setXXX : �ܺ��� ������ ���ѵ� XXX�� ������ �� ����
	// set�� �̿��� ���Ǻ��� ����
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
