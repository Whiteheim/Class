import java.util.Random;

public class Aug_02_Main6 {
	/* public static A B ( C ) {
	 * 		����
	 * 		return
	 * }
	 * 
	 * B : �Լ��� / ����� ������ �����ϵ��� �۸� / ���� ó�� �۸��ϱ�
	 * 	   ���� ó���� ��Ÿü or ��ü ���
	 * 
	 * C : �Ķ����(Parameter) / �Լ��� ȣ���ϴ� �� (main�Լ�) ���� �ش� �Լ� ������
	 * 	   						 �����͸� ���� �� ��� 
	 * 							 ���� : (�ڷ��� ������, �ڷ��� ������, ...)
	 * 
	 * A : ����Ÿ��(Return Type) / �ش� �Լ����� �۾��� ����� ȣ���� ��(main �Լ�)���� ������ ���
	 * 							   void�� ������ �ٸ� ����Ÿ�Ե��� return�� �Բ� ���
	 */
	public static int randomizer() {
		Random i = new Random ();
		int r = i.nextInt();
		return r;
	}
	
	public static void sum(int a, int b) {
		System.out.println(a + b); 
	

	}
	
	public static void main(String[] args) {
		int r1 = randomizer();
		int r2 = randomizer();
		sum(r1,r2);		
	}
	
	
	
	
	
	
}
