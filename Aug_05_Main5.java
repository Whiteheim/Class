import java.util.Random;

public class Aug_05_Main5 {
	public static void main(String[] args) {
		Random r = new Random();
		int f = 0;
		for (int i = 0; i < 5; i++) {
			f = r.nextInt(10) + 1;
			System.out.println(f);
		}
		System.out.println("===================");
		for (int i = 0; true; i++) {
			f = r.nextInt(10) + 1;
			if (f == 9) {
				break;
			}
			System.out.println(f);
		}
		System.out.println("===================");
		// 반복 횟수가 명확할 때 for 문 사용.
		// 반복 조건 (if문의 반복버전)
		// while문 : 조건을 먼저 검사
		// 조건이 true(참)인 동안에 계속 반복해 수행부분을 실행시키는 반복문
		// 실행 부분에서 조건을 false(거짓)으로 만들어서 멈추도록 하거나
		// break; 명령어로 반복문을 종료시킬 수 있다.
		// 조건이 맞지 않으면 반복하던 작업을 중지
		// 무한히 반복하고 싶을 때 while (true) 사용

		/*
		 * while문 : 반복 횟수를 정확히 알 수 없을 때, 특별한 조건에서 멈춰야 하는 경우 사용 while(조건식){ 내용 } 한번도 반복이
		 * 안 될 수도 있음
		 */

		int w = r.nextInt(10) + 1;
		while (w != 9) { // w 가 9가 아니면 (= 9가 나올 때 까지)
			System.out.println(w);
			w = r.nextInt(10) + 1; // 다시 while 으로 돌아가서 조건문 체크
		}
		System.out.println("===================");

		int t = r.nextInt(3) + 1;
		while (t != 3) {
			System.out.println(t);
			t = r.nextInt(3) + 1;

		}
		System.out.println("===================");
		/*
		 * do-while문 : 실행부터 하고 나서 조건을 나중에 검사 (거의 사용하지 않음) 한번은 반복이 보장됨
		 * 
		 */

		int t1 = r.nextInt(3) + 1;
		do {
			System.out.println(t1);
			t1 = r.nextInt(3) + 1;
		} while (t1 != 3);

		System.out.println("===================");
		// 1 + 2 + 3 + ... + 10 = ? -> for 문
		// 1 + 2 + 3 + ... + n <= 100 -> while문
		int sum = 0;
		int num = 0;
		while (sum < 100) {
			num++;
			sum += num;
		}
		System.out.printf("n의 값 : %d\n", num);
		System.out.printf("총 합 : %d\n", sum);

		System.out.println("===================");
		int fif = 1000;
		while (fif % 15 > 0) {
			fif--;
			System.out.println(fif);
		}
	}

}
