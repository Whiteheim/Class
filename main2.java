import java.util.Scanner;

public class main2 {
	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);
		
		
		System.out.print("���� : ");
		int Korean = test.nextInt();
		
		System.out.print("���� : ");
		int English = test.nextInt();
		
		System.out.print("���� : ");
		int math = test.nextInt();
		
		System.out.print("��ȸ : ");
		int society = test.nextInt();
		
		System.out.print("���� : ");
		int science = test.nextInt();
		
		
		System.out.println("\t���� ���\t");
		System.out.printf("���� : %d��\n", Korean);
		System.out.printf("���� : %d��\n", English);
		System.out.printf("���� : %d��\n", math);
		System.out.printf("��ȸ : %d��\n", society);
		System.out.printf("���� : %d��\n", science);
		System.out.printf("���� : %d��\n", Korean + English + math + society + science);
		System.out.printf("��� : %.1f��\n", (double) (Korean + English + math + society + science) / 5);
		// ���º�ȯ���� ��ȣ �ȿ� �ڷ����� �������.
	}
}
