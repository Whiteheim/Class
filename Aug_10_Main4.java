// ����� Class : ���α׷� ������ ���� main() method�� �����ϴ� ����
public class Aug_10_Main4 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.studentName = "ȫ�浿";
		s1.studentAdress = "������";
		System.out.println("s1�� Student ��ü�� ����");
		System.out.println(s1);
		s1.showStudentInfo();
		System.out.println("==========================");
		Student s2 = new Student();
		s2.studentName = "�ں���";
		s2.studentAdress = "������";
		System.out.println("s2�� Student ��ü�� ����");
		System.out.println(s2);
		s2.showStudentInfo();
	}
}
