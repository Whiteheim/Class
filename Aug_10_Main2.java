// Java : �Ϻ��� ��ü���� ���(������)��� �˷�������
// C++, Python : Hybrid ��ü������ (������)

// �ǻ�Ȱ�� ���� -> ���Ⱑ ������ -> ���������� ��������

// main()�ִ� Ŭ���� : XXXMain���� ǥ��, �������� Class(�ֹ�)�� Ȱ��
public class Aug_10_Main2 {
	public static void main(String[] args) {
		// ������ Java�� ǥ�� -> ǥ���ϰ���� �� ���� �׻� Ŭ������ ���� �����ؾ���.
		// ���� ��ȣ / ���� / ȸ�� / ���� / ����� => ���
		// int, double, String ... etc : ��ü������ �����ϱ� �����
		// �ּ��� �� �ʿ䰡 ���ٴ°� ���� -> ǥ���ϰ��� �ϴ°� �˱� ����
		// b = ��ü, instance��� �θ�
		
		Bus b = new Bus(); // ���� 1�� �ϼ�
		b.busNum = 10547;
		b.car = "����";
		b.company = "��������";
		b.driver = "ȫ�浿";
		b.start = "��������Ʈ 5����";
//		System.out.println(b.busNum);
//		System.out.println(b.car);
//		System.out.println(b.company);
//		System.out.println(b.driver);
//		System.out.println(b.start);
		b.printInfo();
		b.go();
		System.out.println("==========================");
		//�ڵ���
		//		�𵨸�
		// 		������
		//		����
		//		���� ���
		//		��ȭ���� �� - �츮��~ ���
		Mobilephone m1 = new Mobilephone(); //����� ���� Stack�� ���̰� ��
		System.out.println(m1); // �⺻���� �ƴ� �͵��� �� ������
		m1.printMobile(); // �⺻��
		System.out.println("==========================");
		m1.modelName = "iPhone 12";
		m1.company = "Apple";
		m1.cost = 1009000;
		m1.printMobile();
		m1.ringTheBell();
		System.out.println("==========================");
		// m1�� ���� �Ӽ����� ���� m2 ���� -> m1 = m2�� ������δ� �Ұ���
		// ������ new �� �����ؾ� ��*.
		Mobilephone m2 = m1; // ���� ��ü ����, m1�� ������ �ϳ� �� ���� ��Ȳ.
		System.out.println(m2);	// �ϳ��� ��ü�� ���̼� �����ϴ� ��Ȳ
		System.out.println("==========================");
		m2.modelName = "iPhone 12";
		m2.company = "Apple";
		m2.cost = 809000; // ���� ����
		m2.printMobile();
		System.out.println("==========================");
		m1.printMobile(); // m2�� ���� �������� ������ �־� ������ �ٲ�� �Բ� �ٲ�
		System.out.println("==========================");
	
	
	
	}
}






























