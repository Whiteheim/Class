import java.util.Scanner;

public class Aug_03_Main5 {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.print("x : ");
		int number = enter.nextInt();
		
		//		System.out.println(number);
		
		// ���ǹ� : if, switch
		/*  switch-case �� ('sw' + �ڵ��ϼ�)
		 * 	switch �� : �� ������ Ư���� �� �̳� ���ڿ��� ��� ���
		 * 	 break; �� �̿��� �� ������ �����ϸ� switch���� �������� �� (���� ����)
		 */
		/*
		 * switch (���� or ��) { 
		 * 	case �� A:
		 * 		���� or ���� ���� A�� ��, �� case �� ����
		 * break; => �� 
		 *  case �� B:
		 * 		���� or ���� ���� B�� ��, �� case �� ����
		 * 	default: A/B���� ��� �������� ���� �� ���� (else���� ����) 
		 * break; 
		 * }
		 */	
		switch (number) {
		case 1: System.out.println("��");
			break;
		case 2: System.out.println("��");
			break;
		case 3: System.out.println("��");
			break;
		default: System.out.println("����...");
			break;
		}
	}
	
}
