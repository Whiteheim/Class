
public class Aug_01_Main06 {

	public static void sum (int a, int b) {
		System.out.println(a + b);		
	}
	public static void sum (int a, int b, int c ) {
		System.out.println(a + b + c);
	}
	public static void sum (double a, double b, double c) {
		System.out.println(a + b + c);
	}
	public static void scream (String a) {
		System.out.println("��!");
	}
	public static void scream (int a) {
		System.out.println("��!");
	}
	public static void scream (double a) {
		System.out.println("���ƾƾ�!");
	}	
	public static void scream () {
		System.out.println("...");
	}	
	
	
	
	
	public static void main(String[] args) {
		sum(10,20);
		sum(20, 20, 30);
		sum(1.5, 20, 30);
		
		// ***�����ε�(overloading) : �Լ��� ����, �Ķ���͸� �ٸ��� �ϴ� ���
		// 		   	    			  ȣ�� �� ��, � ���� �־����Ŀ� ���� �׿� �´� �Լ��� ������
		// ���� �ڷ����� �ᵵ, �Ķ������ ������ �ٸ��� �����ε� ����
		// �Ķ������ ������ ���Ƶ� �ٸ� �ڷ����� ����ϸ� �����ε� ����
		// print �Լ��� ��ǥ�� (System.out.println();)
		
		
		scream(1);
		scream("��");
		scream(0.5);
		scream();
	
	
	}
}
