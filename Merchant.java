
public class Merchant {
	String name;
	Market m;
	public Merchant() {
		// TODO Auto-generated constructor stub
	}

	
	public Merchant(String name, Market m) {
		super();
		this.name = name;
		this.m = m;
	}


	public void printInfo() {
		System.out.printf("�̸�	: %s\n", name);
		System.out.println("�������忡 �λ��� ���� ����");
	}
}
