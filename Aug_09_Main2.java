import java.util.Scanner;

// 1�� �Է��ϸ� �л� �� ���� �Է� ���� �� �ֵ���
// 2�� �Է��ϸ� �� �л����� ������ �Է� ���� �� �ֵ��� (�������� ��� x)
// 3�� �Է��ϸ� �л����� ���� ����Ʈ ����� �� �ְ�(1�� �л��� ������ xx��)
// 4�� �Է��ϸ� �ְ����� ��������� �м��ؼ� ��� �� �� �ְ�
// 5�� �Է��ϸ� ���α׷� ����
// 5�� ������ �� ���� �ݺ��ǵ���
public class Aug_09_Main2 {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		int num = 0;
		int student = 0;
		int[] score = null;
		a : while (true) {
			System.out.println("��ȣ�� �Է��ϼ��� : ");
			num = enter.nextInt();
			if (num == 1) {
				System.out.println("--------------------------");
				System.out.print("�л� �� : ");
				student = enter.nextInt();
				score = new int[student];
				System.out.println("--------------------------");
			} else if (num == 2) {
				System.out.println("--------------------------");
				for (int i = 0; i < score.length; i++) {
					System.out.print("�л��� ���� :");
					score[i] = enter.nextInt();
				}
				System.out.println("--------------------------");
			} else if (num == 3) {
				System.out.println("--------------------------");
				int index = 1;
				for (int i : score) {
					System.out.printf("%d�� �л� ���� : %d��\n", index++, i);
				}
				System.out.println("--------------------------");
			} else if (num == 4) {
				System.out.println("--------------------------");
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i : score) {
					sum += i;
					max = (max < i) ? i : max;
				}
				avg = (double) sum / score.length;
				System.out.printf("�ְ��� : %d\n", max);
				System.out.printf("���� : %d\n", sum);
				System.out.printf("��� : %.1f\n", avg);
				System.out.println("--------------------------");
			} else if (num == 5) {
				break a;
			}
		}
	}
}
