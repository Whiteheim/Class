import java.util.Scanner;

public class Aug_03_Main2 {

	public static int number1() {
		Scanner n = new Scanner(System.in);
		System.out.println("���� 1 : ");
		int num = n.nextInt();
		return num;
	}

	public static int number2() {
		Scanner n = new Scanner(System.in);
		System.out.println("���� 2 : ");
		int num = n.nextInt();
		return num;
	}

	public static int sum1(int n1, int n2) {
		int sum = n1 + n2;
		int result = (sum % 2 == 0) ? sum : sum1(number1(), number2());
//		int result = (sum % 2 == 0) ? sum : sum1(n1, n2); ��ġ �ʴ� ���� �ԷµǸ� �������� ������
// 														  ó�� �Է��� ���� ��� ���� ����
		return result;
	}

	public static void main(String[] args) {
		System.out.println(sum1(number1(), number2()));
	}

}
