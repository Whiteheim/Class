import java.util.Scanner;

public class Aug_04_Main3 {

	public static int f1() {
		Scanner enter = new Scanner(System.in);
		System.out.println("���� : ");
		int f = enter.nextInt();
		if (f == 0) {
			System.out.println("0");
		} else if (f > 0) {
			System.out.println("��");
		} else if (f < 0) {
			System.out.println("��");
		}
		return f;
	}

	public static void f2(int a) {
		System.out.println("� ���� ��� �ΰ�?");
		if (a % 12 == 0) {
			System.out.println("3�� 4�� �����");
		} else if (a % 3 == 0) {
			System.out.println("3�� ���");
		} else if (a % 4 == 0) {
			System.out.println("4�� ���");
		} else {
			System.out.println("��?��");
		}
	}

	public static void main(String[] args) {
		f2(f1());
	}

}
