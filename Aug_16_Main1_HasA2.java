// ��ü���� ����
//		A has a B : Human has a cell phone
//		A ins a B : Dog is a animal
public class Aug_16_Main1_HasA2 {
	public static void main(String[] args) {
		//�̸��� Kim Andrew, ����, ����ȣ 010-1234-5678���
		Person p = new Person("Kim Andrew", "����", "010-1234-5678");
		p.printInfo();
		System.out.println("------------------------------------");
		// �Ǳ�����, ����, 032-1222-3444, Kim Andrew �� �Ĵ�
		// �Ĵ� ���� �������� ���
		
		
		Bistro b = new Bistro("�Ǳ�����", "����", "032-1222-3444", p);
		b.printInfo();
		System.out.println("------------------------------------");
//		 ������� , 22000, �Ǳ��������� �Ĵ� �޴�
		Menu egg = new Menu("�������", 22000, b);
		egg.printInfo();
		System.out.println("------------------------------------");
		// ����Ұ��, 25000
		Menu cow = new Menu("���� �Ұ��", 25000, b);
		cow.printInfo();
		System.out.println("------------------------------------");
		// ����, 5000��, ����Ұ�⸦ ���� ����
		Dish grill = new Dish("����", 5000, cow);
		grill.printInfo();
		System.out.println("------------------------------------");
		// ��������, ���ı�, ���豸�����
		Market ma = new Market("��������", "���ı�", grill);
		ma.printInfo();
		System.out.println("------------------------------------");
		// ������, ���������� �����ϴ� ����
		Merchant mer = new Merchant("������", ma);
		mer.printInfo();
		System.out.println("------------------------------------");
		//������ �̸� ���
		System.out.println(mer.name);
		//������ �����ϴ� ���� ������ ��ü ���
		System.out.println("------------------------------------");
		mer.m.printInfo();
		System.out.println("------------------------------------");
		// ������ �����ϴ� ���忡�� �� ���� ����
		mer.m.d.printInfo();
		System.out.println("------------------------------------");
		// ������ �����ϴ� ���忡�� �� ������ ����
		System.out.println(mer.m.d.price);
		System.out.println("------------------------------------");
		// ������ �����ϴ� ���忡�� �� ���ÿ� ��� �޴��� ����
		mer.m.d.m.printInfo();
		System.out.println("------------------------------------");
		// ������ �����ϴ� ���忡�� �� ���ÿ� ��� �޴� ����
		System.out.println(mer.m.d.price);
		System.out.println("------------------------------------");
		//������ �����ϴ� ���忡�� �� ���ÿ� ��� �޴��� �Ĵ� �Ĵ� ����ó
		System.out.println(mer.m.d.m.b.phone);
		System.out.println("------------------------------------");
		//������ �����ϴ� ���忡�� �� ���ÿ� ��� �޴��� �� �Ĵ� ���� ����ó
		System.out.println(mer.m.d.m.b.owner.cellphone);
		System.out.println("------------------------------------");
		//������̸� �Ĵ� ��� ����ó
		System.out.println(egg.b.owner.cellphone);
	}
}


