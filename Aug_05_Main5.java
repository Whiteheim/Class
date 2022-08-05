import java.util.Random;

public class Aug_05_Main5 {
	public static void main(String[] args) {
		Random r = new Random();
		int f = 0;
		for (int i = 0; i < 5; i++) {
			f = r.nextInt(10) + 1;
			System.out.println(f);
		}
		System.out.println("===================");
		for (int i = 0; true; i++) {
			f = r.nextInt(10) + 1;
			if (f == 9) {
				break;
			}
			System.out.println(f);
		}
		System.out.println("===================");
		// �ݺ� Ƚ���� ��Ȯ�� �� for �� ���.
		// �ݺ� ���� (if���� �ݺ�����)
		// while�� : ������ ���� �˻�
		// ������ true(��)�� ���ȿ� ��� �ݺ��� ����κ��� �����Ű�� �ݺ���
		// ���� �κп��� ������ false(����)���� ���� ���ߵ��� �ϰų�
		// break; ��ɾ�� �ݺ����� �����ų �� �ִ�.
		// ������ ���� ������ �ݺ��ϴ� �۾��� ����
		// ������ �ݺ��ϰ� ���� �� while (true) ���

		/*
		 * while�� : �ݺ� Ƚ���� ��Ȯ�� �� �� ���� ��, Ư���� ���ǿ��� ����� �ϴ� ��� ��� while(���ǽ�){ ���� } �ѹ��� �ݺ���
		 * �� �� ���� ����
		 */

		int w = r.nextInt(10) + 1;
		while (w != 9) { // w �� 9�� �ƴϸ� (= 9�� ���� �� ����)
			System.out.println(w);
			w = r.nextInt(10) + 1; // �ٽ� while ���� ���ư��� ���ǹ� üũ
		}
		System.out.println("===================");

		int t = r.nextInt(3) + 1;
		while (t != 3) {
			System.out.println(t);
			t = r.nextInt(3) + 1;

		}
		System.out.println("===================");
		/*
		 * do-while�� : ������� �ϰ� ���� ������ ���߿� �˻� (���� ������� ����) �ѹ��� �ݺ��� �����
		 * 
		 */

		int t1 = r.nextInt(3) + 1;
		do {
			System.out.println(t1);
			t1 = r.nextInt(3) + 1;
		} while (t1 != 3);

		System.out.println("===================");
		// 1 + 2 + 3 + ... + 10 = ? -> for ��
		// 1 + 2 + 3 + ... + n <= 100 -> while��
		int sum = 0;
		int num = 0;
		while (sum < 100) {
			num++;
			sum += num;
		}
		System.out.printf("n�� �� : %d\n", num);
		System.out.printf("�� �� : %d\n", sum);

		System.out.println("===================");
		int fif = 1000;
		while (fif % 15 > 0) {
			fif--;
			System.out.println(fif);
		}
	}

}
