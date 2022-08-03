import java.util.Scanner;

public class Aug_03_Main5 {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.print("x : ");
		int number = enter.nextInt();
		
		//		System.out.println(number);
		
		// 조건문 : if, switch
		/*  switch-case 문 ('sw' + 자동완성)
		 * 	switch 문 : 비교 조건이 특정한 값 이나 문자열인 경우 사용
		 * 	 break; 를 이용해 각 조건이 만족하면 switch문이 깨지도록 함 (종료 역할)
		 */
		/*
		 * switch (변수 or 식) { 
		 * 	case 값 A:
		 * 		변수 or 식의 값이 A일 때, 이 case 가 실행
		 * break; => 끝 
		 *  case 값 B:
		 * 		변수 or 식의 값이 B일 때, 이 case 가 실행
		 * 	default: A/B값이 모두 성립하지 않을 때 실행 (else같은 존재) 
		 * break; 
		 * }
		 */	
		switch (number) {
		case 1: System.out.println("ㅋ");
			break;
		case 2: System.out.println("ㄴ");
			break;
		case 3: System.out.println("ㅎ");
			break;
		default: System.out.println("졸려...");
			break;
		}
	}
	
}
