// Candy has a Company : ������ (v) /������ ȸ�縦 ����
// Company has a Candy : ��ǰ /ȸ�簡 ���� ��ǰ
public class Candy {
	String name;
	String taste;
	Company brand;
	
	public Candy() {
		// TODO Auto-generated constructor stub
	}
	
	public Candy(String name, String taste) {
		super();
		this.name = name;
		this.taste = taste;
	}
	
	public void printInfo() {
		System.out.printf("��ǰ�� : %s\n",name);
		System.out.printf("�� : %s\n", taste);
	}
	
}
