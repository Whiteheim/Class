package com.sh.aug175.main;

import com.sh.aug175.animal.Cat;

public class Aug_17_Main6 {
	public static void main(String[] args) {
		// 추상화 (Abstraction) : 공통의 속성이나 기능을 묶어서 이름을 붙이는 것
	Cat c = new Cat("고양이과", 2, 4);
	c.printInfo();
	c.roar();
	c.bite();
	}
}
