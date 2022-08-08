import java.util.Scanner;

public class Aug_08_practice1 {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		int number = 0;
		while (true) {
			System.out.println("숫자를 입력해 주세요");
			System.out.println("종료는 0 입니다");
			number = enter.nextInt();
			if (number == 0) {
				System.out.println("시스템을 종료합니다");
			}
			System.out.printf("%d의 약수는 : ", number);
			for (int i = 1; i <= number ; i++) {
				if (number % i == 0) {
					System.out.printf("%d  ", i);
				}
			}
		System.out.println();
		}
				}

}
