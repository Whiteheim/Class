// OOP
// static - ��޽�ų
// ������ - ��ü ���� ���� 
// 		A has a B : ��� has a �ڵ��� : ���԰���
// 		A is a B : �� is a ���� : ��Ӱ���
public class Aug_16_Main1_HasA {
	public static void main(String[] args) {
		// �̸��� û����, ���� û�������� ����
		// ���� ��� 
		Candy c = new Candy("û����", "û������");
		c.printInfo();
		System.out.println("--------------------");
		
		//�̸� �Ե� / ��ġ�� ��� / �������� 100��
		Company co = new Company ("�Ե�", "���", 100);
		co.printInfo();
	
		// û���� ������ �Ե����� �������
		System.out.println("--------------------");
		c.brand = co;
		
		// û���� ������ �������� ������ ���
		c.brand.printInfo();
		
		System.out.println("--------------------");
		// �Ｚ / ���� / 300�� ���
		// ��ǻ�� cpu i7-1234 / ram 32gb / hdd500gb �Ｚ ��ǻ��
		// ��ǻ�Ϳ� ȸ���� ���� ���
		
		Samsung s = new Samsung("�Ｚ", "����", 500); // Company Class �ߺ� ��� ����
//		Company c2 = new Company("�Ｚ", "����", 500);
		s.printCompany();
		System.out.println("--------------------");
		Computer com = new Computer("i7-1234", 32, 500, s);
		com.printCom();
		
		
		
	}
	}
