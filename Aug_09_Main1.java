import java.util.Random;
import java.util.Scanner;

public class Aug_09_Main1 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] num = new int[10];
		int a = 0;
		for (int i = 0; i < num.length; i++) {
			a = r.nextInt(100) + 1;
			num[i] = a;
		}
		for (int i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("============================");
		
		Scanner enter = new Scanner(System.in);
		int[] e_num = new int[10];
		int b = 0;
		for (int i = 0; i < e_num.length; i++) {
			System.out.printf("%d��° ���� �Է� : ", i + 1);
			b = enter.nextInt();
			e_num[i] = b; // b�� ���� �迭�� i��°�� �Ѱ���
		}
		for (int i : e_num) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("============================");
		
		int max = num[0]; // �迭�� 0��° ���ڰ� �ִ밪�̶�� ����
		int min = num[0]; // �迭�� 0��° ���ڰ� �ּҰ��̶�� ����
		for (int i = 0; i < e_num.length; i++) {
			if (min > num[i]) { // num[i]�� ���ڰ� �� �۴ٸ�
				min = num[i];	// num[i]�� ���ڰ��� min�� �Űܴ��
			} else if (max < num[i]) {  // num[i]�� ���ڰ� �� ũ�ٸ�
				max = num[i];			// num[i]�� ���ڰ��� max�� �Űܴ��
			}
		}
		System.out.printf("�ּҰ� : %d,\n �ִ밪 : %d", min, max);
	}
}








































