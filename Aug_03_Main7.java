import java.util.Scanner;

public class Aug_03_Main7 {
	public static void main(String[] args) {
		/* ������ ����
		 * DBA : ���� ������ ���̽� ������
		 * 	=> ���� ���� / ������ ���or���� / ��ɾ� Ȱ�� C/R/U/D / ���� Ȱ��
		 * 
		 * DBP : �����ͺ��̽� ���α׷���
		 * 	=> ��ɾ�� C/R/U/D / ���� Ȱ��
		 * 
		 * DBU : �����
		 *  => ���� Ȱ��
		 */
		
		Scanner enter = new Scanner(System.in);
		System.out.println("DBA? DBP? DBU?");
		String job = enter.next();
		System.out.printf("%s\n",job);
		
		switch (job) {
		case "DBA":
		case "dba":
			System.out.println("��������");
			System.out.println("���/����");
		case "DBP":
		case "dbp":
			System.out.println("��ɾ�� CRUD");
		case "DBU":
		case "dbu":
			System.out.println("����Ȱ��");
			break;
		default: System.out.println("����Ű���?");
			break;
		}
		
		
	}
}
