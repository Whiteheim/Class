import java.util.Iterator;
import java.util.Random;

// 반복문
/*  for (int i = 0; i < args.length; i++) {
 *     [변수 초기화; /  조건식; /  값의 증감] 
 *     내용
 *     }
 *     작동 원리
 *     1. 변수 초기화 확인
 *     2. 조건식이 '참'일 때 내용 출력
 *     3. 값의 증감 확인
 *     4. 이후 다시 조건 비교 후 '참' 일 때 내용 출력
 *     5. 3번부터 반복
 *     6. 조건 반복 비교 후 '거짓' 일 때 반복문 종료
 *     
 *     능력
 *     1. 어떤 작업을 정한 수 만큼 반복 할 수 있음 (횟수)
 *     2. 작업을 기간을 정해 반복할 수 있음        (기한)
 *     
 *     'ㅋ'을 3번 출력 할 때 
 *  	for (int i = 0; i < 3; i++)
 * 			[초기값 / 반복할 횟수 / 반복후 i 에 1씩 증가]     
 *     
 */

public class Aug_04_Main4 {

	
	
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d : ㅋ\n", i);
			}
		System.out.println("=========================");
		for (int j = 5; j > 0 ; j--) {
			System.out.println(j);
		}
		System.out.println("=========================");
		for (int k = 1; k <= 21; k+=2) {
			System.out.println(k);
		}
		System.out.println("=========================");
		Random r = new Random();
		int k = r.nextInt(10) + 1; 
		int k2 = 0;
		for (int l = 0; l < 5; l++) {
			k2 = r.nextInt(10) + 1; 
			System.out.println(k2);
//			for (int l = 0; l < 5; l++) {
//			int k = r.nextInt(10) + 1; 
//			반복문 속에서 변수를 만들면 반복문이 한번 돌 때 마다 메모리를 쓰기 때문에 비추천함
//			반복문 밖에서 변수를 가져다 쓰는게 더 효율적
		}
		System.out.println("=========================");
		int sum = 0; 
		for (int i = 1; i <= 10; i++) {
			sum += i; // += : 우항의 수 만큼 더해나간다 sum = sum + i
		}	
		System.out.println(sum);
		System.out.println("=========================");
		
		int factorial = 1;
		for (int i = 1; i <= 7; i++) {
			factorial *= i;
		}
		System.out.println(factorial);
		System.out.println("=========================");
		
		int mul = 0;
		for (int i = 0; i <= 50; i ++) {
			if (i % 3 == 0 || i % 5 == 0 ) {
				mul += i;
		}
	System.out.println(mul);
		}
		}
}



















