// function - Ŭ���� �ܺο� ���� ��
// ��ǻ� Java���� function �̶�� ���� ����.
// method - Class �ӿ� ���� �� (Class�� ���ӵ� �Լ�)

// Class : ��ü�� ���� Ʋ (ex : �ֹ�)
public class Bus {
	//������� (Member Variable) - �Ӽ� (= attribute, field, ��������)
	//							 - ��ü�� �����Ͱ� ����Ǵ� ����
	//							 - Class�� ���ԵǴ� ���� (Variable)
	
	// ���� ��ȣ
	int busNum;
	// ����
	String car;
	// ȸ���
	String company;
	// ������
	String driver;
	// �����
	String start;
	
	public void printInfo() { // function �� �ƴ� method��� �Ҹ�
		//this �� �ǹ� : �����θ� ��Ī. (���� ����, ��Ȯ�� �ϰ���� �� ���)
		System.out.println(this.busNum);
		System.out.println(this.car);
		System.out.println(this.company);
		System.out.println(this.driver);
		System.out.println(start);
	}
	
	
	
	// method(��� �޼ҵ�) - �׼�, ���α׷��� �ʿ��� ���
	//					   - ��ü�� ���ۿ� �ش��ϴ� ���� ���
	public void go() {
		// ��� - {}���� �κ� ��Ī
		System.out.println("�θ��θ�");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
