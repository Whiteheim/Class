package com.sh.aug25.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

// Set 계열
//		가변사이즈
//		중복된 데이터는 자동 삭제
//			같은 객체가 여러번 들어가면 하나만 남김
//		순서가 랜덤
//		HashSet, TreeSet, ...
//			=> 실전에서는 유용하지 않아 사용하지 않음

public class SetMain {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("하나");
		hs.add("둘");
		hs.add("셋");
		hs.add("야");
		hs.add("야");
		hs.add("셋");
		hs.add("야");
		// 크기
		System.out.println(hs.size());
		System.out.println("-------------");
		// 요소들
		for (String s : hs) {
			System.out.println(s);
		}
		System.out.println("-------------");

		// ArrayList로 데이터 받아오기 => 정수 10개
		// 중복제거해서
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(new Integer(10));
		al.add(50);
		al.add(55);
		al.add(70);
		al.add(50);
		al.add(80);
		al.add(88);
		al.add(1231);
		al.add(50);
		al.add(1000);

		HashSet<Integer> hs2 = new HashSet<Integer>(al); // set에 list를 담아 중복 젝
		al = new ArrayList<Integer>(hs2); // 중복 제거 후 다시 List로

		// HashSet에는 sort기능이 없어서 list로 다시 만들어줘야함

		// 내림차순 정렬 출력
		Comparator<Integer> i = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		};
		al.sort(i);

		for (Integer i2 : al) {
			System.out.println(i2);
		}

	}
}
