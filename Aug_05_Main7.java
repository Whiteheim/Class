import java.util.Scanner;

// Java Part1 : �������� ���α׷��� (������� �� �Ἥ ����� �� ����)
//		Part2 : ��ü���� ���α׷���
// 		Part3 : ��Ÿ ���..(�ܺ� ���̺귯��)

// '�����ø��ǾƵ� ����'

public class Aug_05_Main7 {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		String job = null;
		 a : while (true) { // �ݺ����� �̸� ���̱� -> �ݺ��� �տ� [name :]
			 System.out.print("�Ŵ��� / ���� / �л� :  ");
			 job = enter.next();
			 System.out.println(job);
			switch (job) {
			case "�Ŵ���":
				System.out.println("�ý��� ����");
			case "����":
				System.out.println("�л�����");
			case "�л�":
				System.out.println("���� ���� ����");
				break;	// ������ ����� ���� (�� ���� switch)���� 
			case "��":
				break a; // break + �ݺ����� �̸��� ���̸� �ݺ����� ���ᰡ ��.
								
 
			}
		}
		
		bb : for (int i = 0; i < 3; i++) {
			aa : for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 3; j2++) {
					System.out.printf("%d %d %d\n", i, j, j2);
					if (i == 1) {
						System.out.println("�ߴ�");
						break; //j3 �ݺ����� ���߰� if�� �ۿ��� �� 100 ->110 ->120 ->200 ->201
						//break aa; //100 �� �ߴ��� ǥ��ǰ� �ٷ� 200���� �Ѿ
						//break bb; //100 �� �ߴ� ǥ�� �� ����
					}
				}
			}
		} 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
