package com.sh.aug25.main;

import java.util.ArrayList;
import java.util.Comparator;

// ArrayList(List계열의 대표적인 종류)
//	요소를 index로 사용하는것이 배열과 유사
//	배열과의 차이점 
//		배열 : 사이즈 고정 -> 데이터의 수가 배열의 크기보다 많아지면 저장 x
//		ArrayList : 저장되는 데이터 수에 따라 크기가 자동으로 변경
//					요소양에 따라 ArraList의 크기를 자동으로 증감시킴
//					자료형을 섞어서 데이터를 넣는 것이 가능

public class ListMain {
	public static void main(String[] args) {
//		int[] i = { 1, 2, 3 };
//		ArrayList test = new ArrayList();
//		test.add("피곤");
//		test.add("졸림");
//		test.add("극노");
//		test.add("칭찬");
//		test.add("1.11");
//		test.add("false");
//		for (Object object : test) { // 자료형이 통일되지 않아서object라는 것이 헷갈ㄹ
//			System.out.println(object);
//		}
//		System.out.println("=======================");

		ArrayList<String> al = new ArrayList<String>();
		al.add("ananas");
//		al.add(1);	// 에러가 나는 이유 : String 만 넣을 수 있음
		
		// 자료형 통일을 원할 때
		// <	> - generic
		//	자료형을 고정하는 역할
		//	클래스명<자료형의 객체형>갑 입력
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(new Integer(100));
		System.out.println(al2.get(0));
		System.out.println(al2.size());
		System.out.println("=======================");
		
		for (int j = 0; j < al2.size(); j++) {
			System.out.println(al2.get(0));
		}
		System.out.println("=======================");
		al2.add(30);
		al2.add(1, 90); // 1번 자리에 90넣기
		al2.add(2, 0);	// 2번 자리에 0 넣기
		al2.remove(0); // 0번 자리에 있는 값 지우기
		
		for (Integer ii : al2) {
			System.out.println(ii);
		}
		System.out.println("=======================");
		al.add("두리안");
		al.add("바나나");
		al.add("딸기");
		al.add("사과");
		al2.add(13);
		al2.add(25);
		al2.add(39);
		Comparator<String> c = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		al.sort(c);
		
		for (String s : al) {
			System.out.println(s);
		}
		System.out.println("=======================");
		
		Comparator<Integer> i2 = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
//				return o1.compareTo(o2); // 오름차순
				return o2.compareTo(o1); // 내림차순
			}
		};
		al2.sort(i2);
		for (int integer : al2) {
			System.out.println(integer);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
