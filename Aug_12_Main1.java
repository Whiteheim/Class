
public class Aug_12_Main1 {
	public static void main(String[] args) {
		// �Ź� ��ü
		// ����Ű Ȩ������
		//-------------------
		// ��ǰ��
		// ������
		// ����
		// �귣��
		// �Ź� ���� ���
		//-------------------
		// ��ǰ��
		// ������
		// ����
		// �귣��
		// �Ź� ���� ���
		//-------------------
		
		Nike_Shoes1_Main1 s1 = new Nike_Shoes1_Main1();
		s1.name = "����Ű ����ƽ� ���� Ʈ���̳� 3";
		s1.size = 265;
		s1.price = 99000;
		s1.shoseInfo();
		
		Nike_Shoes1_Main1 s2 = new Nike_Shoes1_Main1();
		s2.name = "����Ű ������ �õ���";
		s2.size = 265;
		s2.price = 59300;
		s2.shoseInfo();
		
		s2.test(s2.name);				// ����Ű ������ �õ���
										// ����Ű ������ �õ���
		System.out.println("-------");
		s2.test("zzzz");				// zzzz
		System.out.println("-------");
										// ����Ű ������ �õ���
		// ������ �����ε� 
		Nike_Shoes1_Main1 s3 = new Nike_Shoes1_Main1("�Ź�", 265, 95000);
		s3.shoseInfo();
		
	}
}


















