// A is a B : ��Ӱ���
// ���θ� - ��ǰ�� ���� ������ �Խ��ϰ� ����
public class Aug_16_Main2_Product {
	public static void main(String[] args) {
		//�Ź� (�̸�, ����, ������)
		//���
		Shoes s = new Shoes("�ȭ", 53000, 265);
		s.printInfo();
		System.out.println("-------------------------------------");
		
		//��ǻ�� (�̸�, ����, cpu, ram, hdd)
		//���
		Computer c = new Computer("xx��ǻ��", 1810000, "i9-1160ti", 64, 1000);
		c.printInfo();
		System.out.println("-------------------------------------");
		
		//��Ʈ�� (�̸�, ����, cpu, ram, hdd, ����, ���͸� ���ӽð�)
		//���
		Laptop l = new Laptop("xx���ֳ̹�Ʈ��", 1000000, "i3-1080", 16, 512, 3010, 7);
		l.printInfo();
		System.out.println("-------------------------------------");
		
	}
}
