import java.util.Scanner;

public class Aug_05_Main6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println(i);
			System.out.println("�ȳ��ϼ���1");
		
		}
		System.out.println("==============");
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("wow");
			} else {
				//continue; -> �����ݺ� (�� ����) -> Ȧ �� �϶��� �����ϰ� ��������
				break;    //-> (������) �ݺ����� ����  
				//return;   -> (�������) �ݺ����� ���� // �Լ��� ���� �� �Լ��� ���ߴ� ��� 
				// 				�ݺ��������� ��� ����
			}
		}
		System.out.println("==============");
		Scanner enter = new Scanner(System.in);
	
		String a = null;
		while (true) {
			System.out.print("������ �Է��ϼ��� : ");
			a = enter.next();
			System.out.println(a);
			if (a.equals("����")) {
				break;
			}
		}
	
	
	
	
	
	}
}
