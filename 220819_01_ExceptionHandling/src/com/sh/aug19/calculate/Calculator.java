package com.sh.aug19.calculate;

public class Calculator {

	// 1. try - catch - finally : 여기에서 끝을 냄
	// 정상실행 : 9 - 10 - 11 - [16 - 17 - 18] - 12 ([] : finally)
	// 무게값 0 : 9 - 10 - 11(Arith) - 13 - 14 - [16 - 17 - 18] - 15 ([] : finally)

	public static int divide(int price, int weight) {
		try {
			int d = price / weight;
			return d;
		} catch (Exception e) {
			System.out.println("멈춰");
			return -999;
		} finally {
			System.out.println("다시입력");
		}
	}

	// 2. 미루기 : throws
	// divide2를 실행하다가 Arithmetic... 가 터지면
	// divide2를 호출한 쪽에서 해결해라
	public static int divide2(int price, int weight) throws /* Arithmetic */Exception {
		int d = price / weight;
		return d;
	}

}
