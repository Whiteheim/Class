package com.today.aug171.main;

import com.today.aug171.electronic.Computer;
import com.today.aug171.electronic.Scanner;

// package : 파일을 모아두는 폴더
public class Aug_17_Main1 {

	public static void main(String[] args) {
		// 매직스테이션, 80만원, i5-1234, 8GB, 500GB 컴퓨터
		Computer c = new Computer("매직스테이션", 800000, "i5-1234", 8, 500);
		c.printInfo();
		System.out.println("--------------------------");
		// 멀티 익스프레스, 50만원, 스캐너
//		Scanner s = new Scanner("멀티익스프레스", 500000);
//		s.printInfo();
		com.today.aug171.electronic.Scanner s 
			= new com.today.aug171.electronic.Scanner("멀티익스프레스", 500000);
		s.printInfo();

	}

}
