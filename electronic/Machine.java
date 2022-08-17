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
		System.out.printf("제품명	: %s\n", name);
		System.out.printf("가격	: %d원\n", price);
	}
}
