
// 1. ���� ������ �ҽ��� stack ������ ���̰Ե�
// 2. static ����������� static ������ ��ġ
// 3. JVM�� Main2.main(...); �� ȣ��
// 4. ����

public class Aug_12_Main2 {
	public static void main(String[] args) {
		//���� ��ü
		// ���� �̸�, �߷�, ����
		// ���
		
		// main�� ������ ��ü�� ���� ����
		// ���� �̸� -> ��
		// ���� ���� -> ��
		// ���� ���� -> ��
		// ������ -> ����
		
//		System.out.println(Snack.MANUFACTUTER);
//		System.out.println("----------------");
		
		Snack_Main2 s1 = new Snack_Main2();
		s1.name = "ȭ��Ʈ����";
		s1.weight = 300;
		s1.price = 3500;
		s1.printSnack();
	
		System.out.println("----------------");
		
		Snack_Main2 s2 = new Snack_Main2();
		s2.name = "�ڰ���";
		s2.weight = 60;
		s2.price = 1500;
		s2.printSnack();
		
		System.out.println("----------------");
		
//		s2.MANUFACTUTER = "�ֺ��";
//		s2.printSnack();
//		System.out.println("----------------");
		
//		s2.MANUFACTUTER = "���̺��"; // �����߻�
		
		Snack_Main2.printtaste();
		
		
		
		
		
		
	}
}
