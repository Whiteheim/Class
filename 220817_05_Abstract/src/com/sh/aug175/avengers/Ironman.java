package com.sh.aug175.avengers;

import com.sh.aug175.behave.Drive;
import com.sh.aug175.behave.Smoke;

public class Ironman extends Avenger implements Smoke, Drive{
	private int money;
	
	public Ironman() {
		// TODO Auto-generated constructor stub
	}

	public Ironman(String name, int age, int money) {
		super(name, age);
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(money);
	}
	@Override
	public void attack() {
		System.out.println("리펄서레이");
	}
	
	@Override
	public void drive() {
		System.out.println("운전가능");
	}

	@Override
	public void smoke() {
		System.out.println("애연가");
	}

}
