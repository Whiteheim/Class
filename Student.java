// ���̺귯���� Class (API : Application Program Interface)
//		: �ٸ� Class���� �̿��� ����
// ���α׷����� ����Ǵ� Class�� ������, �� �ϳ��� ������ ���� ���̺귯�������� ���
//		: ���ܵƴ� �ϳ��� Class�� ������� �� 
public class Student {
	
	// ������� (Member Variable) / �ʵ� (Field)
	// 			: ��ü�� �����Ͱ� ����Ǵ� ��
	// 			: ������ ����ϰ� �������� ������ �ƴ�
	// 				- ���� : ������, �޼ҵ� �� ������ ���
	// 						������, �޼ҵ尡 ������ ����Ǹ� ������ �ڵ����� ����
	// 				- �ʵ� : ������, �޼ҵ� ��ü���� ����� ����
	//				 		��ü�� �Ҹ� ���� �ʴ� ��, ��ü�� �Բ� �����ϰԵ�
	
	// �ʱⰪ�� �������� ���� ��������� ��ü ������ �ڵ����� �⺻ �ʱⰪ�� ����
	
	int studentId;
	String studentName;
	String studentAdress;
	
	// method (�޼ҵ�) : ��ü�� ���ۿ� �ش��ϴ� ���� ����
	//		- ���� (�߰�ȣ) : �̸� ���� ���� method�� (like ����)
	//		- �޼ҵ� ȣ�� ��, �޼ҵ� ���� ���� ��� �ڵ带 �ϰ������� ����
	//		- ��ü�� ������ ���� ����
	public void showStudentInfo() {
		System.out.println(studentName + " " + studentAdress);
	}
	
}