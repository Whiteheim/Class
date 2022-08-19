package com.sh.aug19.main;

import java.io.FileReader;
import java.io.InputStreamReader;

import com.sh.aug19.calculate.Calculator;
import com.sh.aug19.calculate.Costpergram;

// Java
//		예외처리가 강제
// Python
//		처리하기 싫으면 안해도 됨

public class Aug_19_Main3 {
	public static void main(String[] args) {
		// txt파일을 받아와서 작업 할 예정
		// txt파일을 지웠거나, 없는 파일이라면?
		try {
			FileReader fr = new FileReader ("C:\\Users\\user\\Desktop\\JavaDoc/test.txt");
			System.out.println(fr.read());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 가격 / 무게(g)를 입력받아 (정수)
		// g당 가격이 얼마인지 출력
		// 기능에 대한것은 Class하나 열어서 구현
		
		Costpergram c = new Costpergram();
		
		int cost = c.cost();
		int gram = c.gram();
//		c.costpergram(cost, gram);
	
//		int z1 = Calculator.divide(cost, gram);
		
		try {
			int z2 = Calculator.divide2(cost, gram);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 다른 메소드에서 try - catch 사용 -> 월권 행위 o
		// main메소드에서만 사용
		// throws : 많이 사용함 / 주 사용 -> main 메소드 이외의 메소드
		
		
		
		
		
		
		
		
	}
}
