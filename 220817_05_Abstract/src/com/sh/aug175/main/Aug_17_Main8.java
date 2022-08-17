package com.sh.aug175.main;

import com.sh.aug175.avengers.Avenger;
import com.sh.aug175.avengers.Ironman;

// 다형성 (Polymorphism)
// Poly (많은) + Morph(모양)
// 상위타입 변수에 하위타입 객체를 담는것이 가능
// 같은 형태지만 다른 기능을 할 수 있음 (overriding과 밀접한 관련이 있음)

public class Aug_17_Main8 {
	public static void main(String[] args) {
		// 아이언맨을 담는 그릇 i에 아이언맨을 만들어 넣음
		Ironman i = new Ironman("man", 1, 23);
		i.printInfo();
		// 어벤져스를 담는 그릇 a에 아이언맨을 만들어 넣음 
		Avenger a = new Ironman("man", 1, 23);
		a.printInfo();
	}
}
