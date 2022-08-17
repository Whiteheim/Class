package com.seonghun.aug172.main;

import com.seonghun.aug172.other.Scanner;

public class Aug_17_Main2 {
	public static void main(String[] args) {
		// 객체를 만들때 패키지명을 생략가능한 경우
		// 		- 자바 기본 패키지(java.lang)의 소속 -> 생략가능
		/* java.lang. */String s1 = "ㅎ";
		/* java.lang. */System.out.println("ㅎ");
		
		// 		- 같은 패키지 소속
		/* com.seonghun.aug172.main. */Anything s 
				= new /* com.seonghun.aug172.main. */Anything();
		
		//		- 다른 패키지 소속
		com.seonghun.aug172.other.Scanner a = new com.seonghun.aug172.other.Scanner();
		Scanner a2 = new Scanner();
	}
}
