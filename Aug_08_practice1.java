import java.util.Scanner;

public class Aug_08_practice1 {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		int number = 0;
		while (true) {
			System.out.println("���ڸ� �Է��� �ּ���");
			System.out.println("����� 0 �Դϴ�");
			number = enter.nextInt();
			if (number == 0) {
				System.out.println("�ý����� �����մϴ�");
			}
			System.out.printf("%d�� ����� : ", number);
			for (int i = 1; i <= number ; i++) {
				if (number % i == 0) {
					System.out.printf("%d  ", i);
				}
			}
		System.out.println();
		}
				}

}
