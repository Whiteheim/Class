import java.util.Scanner;

// ���� ������ ��� ���α׷�
// �ð� �Է� -> �ش�ð��� ���ϴ� ���� ���
// 		=> �Է��� �ð��� �ð� ���� ������ �ƴϸ� �ٽ� �Է�

public class Aug_04_Main2 {

	public static int time() {
		Scanner enter = new Scanner(System.in);
		System.out.println("�ð��� �Է��ϼ���.(24h) : ");
		int time = enter.nextInt();
		return (time <= 24 && time >= 0) ? time : time();
	}

	public static String schedule(int a) {
		String s = "";
		if (a >= 9 && a <= 18) {
			if (a == 9 || a == 14 || a == 18) {
				return s = "QR ���";
			} else if (a >= 12 && a <= 13) {
				return s = "����";
			}
			return s = "�п����� ����";
		} else if (a >= 18 && a <= 24) {
			if (a <= 24) {
				if (a <= 20) {
					return s = "�Ͱ�";
				}
				return s = "����";
			}
		} else if (a >= 0 && a < 9) {
			if (a <= 6) {
				return s = "��ħ";
			} else {
				return s = "��� + �ı� + �п����";
			}

		}
		return s;

	}

	public static void main(String[] args) {
		int schedule = time();
		String day = schedule(schedule);
		System.out.printf("%d�� ���� %s �ð��Դϴ�.", schedule , day);

	}

}
