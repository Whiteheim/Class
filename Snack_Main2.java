// ������� : ��ü�� �Ӽ� -> (��ü.�Ӽ�)���� ǥ��
//							 this : ��ü �����θ� ��Ī, ��������

// �� ������ ��� ���ڸ� ������ ����� ��� ǥ��
//			-> ***static ������� ���
//						- ��ü�� ��� �� �� �ִ� ����
//							=> Ŭ������.xxx �� ���
//						- ��ü���� �������� �Ӽ�
//							=> ��ü�� ������ ���� static��� ������ �ϳ��� �־ ����.
//							   �޸� ���� ����

// static final ������� 
// 			�����Ұ��� -> ���� ���ȭ ��Ŵ (���� �������� �ʰڴ�)
//			static final �ڷ��� ������(���� �빮�ڷ� �Է��ϴ°��� ��ȭ) = ����;
//			�޸��� stack / heap�� �ƴ� ������ static������ ������ ��.


// static method
//		static ���� �޸� ���� ����
// 		��ü�� ��� ��� ����
//			static�� �ƴ� ����������� ������ �Ұ���


public class Snack_Main2 {
	String name;
	double weight;
	int price;
//	static String manufactuter = "����"; //���� ������
	static final String MANUFACTUTER = "����";
	
	public void printSnack() {
		System.out.printf("���ڸ� : %s\n", name);
		System.out.printf("�߷� : %.1fg\n", weight);
		System.out.printf("���� : %d��\n", price);
//		System.out.printf("������ : %s\n", manufactuter);
		System.out.printf("������ : %s\n", MANUFACTUTER);
	}
	
	public static void printtaste() {
		System.out.println(MANUFACTUTER);
//		System.out.println(name); static�� �ƴ� ��������� �����߻�
		System.out.println("�ٻ�ٻ�");
		System.out.println("-------------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
