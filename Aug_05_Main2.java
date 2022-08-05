import java.util.Random;
import java.util.Scanner;

public class Aug_05_Main2 {

	
	public static void main(String[] args) {
		Random r = new Random();
		int c = r.nextInt(100) + 1;

		Scanner enter = new Scanner(System.in);
		for (int i = 1; true ; i++) { // 반복 횟수가 정해져있지 않으면 조건 지정 x or true 입력
			System.out.println("숫자를 입력하세요");
			int p = enter.nextInt();
			if (c > p) {
					System.out.println("UP");
				} else if (c < p) {
					System.out.println("Down");
				} else {
					System.out.println("Correct");
					System.out.printf("%d번 시도 \n",i);
					break;
				}
	
		}		
		
		
		
	}
	
}
