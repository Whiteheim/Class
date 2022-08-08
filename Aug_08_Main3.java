// ���� �ܰ� ����
// ***Call By Value, Call By Reference
// Call by Value : ������ '��'�� �����ؼ� �Լ��� �Ķ���� ������ ����ϴ� ��
// Call by Reference : ������ �����ϴ� �ּҰ�(������)�� �Ķ���ͷ� �����ϴ� �� (Java������ ����)

public class Aug_08_Main3 {
	public static void test(int a, int[] b, int[] c) {
		System.out.println(b); // ������
		System.out.println(c); // ������
		System.out.println(a); // 10
		System.out.println(b[0]); // 10
		System.out.println(c[0]); // 10
		System.out.println("--------------");
		a = 100;
		b[0] = 100; // main�ʿ� ������ �� (������)
					// ->�⺻���� �������� ���� //�ּҰ��� �ƴ� ��Ҹ� �ٲٴ� �� (�߰��� �ȵǰ� ������ ����)
		c = new int[] { 100, 200 }; // ���ο� �� ����
									// new int[] �� �־�� ���ο� �迭 ���� -> ����� ����
									// ���� new int[] �� ���Խ��� �Ǿ� ��� ����
		System.out.println(b); // ������
		System.out.println(c); // ������ main�� c �� �ٸ� ���ο� ������
		System.out.println(a); // 100
		System.out.println(b[0]); // 10 -> 100
		System.out.println(c[0]); // 100
	}

	public static void main(String[] args) {
		int a = 10;
		int[] b = { 10, 20 };
		int[] c = { 10, 20 };
		System.out.println(b); // ������
		System.out.println(c); // ������
		System.out.println("--------------");
		test(a, b, c);
		System.out.println("--------------");
		System.out.println(a); // 10
		System.out.println(b[0]); // 10 -> 100 // *** �� ���濡 ������ ����
		System.out.println(c[0]); // 10 // *** �� ���濡 ������ ���� ����
									// test �Լ��� ����� c�ʹ� �ٸ�
	}
}
