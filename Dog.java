// A is a B : ��Ӱ���
// ���� ���� '�̴�.'
public class Dog extends Animal { // Animal Class�� ����� �޾ƿ�
	// Animal Class �ȿ� Dog Class�� '���'�Ǿ� �ִ� ����
	// ��� : inheritance 
	// Ȯ�� : extend -> �� ������ �� ����
	
	String inhabit;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	
	public Dog(String sort, int age, String inhabit) {
		super(sort, age);
		this.inhabit = inhabit;
	}


	// @xx : Annotation -> ��� ����� �ڵ����� �������ش�
	@Override //*****   -> ��� �޾ƿ� method�� ����� �ٲ��ִ� ��
		public void printInfo() {
			// override�� ����Ϸ��� 
			// 		��ӹ��� Class������ method��� ���ƾ���.
		super.printInfo(); // ���� Ŭ����.printInfo(); 
//								animal
		System.out.printf("������	: %s\n", inhabit);
		}
	// VS
	// ***Overloading (Override���� ����)
	//			method�� ���� �� ���� ����̶�� method���� ���� ��
	//			parameter�� �ڷ����� �ٸ��ų�, ������ �޶�� ��밡��
	
	
	
}
