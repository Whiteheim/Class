package com.today.aug171.electronic;

public class Machine {
	String name;
	int price;
	
	public Machine() {
		// TODO Auto-generated constructor stub
	}

	public Machine(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.printf("��ǰ��	: %s\n", name);
		System.out.printf("����	: %d��\n", price);
	}
}
