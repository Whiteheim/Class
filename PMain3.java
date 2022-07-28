
public class PMain3 {
	public static void main(String[] args) {
		// print
		// System.out.print("�ٹٲ� ���� ����Ʈ");
		
		// printf
		// ���� : System.out.printf("%?", ��);
		
		// ���� (decimal)
		/* %d : ���������Ͱ� ��� �� �ڸ� (10����) -> ��� ��� ����
		 * %xd : x�ڸ��� ���ڸ� ����� ��ĭ�� �������� ��
		 * %0xd : ���ڸ��� 0���� ä�� x�ڸ��� ���ڷ� ����� ��
		 */
		
		System.out.printf("%d\n", 15);
		System.out.printf("%5d\n", 15);
		System.out.printf("%05d\n", 15);
		System.out.println("-----------------");
		// �Ǽ� (float)
		// %f : �Ǽ� �����Ͱ� ���� �ڸ� 
		// %.xf : �Ҽ��� ������ �ڸ��� (�߸��� �κ��� �ݿø�) 
		//			���ڸ��� 0���� ä����
		
		System.out.printf("%f\n", 3.141592);
		System.out.printf("%.10f\n", 3.141592168795);
		System.out.printf("%.8f\n", 3.14159);
		System.out.printf("%010f\n", 3.14159);
		System.out.println("-----------------");
		
		// ���ڿ� (string)
		// %s : ���� �����Ͱ� ��� �� �ڸ�
		// ���� : �׳� �Է� �ϸ� ��.
		// ���� : �׳� �Է� �ϰ� �Ǹ� Java�� �������� �ؼ� �ϰ� �� => ���� �߻�
		//	=> "����" ���� �Է��ؾ� ���� x 
		
		System.out.printf("%d��\n", 2022);
		System.out.printf("%02d��\n", 07);
		System.out.printf("%d��\n", 27);
		System.out.printf("%s\n", "��¥ : 2022-07-27");
		System.out.printf("��¥ : %4d-%02d-%02d\n", 2022,7,27);
		System.out.printf("%s\n", "���� : ����");
		System.out.printf("���� : %s\n", "����");
		System.out.printf("%s\n", "��� : 32��");
		System.out.printf("��� : %02d��\n", 32);
		System.out.printf("%s\n", "���� : 30.71%");
		System.out.printf("���� : %02.2f%%\n", 30.71);
		// %%: %�� ���ڷ� ǥ���ϰ� ���� �� (printf ������)
		// printf�� f = Format �ǹ�
		
		
		
			}
}
