
public class Aug_01_Main04 {
	
	public static void test(int b) {
		int a = 123;
		System.out.println(b); // 30
		System.out.println(a + b); // 153
}
		
	public static void main(String[] args) {
		int a = 10;		// ��������(local variable) :
		int b = 20;		// 		 �Լ� ������ ���� ����
		int c = 30;		//		 �� �Լ� �������� ��� ����
		
		test(c);
		System.out.println(b); // 20
	// ���� �Լ� �ȿ����� ���� �̸��� ������ ���� �� ����
	// ���α׷� ���� �� main�� �� ���� ���� �ǰ� ������ �Լ��� ����������
	// ���������� ����Ǿ� �޸��� Stack�� ���̰� ��
		
		
	}
}
