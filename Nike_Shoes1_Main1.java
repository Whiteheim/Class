// ������ (Constructor)
// 		��ü�� ��������� �۾��� �ؾ���
// 			=> ������ �����
// 		������ �ƿ� ����, �޼ҵ���� Ŭ������� ���� �޼ҵ�
//		�����ڸ� ������ ������
// 			=> Java�� Compiler�� �⺻ �����ڸ� ��������.
//		�����ڸ� �ǵ��̸�
// 			=> Java�� Compiler�� �⺻ �����ڸ� �ȸ������
//			=> �ý����� �ڵ����� ��ü�� ����� �Ǹ� �⺻�����ڸ� ���
//				=> ����ڰ� �⺻�����ڸ� ����� �Ǹ� ���� �߻� ����



public class Nike_Shoes1_Main1 {
	String name;
	int size;
	int price;
	static String company = "����Ű"; // static final String company = "����Ű";
		
	public Nike_Shoes1_Main1() { // ������� �ڵ��ϼ�(ctrl + space)�� ������ �����ڰ� ����
		// TODO Auto-generated constructor stub
	}
	// ������ �����ε�(Ctrl + Shift + Space)
	// Window -> Preferences -> key �˻� -> gene �˻� -> Generate constructor using field -> binding -> ����Ű ����
	public Nike_Shoes1_Main1(String name, int size, int price) { 
		super(); // �����ִ� �⺻ �����ڸ� �ҷ���
		this.name = name;
		this.size = size;
		this.price = price;
	}
		
		public void shoseInfo() {
			System.out.printf("�𵨸� : %s\n", name);
			System.out.printf("������ : %d\n", size);
			System.out.printf("���� : %d\n", price);
			System.out.printf("�귣�� : %s\n",company);
			System.out.println("==========================");
		
	}
		public void test(String name) {
			// ��������� / �Ķ���͸��� ���ٸ�?
			//		this. �� ���̰� �Ǹ� ������ �������
			// 				�Ⱥ����� ���� �����̿� �ִ� ������ �ν�
			
			System.out.println(name);
			System.out.println(this.name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
