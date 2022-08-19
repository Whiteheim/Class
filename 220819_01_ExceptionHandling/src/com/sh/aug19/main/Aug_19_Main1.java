package com.sh.aug19.main;

import java.util.Scanner;

public class Aug_19_Main1 {

	// error
	// 한영 번역
	// 사과 apple
	// 바나나 banana
	// 띱퀭 ???
	// Java의 문법에 맞지않게 사용하여 컴파일이 불가능한 상태
	// 개발자 과실 100%
	// 완성본은 나오지 않음

	// warning
	// 지저분한 코드
	// 개발자 과실
	// 컴파일은 가능 => 완성본은 나옴(실행에는 문제 없음)
	// 이클립스가 잔소리를 함
	// ex) Scanner k = new Scanner(); 사용 후 기능을 안닫음

	// exception
	// 프로그램은 완성 된 상태
	// 실행 후 외부적인 요인에 의해 작동이 일어나지않는 경우
	// 개발자 과실 x
	// 개발자의 입장 -> 개발자가 상황을 예측해서 미리 계획은 세워두자

	public static void main(String[] args) {
		// x : ?
		// y : ? 입력받아
		// + - * /출력

		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
		System.out.print("y : ");
		int y = k.nextInt();
		System.out.println("------------------");
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
//		System.out.println(x/y);

		// y값에 0을 넣으면 exception 발생

		// Exception 처리방법
//		try {
		// 여기 부분을 실행
//		} catch (// 예외유형	변수명) {
//				try쪽을 실행하다가 해당 유형의 예외가 발생하면 이 부분을 실행
		// 예외없이 정상적으로 실행됐을 경우, catch부분은 그냥 지나치고
		// 그 다음 소스를 진행
//		} catch() {
		// .... 여러 예외 설정 가능
//		} finally {
//			정상적으로 프로그램이 실행됐던지,
//			예외가 터졌던지 상관없이 실행됨, 
//			return보다 먼저 실행
//		}

		// 두가지 문제가 동시에 터지면 먼저 입력한 catch의 내용만 출력
		// Java의 입장에서 첫번째 예외가 터졌을 때 , 즉시 실행중지 후 해당하는 예외처리부분으로 넘어감
		
		// x : 10, y : 0 => 67 - 68(Arith) - 72 - 73 
		
//		try {
//			int d = x / y;
//			System.out.println(d);
//			int[] ar = { 1, 2, 3 };
//			System.out.println(ar[x]);
//		} catch (ArithmeticException ae) {
//			System.out.println("실패");
//		} catch (IndexOutOfBoundsException aoe) {
//			System.out.println("없는 번호 입니다");
//		}

		// x : 10, y : 1 => 67 - 68 - 69 - 70(IndexOut) - 74 - 75
		// x : 2, y : 1 => 67 - 68 - 69 - 70 - 71  
		
		try {
			int d = x / y;
			System.out.println(d);
			int[] ar = { 1, 2, 3 };
			System.out.println(ar[x]);
		} catch (Exception e) {	// 모든 exception을 다 잡아줌
			System.out.println("안됨");
			e.printStackTrace(); // 어떤 exception이 발생 했는지 상황 출력 (개발자용)
		} finally {
			System.out.println("여기까지");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
