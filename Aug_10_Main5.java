// ???
//		???
// Stack
// 		������ ���� �� ���� �Ʒ��������� �������� ����
//		���α׷��� ����Ǹ� �� ������ �˾Ƽ� �� ������ ��
// Heap
//		��ǻ�Ͱ� �����ϴٰ� �Ǵ��� ��ġ�� ����
//		�ڵ����� ���� X (�ڵ��� �޸� ���� ������ �־��� ����)
// **Garbage Collection : Heap���� �ڵ����� �ý��� (**��������)
// 		�۵� �ñ� - �� ������ ���̻� ���� �� ����� ������ �� �۵���

public class Aug_10_Main5 {
	// ����ũ
	// �̸�
	// ����ó
	// ����
	// ���� ���

	public static void main(String[] args) {
		Mask m1 = new Mask();
		m1.maskName = "KF94 Ȳ��濪����ũ";
		m1.store = "����";
		m1.cost = 1100;
		System.out.println(m1);
		m1.printMaskInfo();
		System.out.println("======================");
		Mask m2 = m1; // Mask m1�� m2��� ������ �ϳ� �� ����
		m1 = null;
		System.out.println(m1); // ��ġ���� ����Ű�� ����***
		System.out.println(m2);
		m2 = null; // �� �� ���� ���� �޸� ������ ��
		// Mask�� ������ ������� ����. Garbage Collection �۵�
		System.out.println(m2);
		m2.printMaskInfo(); // m2 �� ������ ����ϴ°� �Ұ���
		// �۵��� �ȵǸ� ���α׷��� �� �������� ������ ��

	}
}


// ���α׷��� ���� �Ǹ� Stack ������ ���ư���
// 		=> Heap ������  ������ ���ϰ� �Ǿ� Garbage Collection �۵�
























