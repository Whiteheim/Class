public class Aug_01_Main05 {
	
	public static void test(int q) {
		System.out.println(q); // 10
		q = 20;
		System.out.println(q); // 20
	}
	
	
	public static void main(String[] args) {
		int q = 10;
		System.out.println(q); // 10
		test(q);				// test �Լ��� �����Ͽ� ����� ����
		System.out.println(q); // 10
	}
}
