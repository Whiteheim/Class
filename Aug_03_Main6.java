import java.util.Scanner;

public class Aug_03_Main6 {
	// switch-case (ex : ���� ����)

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("���� �����?");
		String soldier = enter.next();

		switch (soldier) {
		case "�̺�":
			System.out.println("��ġ");
		case "�Ϻ�":
			System.out.println("�����");
		case "��":
			System.out.println("�Ʒ�");
		case "����":
			System.out.println("��");
			break;
		default:
			System.out.println("�ڳ� ���� ������ �Ƴ�?");
		}
	}
}
