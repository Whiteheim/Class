// ������ (Java)
//		1. Ŭ������ �����ڰ� �������� ������
//			�ڹ� �����Ϸ��� �����ڸ� �������
//		2. ����Ŭ���� ��ü�� �����(Pen)
//			����Ŭ���� �⺻�����ڸ�(Product)
//			�ڵ�ȣ��
public class Pen extends Product2 {
	String color;

	public Pen() {
	}

	public Pen(String color) {
		super();			// 2. �� ����ص� (��� ����)
		this.color = color;
	}

	public Pen(String name, int age, String color) {
		super(name, age); // 2.�� ������ �ȵ� ����
						  // Product2(�̸�, ����)
						  // super(parameter)�� ���� �����ڸ� ������ ��
						  // �⺻�����ڰ� ������ �ʱ� ������ �⺻�����ڸ� ����� �� ����.
		this.color = color;
	}

}
