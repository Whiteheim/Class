package com.sh.aug18.main;

import java.util.StringTokenizer;

public class TextMain {
	// 버전
	// 1.8.12
	// 앞자리 : major 버전 (1);
	// 뒷자리 : minor 버전 (8.12)
	// 더 뒷자리로 갈 수록 더 minor
	// 버전업 (1.8.12 -> 1.8.13) : 수정 보완 정도 (점검)
	// 버전업 (1.8.12 -> 1.9.0) : 변화를 체감 할 정도 (대규모 업데이트)
	// 버전업 (1.8.12 -> 2.0.0) : 새로운 프로그램

	// 네트워크를 통해서 데이터 받아오기 : 글자형태로 받아옴
	// 네트워크를 통해서 데이터 보내기 : 글자형태로 넘겨줌
	// 한글처리가 까다로워 질 수 있음
	public static void main(String[] args) {
		String s1 = "하하하ㅏ하하"; // 정식 x 약식o

		String s2 = new String("곧 있으면 추석 ! 너무 신나요 !"); // 정식 o
		// 3번째 있는 글자 출력
		char c = s2.charAt(2);
		System.out.println(c);
		// 몇글자
		int l = s2.length();
		System.out.println(l);
		// 너무 라는 단어가 있는가
		boolean b = s2.contains("너무");
		System.out.println(b);
		// 곧 이라는 단어로 시작?
		boolean b2 = s2.startsWith("곧");
		System.out.println(b2);
		// 추석 -> 설날 교체
		String s3 = s2.replace("추석", "설날");
		System.out.println(s3);
		// 2~5번째 글자만 출력
		// substring() : 원하는 위치의 글자를 뽑을 때 (시작위치, 끝나는 위치 - 1)
		String s4 = s2.substring(2, 6);
		System.out.println(s4);
		System.out.println("=========================");
		// 형식을 잡아 String 객체 생성
		String s5 = String.format("무게 : %.2fkg", 1234.456);
		System.out.println(s5);
		System.out.println("=========================");

		// s2에 글자 추가
		s2 = s2 + " 와아아아아";
		System.out.println(s2);
		s2 += " 와아아아아";
		System.out.println(s2);

		s2 = new String(s2 + " ㅎㅎ");
		System.out.println(s2);

		// String 대량으로 추가
		StringBuffer sb = new StringBuffer(s2);
		sb.append("우아아아아어디까지추가돼");
		sb.append("으아아아아아아아");
		sb.append("으아아아아아아아");
		System.out.println(sb);

		String s6 = sb.toString();
		System.out.println(s6);

		System.out.println("=========================");
		// String 분리
		String s7 = "김,이,박,나,최,강";
		// 1. Split
		String[] s7Ar = s7.split(","); // 문자열로 뽑아내어 원하는 값을 골라서 사용 가능
		System.out.println(s7Ar[0]);
		System.out.println(s7Ar[3]);
		System.out.println(s7Ar[5]);

		System.out.println("=========================");
		// 2. StringTokenizer
		StringTokenizer st = new StringTokenizer(s7, ","); // 순서대로 생성
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		while (st.hasMoreTokens()) { // 반복문의 형식 + 순서대로
			System.out.println(st.nextToken());
		}

		// 빠르게 값을 확인 할 때 : StringTokenizer
		// data속에서 변수가 많다면 : split

	}
}
