
public class Animal {
	String sort;
	int age;
	
	//������ �ʱ�ȭ
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	//������ �����ε�
	public Animal(String sort, int age) {
		super();
		this.sort = sort;
		this.age = age;
	}
	// ���� ��� method
	public void printInfo() {
		System.out.printf("����	: %s\n", sort);
		System.out.printf("����	: %d\n", age);
	}
}
