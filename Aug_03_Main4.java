import java.util.Scanner;

public class Aug_03_Main4 {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.print("x : ");
		int x = enter.nextInt();
		// if �� �ȿ� ������ ����� ����Ǹ鼭 ����ؼ� int y�� �����ϰ� �� 	
		//						->	��ȿ�� (���� ����(�Ҵ�)�Ҽ� �ְ� �ؾ���)
		 
		if (x > 5) {
			int y = 10;
			System.out.println(y);
		} else if (x > 3) {
			int y = 20;
			System.out.println(y);
		}
		
		/*
		 * int z; => ���� ���� �ص� ��� ����
		 *(int z = 0;) �⺻���� ���س��� ������ main�Լ����� print ���� ����.
		 * if (x > 5) { 
		 * 		z = 10; 
		 * 		System.out.println(z); 
		 * 	} else if (x > 3) {
		 * 		 z = 20;
		 * 		System.out.println(z);
		 *  }
		 */
		//	���������
		// if �� �ٱ��� ������ �����ϰ� if�� �ȿ��� �� ������ ���� ���� �� �� �ְ� �ϴ°��� ȿ����
	 
		// �⺻���� ���� ������ ����Ϸ��� �ʱ�ȭ�� ���� �Ǿ�� ��� ���� (int z = 0;)
		
		
	}
}
